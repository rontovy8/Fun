package com.example.ronto.fun;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener()
    {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            switch (item.getItemId())
            {
                case R.id.navigation_home:
                    mTextMessage.setText("תמר די");
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText("נו תמר מספיק");
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText("נו תמררררר");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

        // Inflate your custom layout
        final ViewGroup actionBarLayout = (ViewGroup) getLayoutInflater().inflate(
                R.layout.action_bar_layout, null);

        // Set up your ActionBar
        final ActionBar actionBar = getActionBar();
        actionBar.setCustomView(actionBarLayout);

        // You customization;
        actionBar.setBackgroundDrawable(getDrawable(R.drawable.gradi));

        final Button actionBarTitle = (Button) findViewById(R.id.action_bar_title);
        actionBarTitle.setText(getString(R.string.app_name));

    }

}
