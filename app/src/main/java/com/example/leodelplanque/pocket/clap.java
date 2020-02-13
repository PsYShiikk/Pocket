package com.example.leodelplanque.pocket;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class clap extends AppCompatActivity implements OrientationProxy.OrientationListener {

    private OrientationProxy proxy;
    private boolean clapGo;
    private SoundPool soundPool;
    private int soundId;
    private int nbPrise = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clap);

        proxy = new OrientationProxy(this,this);

        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        soundId = soundPool.load(this, R.raw.clap, 0);
        clapGo = false;

    }

    public void editButton(View View){
        startActivity(new Intent(this,ChoixValeurClap.class));

    }


    public void clapActive(double valeurdelangle){

        View couleurDeFond = findViewById(R.id.myRectangle);
        TextView textSequence = findViewById(R.id.textSeq);
        TextView textScene = findViewById(R.id.textScene);
        TextView textPrise = findViewById(R.id.textPrise);
        TextView textNbSequence = findViewById(R.id.textChiffreSeq);
        TextView textNbScene = findViewById(R.id.textChiffreScene);
        TextView textNbPrise = findViewById(R.id.textChiffrePrise);


        if(valeurdelangle <= -60) {
            clapGo = true;

            couleurDeFond.setBackgroundColor(Color.parseColor("#1C1C1C"));
            textSequence.setTextColor(Color.WHITE);
            textPrise.setTextColor(Color.WHITE);
            textScene.setTextColor(Color.WHITE);
            textNbPrise.setTextColor(Color.WHITE);
            textNbScene.setTextColor(Color.WHITE);
            textNbSequence.setTextColor(Color.WHITE);

        } else if (clapGo && valeurdelangle >=-8 ){
            clapGo = false;

            soundPool.play(soundId, 1f, 1f, 0, 0, 1f);
            textNbPrise.setText(""+nbPrise);
            couleurDeFond.setBackgroundColor(Color.parseColor("#FFFFFF"));
            textSequence.setTextColor(Color.parseColor("#1C1C1C"));
            textPrise.setTextColor(Color.parseColor("#1C1C1C"));
            textScene.setTextColor(Color.parseColor("#1C1C1C"));
            textNbPrise.setTextColor(Color.parseColor("#1C1C1C"));
            textNbScene.setTextColor(Color.parseColor("#1C1C1C"));
            textNbSequence.setTextColor(Color.parseColor("#1C1C1C"));
            nbPrise++;




        }

    }



    @Override
    public void onOrientationChanged(float[] angle, long stamp) {
        clapActive(Math.toDegrees(angle[1]));
    }

    @Override
    protected void onResume() {
        super.onResume();
        proxy.resume(); // On relance l'accéléromètre
    }

    @Override
    protected void onPause() {
        super.onPause();
        proxy.pause(); // On mets en pause l'accéléromètre
    }
}
