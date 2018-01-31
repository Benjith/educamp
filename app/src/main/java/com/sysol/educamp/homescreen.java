package com.sysol.educamp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);


        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {

                checkConnection();

            }
        },2000);

    }
 protected boolean  connection(){
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();


        if (netInfo != null && netInfo.isConnectedOrConnecting()) {

            return  true;
        }else{

             return false;
        }


    }
    public void checkConnection(){
        if (connection()){
            Intent intent=new Intent(homescreen.this,login.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(homescreen.this, "Check internet connection", Toast.LENGTH_SHORT).show();
        }
    }


}
