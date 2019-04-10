package com.uama.jams;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import com.uama.zxing.CaptureBaseActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tx_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CaptureActivity.class));
            }
        });
    }

}
