package com.techinfo.mymoviecatalog;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Movie(),"Movie");
        adapter.addFragment(new TvShowFragment(),"Tv Show");
        
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
