package com.example.leodelplanque.pocket;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class audiovisuelMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiovisuel);
    }

    public void clapButton(View View){
        startActivity(new Intent(this,clap.class));

    }

}

