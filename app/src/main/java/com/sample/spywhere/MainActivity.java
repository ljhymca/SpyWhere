package com.sample.spywhere;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button MainBtn,SetBtn,DbBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainBtn = (Button)findViewById(R.id.MainBtn);
        SetBtn = (Button)findViewById(R.id.SetBtn);
        DbBtn = (Button)findViewById(R.id.DbBtn);

        MainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                SetLocation setlocationfragment = new SetLocation();

            }
        });
    }
}