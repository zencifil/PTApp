package com.ipsos.savascilve.ptapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FamDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_detail);

        TextView famCode = (TextView)findViewById(R.id.famDetailFamCode);
        famCode.setText(getIntent().getStringExtra(MainActivity.EXTRA_FAMCODE) + " - " + getIntent().getStringExtra(MainActivity.EXTRA_FAMNAME));
    }
}
