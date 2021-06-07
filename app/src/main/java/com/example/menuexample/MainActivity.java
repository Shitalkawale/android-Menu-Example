package com.example.menuexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity=findViewById(R.id.mainactivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.black:
                activity.setBackgroundColor(Color.BLACK);
                Toast.makeText(getApplicationContext(), "select black", Toast.LENGTH_SHORT).show();
                break;

            case R.id.red:
                activity.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "select red", Toast.LENGTH_SHORT).show();
                break;

            case R.id.white:
                activity.setBackgroundColor(Color.WHITE);
                Toast.makeText(getApplicationContext(), "select white", Toast.LENGTH_SHORT).show();
                break;

            case R.id.yellow:
                activity.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(), "select yellow", Toast.LENGTH_SHORT).show();
                break;

            case R.id.blue:
                activity.setBackgroundColor(Color.BLUE);
                Toast.makeText(getApplicationContext(), "select blue", Toast.LENGTH_SHORT).show();
                break;

            case R.id.green:
                activity.setBackgroundColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), "select green", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}