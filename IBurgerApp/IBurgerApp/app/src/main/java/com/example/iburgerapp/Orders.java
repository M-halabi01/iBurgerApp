package com.example.iburgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Orders extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView drawer1, drawer2, back,check;
    TextView profileDrawer, burgerDrawer, snacksDrawer, ordersDrawer, locationsDrawer, logoutDrawer;


    TextView sPrice1, sPrice2, sPrice3, sPrice4, sPrice5, sPrice6,
            bPrice1, bPrice2, bPrice3, bPrice4, bPrice5, bPrice6;
    TextView sQuantity1, sQuantity2, sQuantity3, sQuantity4, sQuantity5, sQuantity6,
            bQuantity1, bQuantity2, bQuantity3, bQuantity4, bQuantity5, bQuantity6;
    ImageView sPlus1, sPlus2, sPlus3, sPlus4, sPlus5, sPlus6,
            bPlus1, bPlus2, bPlus3, bPlus4, bPlus5, bPlus6;
    ImageView sMinus1, sMinus2, sMinus3, sMinus4, sMinus5, sMinus6,
            bMinus1, bMinus2, bMinus3, bMinus4, bMinus5, bMinus6;

    int sq1=0, sq2 = 0, sq3 = 0, sq4 = 0, sq5 = 0, sq6 = 0,
            bq1 = 0, bq2 = 0, bq3 = 0, bq4 = 0, bq5 = 0, bq6 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);


        sPrice1 = findViewById(R.id.sPrice1);
        sPrice2 = findViewById(R.id.sPrice2);
        sPrice3 = findViewById(R.id.sPrice3);
        sPrice4 = findViewById(R.id.sPrice4);
        sPrice5 = findViewById(R.id.sPrice5);
        sPrice6 = findViewById(R.id.sPrice6);

        bPrice1 = findViewById(R.id.bPrice1);
        bPrice2 = findViewById(R.id.bPrice2);
        bPrice3 = findViewById(R.id.bPrice3);
        bPrice4 = findViewById(R.id.bPrice4);
        bPrice5 = findViewById(R.id.bPrice5);
        bPrice6 = findViewById(R.id.bPrice6);

        sQuantity1 = findViewById(R.id.sQuantity1);
        sQuantity2 = findViewById(R.id.sQuantity2);
        sQuantity3 = findViewById(R.id.sQuantity3);
        sQuantity4 = findViewById(R.id.sQuantity4);
        sQuantity5 = findViewById(R.id.sQuantity5);
        sQuantity6 = findViewById(R.id.sQuantity6);

        bQuantity1 = findViewById(R.id.bQuantity1);
        bQuantity2 = findViewById(R.id.bQuantity2);
        bQuantity3 = findViewById(R.id.bQuantity3);
        bQuantity4 = findViewById(R.id.bQuantity4);
        bQuantity5 = findViewById(R.id.bQuantity5);
        bQuantity6 = findViewById(R.id.bQuantity6);

        sPlus1 = findViewById(R.id.sPlus1);
        sPlus2 = findViewById(R.id.sPlus2);
        sPlus3 = findViewById(R.id.sPlus3);
        sPlus4 = findViewById(R.id.sPlus4);
        sPlus5 = findViewById(R.id.sPlus5);
        sPlus6 = findViewById(R.id.sPlus6);

        bPlus1 = findViewById(R.id.bPlus1);
        bPlus2 = findViewById(R.id.bPlus2);
        bPlus3 = findViewById(R.id.bPlus3);
        bPlus4 = findViewById(R.id.bPlus4);
        bPlus5 = findViewById(R.id.bPlus5);
        bPlus6 = findViewById(R.id.bPlus6);

        sMinus1 = findViewById(R.id.sMinus1);
        sMinus2 = findViewById(R.id.sMinus2);
        sMinus3 = findViewById(R.id.sMinus3);
        sMinus4 = findViewById(R.id.sMinus4);
        sMinus5 = findViewById(R.id.sMinus5);
        sMinus6 = findViewById(R.id.sMinus6);

        bMinus1 = findViewById(R.id.bMinus1);
        bMinus2 = findViewById(R.id.bMinus2);
        bMinus3 = findViewById(R.id.bMinus3);
        bMinus4 = findViewById(R.id.bMinus4);
        bMinus5 = findViewById(R.id.bMinus5);
        bMinus6 = findViewById(R.id.bMinus6);

        profileDrawer = findViewById(R.id.profileDrawer);
        burgerDrawer = findViewById(R.id.burgerDrawer);
        snacksDrawer = findViewById(R.id.snacksDrawer);
        ordersDrawer = findViewById(R.id.ordersDrawer);
        locationsDrawer=findViewById(R.id.locationsDrawer);
        logoutDrawer=findViewById(R.id.logoutDrawer);
        drawerLayout = findViewById(R.id.drawer_layout);
        back = findViewById(R.id.back);
        check=findViewById(R.id.check);
        drawer1 = findViewById(R.id.drawer1);
        drawer2 = findViewById(R.id.drawer2);

        profileDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Orders.this, Profile.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        burgerDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Orders.this, Burger.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        snacksDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Orders.this, Snacks.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        ordersDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(Gravity.RIGHT);
            }
        });
        locationsDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Orders.this,RestLocations.class);
                drawerLayout.closeDrawer(Gravity.RIGHT);
                startActivity(intent);
            }
        });
        logoutDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Orders.this,Login.class);
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
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalPrice=(Integer.parseInt(sQuantity1.getText().toString())*5)
                        +(Integer.parseInt(sQuantity2.getText().toString())*5)
                        +(Integer.parseInt(sQuantity3.getText().toString())*5)
                        +(Integer.parseInt(sQuantity4.getText().toString())*5)
                        +(Integer.parseInt(sQuantity5.getText().toString())*5)
                        +(Integer.parseInt(sQuantity6.getText().toString())*5)
                        +(Integer.parseInt(bQuantity1.getText().toString())*5)
                        +(Integer.parseInt(bQuantity2.getText().toString())*5)
                        +(Integer.parseInt(bQuantity3.getText().toString())*5)
                        +(Integer.parseInt(bQuantity4.getText().toString())*5)
                        +(Integer.parseInt(bQuantity5.getText().toString())*5)
                        +(Integer.parseInt(bQuantity6.getText().toString())*5);
                Intent intent=new Intent(Orders.this,Check.class);
                System.out.println(totalPrice);
                intent.putExtra("totalPrice",totalPrice);
                startActivity(intent);
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

        sPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq1 = sq1 + 1;
                sQuantity1.setText("" + sq1);
            }
        });
        sPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq2 = sq2 + 1;
                sQuantity2.setText("" + sq2);
            }
        });
        sPlus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq3 = sq3 + 1;
                sQuantity3.setText("" + sq3);
            }
        });
        sPlus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq4 = sq4 + 1;
                sQuantity4.setText("" + sq4);
            }
        });
        sPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq5 = sq5 + 1;
                sQuantity5.setText("" + sq5);
            }
        });
        sPlus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq6 = sq6 + 1;
                sQuantity6.setText("" + sq6);
            }
        });

        bPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq1 = bq1 + 1;
                bQuantity1.setText("" + bq1);
            }
        });
        bPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq2 = bq2 + 1;
                bQuantity2.setText("" + bq2);
            }
        });
        bPlus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq3 = bq3 + 1;
                bQuantity3.setText("" + bq3);
            }
        });
        bPlus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq4 = bq4 + 1;
                bQuantity4.setText("" + bq4);
            }
        });
        bPlus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq5 = bq5 + 1;
                bQuantity5.setText("" + bq5);
            }
        });
        bPlus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq6 = bq6 + 1;
                bQuantity6.setText("" + bq6);
            }
        });

        sMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq1 = sq1 - 1;
                if (sq1 < 0) sq1 = 0;
                sQuantity1.setText("" + sq1);
            }
        });
        sMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq2 = sq2 - 1;
                if (sq2 < 0) sq2 = 0;
                sQuantity2.setText("" + sq2);
            }
        });
        sMinus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq3 = sq3 - 1;
                if (sq3 < 0) sq3 = 0;
                sQuantity3.setText("" + sq3);
            }
        });
        sMinus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq4 = sq4 - 1;
                if (sq4 < 0) sq4 = 0;
                sQuantity4.setText("" + sq4);
            }
        });
        sMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq5 = sq5 - 1;
                if (sq5 < 0) sq5 = 0;
                sQuantity5.setText("" + sq5);
            }
        });
        sMinus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sq6 = sq6 - 1;
                if (sq6 < 0) sq6 = 0;
                sQuantity6.setText("" + sq6);
            }
        });

        bMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq1 = bq1 - 1;
                if (bq1 < 0) bq1 = 0;
                bQuantity1.setText("" + bq1);
            }
        });
        bMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq2 = bq2 - 1;
                if (bq2 < 0) bq2 = 0;
                bQuantity2.setText("" + bq2);
            }
        });
        bMinus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq3 = bq3 - 1;
                if (bq3 < 0) bq3 = 0;
                bQuantity3.setText("" + bq3);
            }
        });
        bMinus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq4 = bq4 - 1;
                if (bq4 < 0) bq4 = 0;
                bQuantity4.setText("" + bq4);
            }
        });
        bMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq5 = bq5 - 1;
                if (bq5 < 0) bq5 = 0;
                bQuantity5.setText("" + bq5);
            }
        });
        bMinus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bq6 = bq6 - 1;
                if (bq6 < 0) bq6 = 0;
                bQuantity6.setText("" + bq6);
            }
        });
    }
}