package com.example.android.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    // This is for the restaurants web page 123
    public void restaurants(View view){
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.com/Restaurants-g35805-Chicago_Illinois"));
        startActivity(browserIntent);

    }
    public void hotels(View view) {
        Intent browserIntentH = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.com/Chicago-Hotels.d178248.Travel-Guide-Hotels"));
        startActivity(browserIntentH);
    }
    // Ideally we would like another landing page when clicking this, so that it gives a filtered search result for movies, sports events etc
    public void entertainment (View view) {
        Intent browserIntentE = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ticketmaster.com/Chicago-tickets/artist/734746"));
        startActivity(browserIntentE);
    }
    public void facebook (View view) {
        Intent browserIntentF = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.messenger.com/t/619313308261859/"));
        startActivity(browserIntentF);
    }


}
