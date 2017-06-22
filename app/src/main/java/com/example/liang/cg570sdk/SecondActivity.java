package com.example.liang.cg570sdk;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liang on 2017/6/22.
 */

public class SecondActivity extends AppCompatActivity {

    private Context context;
    private TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv = new TextView(this);
        tv.setText("adsaopfjsafsfjsofjsdfmsdmf");
        setContentView(tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "s玩儿挖矿对话框", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
