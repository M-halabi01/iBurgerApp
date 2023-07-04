package com.example.iburgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ConfirmOrder extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView drawer1, drawer2, back;
    TextView profileDrawer, burgerDrawer, snacksDrawer, ordersDrawer, locationsDrawer, logoutDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        profileDrawer = findViewById(R.id.profileDrawer);
        burgerDrawer = findViewById(R.id.burgerDrawer);
        snacksDrawer = findViewById(R.id.snacksDrawer);
        ordersDrawer = findViewById(R.id.ordersDrawer);
        locationsDrawer=findViewById(R.id.locationsDrawer);
        logoutDrawer=findViewById(R.id.logoutDrawer);
        drawerLayout = findViewById(R.id.drawer_layout);
        back = findViewById(R.id.back);
        drawer1 = findViewById(R.id.drawer1);
        drawer2 = findViewById(R.id.drawer2);

        profileDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmOrder.this, Profile.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
            }
        });
        burgerDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmOrder.this, Burger.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
            }
        });
        snacksDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmOrder.this, Snacks.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
            }
        });
        ordersDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmOrder.this, Orders.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
            }
        });
        locationsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ConfirmOrder.this,RestLocations.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
                finish();
            }
        });
        logoutDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ConfirmOrder.this,Login.class);
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