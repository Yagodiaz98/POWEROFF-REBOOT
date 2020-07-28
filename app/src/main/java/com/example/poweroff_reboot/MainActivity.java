package com.example.poweroff_reboot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void powerOff(View vista){
        try {
            Process proc = Runtime.getRuntime() .exec(new String[]{ "su", "-c", "reboot -p" }); proc.waitFor();
        } catch (Exception ex) { ex.printStackTrace();
        }

    }
}