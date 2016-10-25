package com.example.william.learnenglish;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.william.learnenglish.Login.FragmentLogin;
import com.example.william.learnenglish.Niveles.PrimerNivel;
import com.example.william.learnenglish.Niveles.SegundoNivel;
import com.example.william.learnenglish.Niveles.TercerNivel;
import com.orm.SugarContext;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SugarContext.init(MainActivity.this);

        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction tx1;
        Fragment fragment1 = new FragmentMapa();
        tx1 = fm1.beginTransaction();
        tx1.replace(R.id.contenedor, fragment1);
        tx1.commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction tx;
                Fragment fragment = null;

                int[] ids = {R.id.itemadmin, R.id.itemnivel1};
                for (int id : ids)
                    navigationView.getMenu().findItem(id).setChecked(false);

                navigationView.getMenu().findItem(item.getItemId()).setChecked(true);

                switch (item.getItemId()) {
                    case R.id.itemapa:
                        fragment = new FragmentMapa();
                        break;

                    case R.id.itemadmin:
                        fragment = new FragmentLogin();
                        break;

                    case R.id.itemnivel1:
                        fragment = new PrimerNivel();
                        break;

                    case R.id.itemnivel2:
                        fragment = new SegundoNivel();
                        break;

                    case R.id.itemnivel3:
                        fragment = new TercerNivel();
                        break;
                }

                if (null != fragment) {
                    tx = fm.beginTransaction();
                    tx.replace(R.id.contenedor, fragment);
                    tx.commit();
                    drawerLayout.closeDrawers();
                }

                return true;
            }
        });
    }
}
