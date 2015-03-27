package com.sean.funfacts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends ActionBarActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare view variables
        final RelativeLayout factsLayout = (RelativeLayout) findViewById(R.id.factLayout);
        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        final Button showFactButton = (Button)findViewById(R.id.showFactButton);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorWheel mColorWheel = new ColorWheel();
                int color = mColorWheel.getColor();
                factsLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                FactBook facts = new FactBook();
                factLabel.setText(facts.getFact());
            }
        });
        //Toast.makeText(this, "Toast example", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Activity Started");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
