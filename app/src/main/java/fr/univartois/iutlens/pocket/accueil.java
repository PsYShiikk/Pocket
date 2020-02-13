package fr.univartois.iutlens.pocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void audiovisuelButton(View View){
        startActivity(new Intent(this,audiovisuelMenu.class));

    }

    public void communicationButton(View View){
        startActivity(new Intent(this,communicationMenu.class));

    }
    public void webButton(View View){
        startActivity(new Intent(this,webMenu.class));

    }
}
