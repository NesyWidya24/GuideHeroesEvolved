package com.kagu.guideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class GameplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
    }

    public void instal(View view) {
        Uri uri =Uri.parse("https://play.google.com/store/apps/details?id=com.rsg.heroesevolved");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void readitem1(View view) {
        Intent intent = new Intent(GameplayActivity.this, GP1Activity.class);
        startActivity(intent);
    }

    public void readitem2(View view) {
        Intent intent = new Intent(GameplayActivity.this, GP2Activity.class);
        startActivity(intent);
    }

    public void readitem3(View view) {
        Intent intent = new Intent(GameplayActivity.this, GP3Activity.class);
        startActivity(intent);
    }

    public void readitem4(View view) {
        Intent intent = new Intent(GameplayActivity.this, GP4Activity.class);
        startActivity(intent);
    }
}