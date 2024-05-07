package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageLink = "https://i5.walmartimages.com/seo/Nobleworks-Holy-Cow-Holy-Mackerel-Randy-McIlwaine-Humorous-Funny-Christmas-Card_60d713e0-8052-4199-9866-032437fc67cb.6a306c8ece31f61aa16b26c8d8548238.jpeg";

        ImageView web = findViewById(R.id.webImage);
        Picasso.get().load(imageLink).into(web);

    }
}
