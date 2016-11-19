package com.example.ibrah.guild;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AnaSayfa extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener,GuildFragment.OnFragmentInteractionListener
,ArkadaslarFragment.OnFragmentInteractionListener,ProfilFragment.OnFragmentInteractionListener{

    Toolbar toolbar;
    TabLayout tabLayout ;
    ViewPager viewPager;
    ViewPagerAdaptır viewPagerAdaptır ;
    //test change
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        toolbar = (Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        viewPagerAdaptır = new ViewPagerAdaptır(getSupportFragmentManager());
        viewPagerAdaptır.addFragments(new HomeFragment(),"Ana Sayfa");
        viewPagerAdaptır.addFragments(new GuildFragment(),"Guild");
        viewPagerAdaptır.addFragments(new ArkadaslarFragment(),"Arkadaslar");
        viewPagerAdaptır.addFragments(new ProfilFragment(),"Profil");

        viewPager.setAdapter(viewPagerAdaptır);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
