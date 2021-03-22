package com.example.pulldown_icon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.about:
                Toast.makeText(this, "Versi yang kamu pakai sudah dalam versi terbaru", Toast.LENGTH_SHORT).show();

            case R.id.setting:
                Toast.makeText(this, "Anda akan masuk ke dalam menu setting", Toast.LENGTH_SHORT).show();

            case R.id.keranjang:
                Toast.makeText(this, "Silahkan menambahkan item yang akan dibeli", Toast.LENGTH_SHORT).show();
        }
    }
}