package com.darklod.getimage;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView immg = findViewById(R.id.immmg);
        Uri uri = (Uri) getIntent().getExtras().get("uri");

        Picasso.get().load(uri).resize(100, 100).into(immg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView immg = findViewById(R.id.immmg);
        immg.setImageURI((Uri) getIntent().getExtras().get("uri"));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ImageView immg = findViewById(R.id.immmg);
        immg.setImageURI((Uri) getIntent().getExtras().get("uri"));
    }
}
