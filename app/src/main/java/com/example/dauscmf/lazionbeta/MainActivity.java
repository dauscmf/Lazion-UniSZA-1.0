package com.example.dauscmf.lazionbeta;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_login, btn_reghere;
    EditText etusername, etpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verfiyLogin();

        // DECLARATION UNTUK KITA PANGGIL AND GUNA DALAM JAVA
        btn_reghere = (Button) findViewById(R.id.btn_reghere);
        btn_reghere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, regPage.class));
            }
        });    }

    public void verfiyLogin(){
        // DECLARATION UNTUK KITA PANGGIL AND GUNA DALAM JAVA
        etusername = (EditText) findViewById(R.id.etusername);
        etpwd = (EditText) findViewById(R.id.etpwd);
        btn_login = (Button)findViewById(R.id.btn_login);

        // UNTUK JADIKAN BUTTON BOLEH KLIK AND PERGI ACTIVITY/ PAGE LAIN
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etusername.getText().toString().equals("skytech") && etpwd.getText().toString().equals("skytech999")) {
                    Toast.makeText(MainActivity.this, "Username and Password is correct!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, UserHome.class));
                } else {
                    Toast.makeText(MainActivity.this, "Username and Password is NOT correct!", Toast.LENGTH_SHORT).show();
                    //attemps_count--;
                    //attemps.setText(Integer.toString(attemps_count));
                    //if (attemps_count == 0) {
                    //    buttonLogin.setEnabled(false);
                    }
                }


        });
    }

}

