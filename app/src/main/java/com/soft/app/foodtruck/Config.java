package com.soft.app.foodtruck;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Config extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
    }

    public void sendAtrasConfig(View view){
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }

    public void sendGuardarConfig(View view){
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }

    public void sendBorrarSeleccion(View view){

        CheckBox b1= (CheckBox) findViewById(R.id.radioButton1);
        CheckBox b2= (CheckBox) findViewById(R.id.radioButton2);
        CheckBox b3= (CheckBox) findViewById(R.id.radioButton3);
        CheckBox b4= (CheckBox) findViewById(R.id.radioButton4);
        CheckBox b5= (CheckBox) findViewById(R.id.radioButton5);
        CheckBox b6= (CheckBox) findViewById(R.id.radioButton6);
        CheckBox b7= (CheckBox) findViewById(R.id.radioButton7);
        CheckBox b8= (CheckBox) findViewById(R.id.radioButton8);


        b1.setChecked(false);
        b2.setChecked(false);
        b3.setChecked(false);
        b4.setChecked(false);
        b5.setChecked(false);
        b6.setChecked(false);
        b7.setChecked(false);
        b8.setChecked(false);

    }
}
