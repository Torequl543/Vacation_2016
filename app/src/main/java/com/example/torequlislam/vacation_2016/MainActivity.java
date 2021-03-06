package com.example.torequlislam.vacation_2016;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new JanuaryFragment(), "January");
        adapter.addFragment(new FebruaryFragment(), "February");
        adapter.addFragment(new MarchFragment(), "March");
        adapter.addFragment(new AprilFragment(), "April");
        adapter.addFragment(new MayFragment(), "May");
        adapter.addFragment(new JuneFragment(), "June");
        adapter.addFragment(new JulyFragment(), "July");
        adapter.addFragment(new AugustFragment(), "August");
        adapter.addFragment(new SeptemberFragment(), "September");
        adapter.addFragment(new OctoberFragment(), "October");
        adapter.addFragment(new NovemberFragment(), "November");
        adapter.addFragment(new DecemberFragment(), "December");


        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<android.support.v4.app.Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        public void addFragment(android.support.v4.app.Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        /*if (id == R.id.nav_january) {
            // Handle the camera action
           //fragmentManager.beginTransaction().replace(R.id.frame_layout,
            //        new JanuaryFragment()).commit();
            //Intent intent =new Intent(MainActivity.this,ViewActivity.class);
            //startActivity(intent);
        } else if (id == R.id.nav_february) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new FebruaryFragment()).commit();

        } else if (id == R.id.nav_march) {
            //fragmentManager.beginTransaction().replace(R.id.frame_layout,
                   // new MarchFragment()).commit();

        } else if (id == R.id.nav_april) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new AprilFragment()).commit();

        } else if (id == R.id.nav_may) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new MayFragment()).commit();

        } else if (id == R.id.nav_june) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new JuneFragment()).commit();
        }
        else if (id == R.id.nav_july) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new JulyFragment()).commit();

        }
        else if (id == R.id.nav_august) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new AugustFragment()).commit();

        }
        else if (id == R.id.nav_september) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new SeptemberFragment()).commit();
        }

        else if (id == R.id.nav_october) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new OctoberFragment()).commit();
        }
        else if (id == R.id.nav_november) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new NovemberFragment()).commit();
        }
        else if (id == R.id.nav_december) {
            fragmentManager.beginTransaction().replace(R.id.frame_layout,
                    new DecemberFragment()).commit();

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
