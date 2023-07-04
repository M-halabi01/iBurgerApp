package com.example.iburgerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Profile extends AppCompatActivity {

    TextView save, locationText;
    EditText password, rePassword;
    DrawerLayout drawerLayout;
    ImageView drawer1, drawer2, back;
    TextView profileDrawer, burgerDrawer, snacksDrawer, ordersDrawer, locationsDrawer, logoutDrawer;

    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        drawerLayout = findViewById(R.id.drawer_layout);
        profileDrawer = findViewById(R.id.profileDrawer);
        burgerDrawer = findViewById(R.id.burgerDrawer);
        snacksDrawer=findViewById(R.id.snacksDrawer);
        ordersDrawer=findViewById(R.id.ordersDrawer);
        locationsDrawer=findViewById(R.id.locationsDrawer);
        logoutDrawer=findViewById(R.id.logoutDrawer);
        drawer1 = findViewById(R.id.drawer1);
        drawer2 = findViewById(R.id.drawer2);
        save = findViewById(R.id.save);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.rePassword);
        locationText = findViewById(R.id.location);
        back = findViewById(R.id.back);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        locationText.setOnClickListener(v -> getLastLocation());

        save.setOnClickListener(v -> {
            String inputPass = password.getText().toString();
            String inputRePassword = rePassword.getText().toString();
            if (inputRePassword.equals(inputPass)) {
                Toast.makeText(Profile.this, "Profile information saved", Toast.LENGTH_SHORT).show();
                finish();
            } else {
                Toast.makeText(Profile.this, "Please re-enter the same password!", Toast.LENGTH_SHORT).show();
            }
        });
        drawer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
            }
        });
        drawer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(Gravity.RIGHT);
            }
        });

        profileDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(Gravity.RIGHT);
            }
        });
        burgerDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Burger.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        snacksDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Snacks.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        ordersDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Orders.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        locationsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,RestLocations.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        logoutDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Profile.this,Login.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void getLastLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            fusedLocationProviderClient.getLastLocation()
                    .addOnSuccessListener(location -> {
                        if (location != null) {
                            Geocoder geocoder = new Geocoder(Profile.this, Locale.getDefault());
                            List<Address> addresses;
                            try {
                                addresses = geocoder.getFromLocation(location.getLatitude()
                                        , location.getLongitude(), 1);
                                locationText.setText(Html.fromHtml(
                                        "<font color='#6200EE'><b>Address :</b><br></font>"
                                                + addresses.get(0).getAddressLine(0)
                                ));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    });

        } else {
            askPermission();
        }
    }

    private void askPermission() {
        ActivityCompat.requestPermissions(Profile.this, new String[]
                {Manifest.permission.ACCESS_FINE_LOCATION}, 100);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == 100) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLastLocation();
            } else {
                Toast.makeText(this, "Required Permission", Toast.LENGTH_SHORT).show();
            }
        }


        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}