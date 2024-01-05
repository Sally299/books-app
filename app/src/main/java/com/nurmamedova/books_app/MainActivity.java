package com.nurmamedova.books_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add("Vertical");
        menu.add("Horizontal");
        menu.add("System");
        menu.add("Make text larger");
        menu.add("Make text smaller");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final int id = item.getItemId();
        if (id == R.id.theme) {
            onThemeClick(item);
            return true;
        } else if (id == R.id.vertical_orientation || id == R.id.system_orientation) {
            onVerticalOrientationClick(item);
            return true;
        } else if (id == R.id.horizontal_orientation) {
            onHorizontalOrientationClick(item);
            return true;
        } else if (id == R.id.font_magnification) {
            onFontMagnificationClick(item);
            return true;
        } else if (id == R.id.font_reduction) {
            onFontReductionClick(item);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void onThemeClick(MenuItem item) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

    }

    public void onVerticalOrientationClick(MenuItem item) {
    }

    public void onHorizontalOrientationClick(MenuItem item) {

    }

    public void onFontMagnificationClick(MenuItem item) {

    }

    public void onFontReductionClick(MenuItem item) {

    }

}