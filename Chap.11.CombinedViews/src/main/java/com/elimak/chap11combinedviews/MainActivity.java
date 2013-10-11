package com.elimak.chap11combinedviews;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewGroup rootLayer = (ViewGroup) findViewById(R.id.root);

        final PropertyTestUtils ptu = new PropertyTestUtils(1);
        for(int i=0; i<3;i++){
            final Property property = ptu.getNewProperty();
            final PropertyView propertyView = new PropertyView(this);
            propertyView.setProperty(property);
            propertyView.setBackgroundResource(R.drawable.gradient);
            rootLayer.addView(propertyView);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
