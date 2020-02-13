package com.example.leodelplanque.pocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoixValeurClap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_valeur_clap);
    }

    public void validateButton(View View){
        startActivity(new Intent(this,clap.class));

    }
}

