package com.example.leodelplanque.pocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class webMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_menu);
    }

    public void hex_bin_dec_Button(View View){
        startActivity(new Intent(this,hex_bin_dec.class));

    }

    public void hex_rgb_Button(View View){
        startActivity(new Intent(this,hex_rgb.class));

    }
}




