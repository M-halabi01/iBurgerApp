package com.example.iburgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    LinearLayout burgerSection, snackSection;
    DrawerLayout drawerLayout;
    ImageView drawer1, drawer2;
    TextView profileDrawer, burgerDrawer, snacksDrawer, ordersDrawer, locationsDrawer, logoutDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        burgerSection = findViewById(R.id.burgerSection);
        snackSection = findViewById(R.id.snackSection);

        profileDrawer = findViewById(R.id.profileDrawer);
        burgerDrawer = findViewById(R.id.burgerDrawer);
        snacksDrawer = findViewById(R.id.snacksDrawer);
        ordersDrawer=findViewById(R.id.ordersDrawer);
        locationsDrawer=findViewById(R.id.locationsDrawer);
        logoutDrawer=findViewById(R.id.logoutDrawer);

        drawerLayout = findViewById(R.id.drawer_layout);
        drawer1 = findViewById(R.id.drawer1);
        drawer2 = findViewById(R.id.drawer2);

        profileDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Profile.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });

        burgerDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Burger.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        burgerSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Burger.class);
                startActivity(intent);
            }
        });

        snacksDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Snacks.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        snackSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Snacks.class);
                startActivity(intent);
            }
        });

        ordersDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Orders.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });

        locationsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,RestLocations.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });

        logoutDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this,Login.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
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
    }

}