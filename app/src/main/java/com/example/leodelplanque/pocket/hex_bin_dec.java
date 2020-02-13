package com.example.leodelplanque.pocket;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class hex_bin_dec extends AppCompatActivity implements TextView.OnEditorActionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hex_bin_dec);

        EditText hexa= (EditText) findViewById (R.id.editText3);
        hexa.setOnEditorActionListener(this);

        EditText binaire = (EditText) findViewById(R.id.editText5);
        binaire.setOnEditorActionListener(this);

        EditText decimal = (EditText) findViewById(R.id.editText6);
        decimal.setOnEditorActionListener(this);
    }

    public void converthexa(View View){
        EditText hexa= (EditText) findViewById (R.id.editText3);
        EditText binaire = (EditText) findViewById(R.id.editText5);
        EditText decimal = (EditText) findViewById(R.id.editText6);


        String number= hexa.getText().toString();

        int nb = Integer.parseInt(number);




        hexa.setText(Integer.toHexString(nb));
        binaire.setText(Integer.toBinaryString(nb));
        decimal.setText(Integer.toString(nb));
    }

    public void convertbinaire(View View){
        EditText hexa= (EditText) findViewById (R.id.editText3);
        EditText binaire = (EditText) findViewById(R.id.editText5);
        EditText decimal = (EditText) findViewById(R.id.editText6);


        String number= binaire.getText().toString();

        int nb = Integer.parseInt(number);




        hexa.setText(Integer.toHexString(nb));
        binaire.setText(Integer.toBinaryString(nb));
        decimal.setText(Integer.toString(nb));
    }

    public void convertdecimal(View View){
        EditText hexa= (EditText) findViewById (R.id.editText3);
        EditText binaire = (EditText) findViewById(R.id.editText5);
        EditText decimal = (EditText) findViewById(R.id.editText6);


        String number= decimal.getText().toString();

        int nb = Integer.parseInt(number);




        hexa.setText(Integer.toHexString(nb));
        binaire.setText(Integer.toBinaryString(nb));
        decimal.setText(Integer.toString(nb));
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView.getId() == R.id.editText3){
            converthexa(textView);
            return true;
        }
        if (textView.getId() == R.id.editText5){
            convertbinaire(textView);
            return true;
        }
        if (textView.getId() == R.id.editText6){
            convertdecimal(textView);
            return true;
        }
        return false;
    }
}