package com.sulisach.resepmasakansulis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button peceol_btn = (Button)findViewById(R.id.btnPecel);
        Button pepes_btn = (Button)findViewById(R.id.btnPepes);
        Button pindand_btn = (Button)findViewById(R.id.btnPindang);
        Button sate_jamur_btn = (Button)findViewById(R.id.btnSateJamur);

        peceol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SotoActivity.class);
                startActivity(intent);
            }
        });

        pepes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, BaksoActivity.class);
                startActivity(intent);
            }
        });

        pindand_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, RendangActivity.class);
                startActivity(intent);
            }
        });

        sate_jamur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(DashboardActivity.this, NasgorActivity.class);
                startActivity(intent);
            }
        });
    }
}
