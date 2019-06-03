package com.navin.learncode.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.navin.learncode.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DescriptionActivity extends AppCompatActivity {
    Bundle bundle;
    String title,description;
    @BindView(R.id.title)
    AppCompatTextView titleTxt;
    @BindView(R.id.description)
    AppCompatTextView descriptionTxt;
    @BindView(R.id.img)
    AppCompatImageView imageView;
    @BindView(R.id.rel1)
    RelativeLayout relativeLayout;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        ButterKnife.bind(this);
        bundle=getIntent().getExtras();
        title=bundle.getString("title");
        description=bundle.getString("description");
        titleTxt.setText(title);
        descriptionTxt.setText(Html.fromHtml(description));
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        /////////////////////////////
        MobileAds.initialize(this, "ca-app-pub-5166147620362120~4405955855");
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.SMART_BANNER);
        adView.setAdUnitId("ca-app-pub-5166147620362120/1039703710");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Log.e("","");
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                Log.e("","");
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                Log.e("","");
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                Log.e("","");
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                Log.e("","");
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                Log.e("","");
                // to the app after tapping on an ad.
            }
        });
    }
}
