package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class deadnettle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deadnettle);
    }
    public void goOnline (View view){
        Uri website = Uri.parse("https://en.wikipedia.org/wiki/Lamium");
        Intent webpage = new Intent(Intent.ACTION_VIEW,website);
        startActivity(webpage);
    }
}