package com.darklod.getimage;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView immg = findViewById(R.id.imagevieew);
        Uri uri = (Uri) getIntent().getExtras().get("uri");

        Picasso.get().load(uri).resize(400, 400).into(immg);
    }
}
