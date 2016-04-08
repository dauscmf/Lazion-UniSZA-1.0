package com.example.dauscmf.lazionbeta;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class regPage extends AppCompatActivity {

    Button btn_userreg, btn_runnerreg;
    Image imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_page);

        // DECLARATION UNTUK KITA PANGGIL AND GUNA DALAM JAVA
        btn_runnerreg = (Button)findViewById(R.id.btn_runnerreg);
        btn_userreg = (Button)findViewById(R.id.btn_userreg);
        //imageView2 = (Image)findViewById(R.id.imageView2);

        // UNTUK JADIKAN BUTTON BOLEH KLIK AND PERGI ACTIVITY/ PAGE LAIN
        btn_runnerreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(regPage.this, register_runner.class));
            }
        });

        // UNTUK JADIKAN BUTTON BOLEH KLIK AND PERGI ACTIVITY/ PAGE LAIN
        btn_userreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(regPage.this, register.class));
            }
        });

    }
}
