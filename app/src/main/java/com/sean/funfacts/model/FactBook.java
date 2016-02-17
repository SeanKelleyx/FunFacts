package com.sean.funfacts.model;

import com.sean.funfacts.R;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by snkelley on 3/27/2015.
 *
 */
public class FactBook {
    private String mFact = "";
    private String mStringUrl = "http://numbersapi.com/random/trivia";
    public FactBook(){
        updateFact();
    }

    public void updateFact(){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(mStringUrl)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //do failure stuff
                mFact = String.valueOf(R.string.no_network_string);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                mFact = response.body().string();
            }
        });

    }

    public String getFact(){
        String returnFact = mFact;
        updateFact();
        return returnFact;
    }
}
