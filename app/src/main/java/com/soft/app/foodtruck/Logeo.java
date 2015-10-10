package com.soft.app.foodtruck;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Logeo extends Activity {

    private EditText et1;
    private EditText et2;
    private Button b1;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeo);
/*
        et1 = (EditText)findViewById(R.id.textUsuario);
        et2 = (EditText)findViewById(R.id.textPassword);


        b1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v){

                String usuario = et1.getText().toString();
                String password = et2.getText().toString();
                Usuario us = new Usuario();
                boolean sw;
                sw = us.Ingresar(usuario, password);
                if(sw == true){
                    Intent intent = new Intent(Logeo.this, Perfil.class);
                    startActivity(intent);
                    error.setText("");
                }else{
                    error.setText("El usuario o la contraseña no coinciden");
                }


            }

        });*/

        b1 = (Button)findViewById(R.id.buttonIngresar);

        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(Logeo.this, Perfil.class);
                startActivity(intent);
            }

        });


    }
}
