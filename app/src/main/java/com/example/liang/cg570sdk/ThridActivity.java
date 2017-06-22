package com.example.liang.cg570sdk;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liang on 2017/6/22.
 */

public class ThridActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "sadasdfa", Toast.LENGTH_SHORT).show();
        setContentView(new TextView(ThridActivity.this));
    }
}
