package com.example.iburgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Snacks extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView drawer1, drawer2, back;
    TextView profileDrawer, burgerDrawer, snacksDrawer, ordersDrawer, locationsDrawer, logoutDrawer;

    int q1 = 0, q2 = 0, q3 = 0, q4 = 0, q5 = 0, q6 = 0;
    ImageView plus1, plus2, plus3, plus4, plus5, plus6,
            minus1, minus2, minus3, minus4, minus5, minus6;
    TextView quantity1, quantity2, quantity3, quantity4, quantity5, quantity6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        plus1 = findViewById(R.id.plus1);
        plus2 = findViewById(R.id.plus2);
        plus3 = findViewById(R.id.plus3);
        plus4 = findViewById(R.id.plus4);
        plus5 = findViewById(R.id.plus5);
        plus6 = findViewById(R.id.plus6);

        minus1 = findViewById(R.id.minus1);
        minus2 = findViewById(R.id.minus2);
        minus3 = findViewById(R.id.minus3);
        minus4 = findViewById(R.id.minus4);
        minus5 = findViewById(R.id.minus5);
        minus6 = findViewById(R.id.minus6);

        quantity1 = findViewById(R.id.quantity1);
        quantity2 = findViewById(R.id.quantity2);
        quantity3 = findViewById(R.id.quantity3);
        quantity4 = findViewById(R.id.quantity4);
        quantity5 = findViewById(R.id.quantity5);
        quantity6 = findViewById(R.id.quantity6);

        profileDrawer = findViewById(R.id.profileDrawer);
        burgerDrawer = findViewById(R.id.burgerDrawer);
        snacksDrawer = findViewById(R.id.snacksDrawer);
        ordersDrawer = findViewById(R.id.ordersDrawer);
        drawerLayout = findViewById(R.id.drawer_layout);
        locationsDrawer=findViewById(R.id.locationsDrawer);
        logoutDrawer=findViewById(R.id.logoutDrawer);
        back = findViewById(R.id.back);
        drawer1 = findViewById(R.id.drawer1);
        drawer2 = findViewById(R.id.drawer2);

        profileDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Profile.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        burgerDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Burger.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        snacksDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(Gravity.RIGHT);
            }
        });
        ordersDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Orders.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        locationsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Snacks.this,RestLocations.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        logoutDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Snacks.this,Login.class);
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

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1 = q1 + 1;
                quantity1.setText("" + q1);
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1 = q1 - 1;
                if (q1 < 0) q1 = 0;
                quantity1.setText("" + q1);
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2 = q2 + 1;
                quantity2.setText("" + q2);
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2 = q2 - 1;
                if (q2 < 0) q2 = 0;
                quantity2.setText("" + q2);
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3 = q3 + 1;
                quantity3.setText("" + q3);
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q3 = q3 - 1;
                if (q3 < 0) q3 = 0;
                quantity3.setText("" + q3);
            }
        });

        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4 = q4 + 1;
                quantity4.setText("" + q4);
            }
        });
        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q4 = q4 - 1;
                if (q4 < 0) q4 = 0;
                quantity4.setText("" + q4);
            }
        });

        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5 = q5 + 1;
                quantity5.setText("" + q5);
            }
        });
        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q5 = q5 - 1;
                if (q5 < 0) q5 = 0;
                quantity5.setText("" + q5);
            }
        });

        plus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q6 = q6 + 1;
                quantity6.setText("" + q6);
            }
        });
        minus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q6 = q6 - 1;
                if (q6 < 0) q6 = 0;
                quantity6.setText("" + q6);
            }
        });
    }
}