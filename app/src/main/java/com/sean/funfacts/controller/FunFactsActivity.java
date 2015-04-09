package com.sean.funfacts.controller;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sean.funfacts.R;
import com.sean.funfacts.model.MasterDataObject;


public class FunFactsActivity extends ActionBarActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private int mColor = Color.parseColor("#51b46d");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        final RelativeLayout factsLayout = (RelativeLayout) findViewById(R.id.factLayout);
        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        final Button showFactButton = (Button)findViewById(R.id.showFactButton);
        final MasterDataObject mMasterDataObject = new MasterDataObject();

        if (savedInstanceState != null){
            mColor = savedInstanceState.getInt("color");
            factsLayout.setBackgroundColor(mColor);
            showFactButton.setTextColor(mColor);
        }

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connMgr = (ConnectivityManager)
                        getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
                if (networkInfo != null && networkInfo.isConnected()) {
                     factLabel.setText(mMasterDataObject.getFact());
                     mColor = mMasterDataObject.getColor();
                     factsLayout.setBackgroundColor(mColor);
                     showFactButton.setTextColor(mColor);

                } else {
                     factLabel.setText("0 is the number of facts we can get you without a " +
                             "network connection!");
                }
            }
        });
        Log.i(TAG, "Activity Started");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("color", mColor);
    }
}
