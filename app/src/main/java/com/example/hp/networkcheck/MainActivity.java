package com.example.hp.networkcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetworkCheck networkCheck = null;

        if (networkCheck.getInstance(this).NetworkCheckByType()) {
          Toast.makeText(this,"You are online!!!!",8000).show();
        } else {
       Toast.makeText(this,"You are not online!!!!",8000).show();
        }

    }
}
