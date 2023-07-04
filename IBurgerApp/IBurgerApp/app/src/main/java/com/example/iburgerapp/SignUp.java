package com.example.iburgerapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class SignUp extends AppCompatActivity {

    TextView signUp, locationText;
    EditText password, rePassword;

    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUp = findViewById(R.id.signUp);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.rePassword);
        locationText = findViewById(R.id.location);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        locationText.setOnClickListener(v -> getLastLocation());

        signUp.setOnClickListener(v -> {
            String inputPass=password.getText().toString();
            String inputRePassword=rePassword.getText().toString();
            if(inputRePassword.equals(inputPass)){
                Intent intent=new Intent(SignUp.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
            else{
                Toast.makeText(SignUp.this, "Please re-enter the same password!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getLastLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            fusedLocationProviderClient.getLastLocation()
                    .addOnSuccessListener(location -> {
                        if(location!=null){
                            Geocoder geocoder=new Geocoder(SignUp.this,Locale.getDefault());
                            List<Address> addresses;
                            try {
                                addresses = geocoder.getFromLocation(location.getLatitude()
                                        ,location.getLongitude(),1);
                                locationText.setText(Html.fromHtml(
                                        "<font color='#6200EE'><b>Address :</b><br></font>"
                                        +addresses.get(0).getAddressLine(0)
                                ));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    });

        }else{
            askPermission();
        }
    }

    private void askPermission() {
        ActivityCompat.requestPermissions(SignUp.this,new String[]
                {Manifest.permission.ACCESS_FINE_LOCATION},100);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==100){
            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                getLastLocation();
            }
            else {
                Toast.makeText(this, "Required Permission", Toast.LENGTH_SHORT).show();
            }
        }


        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}