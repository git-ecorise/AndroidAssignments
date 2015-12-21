package com.ecorise.intenttab;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;



@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = getTabHost();
        
        //Tab for Login
        TabSpec loginspec = tabHost.newTabSpec("Login");
        loginspec.setIndicator("Login");
        Intent login = new Intent(this, Login.class);
        loginspec.setContent(login);
        
        //Tab for Registration
        TabSpec registrationspec = tabHost.newTabSpec("Registration");
        registrationspec.setIndicator("Register");
        Intent register = new Intent(this, Register.class);
        registrationspec.setContent(register);
        
        tabHost.addTab(loginspec);
        tabHost.addTab(registrationspec);
        
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
