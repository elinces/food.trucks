package com.soft.app.foodtruck;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends Activity {

    private EditText etNombre;
    private EditText etEmail;
    private EditText etUsuario;
    private EditText etPassword;
    private Button b1;
    private TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        b1 = (Button)findViewById(R.id.buttonCrear);
        etNombre = (EditText)findViewById(R.id.textNombre);
        etEmail = (EditText)findViewById(R.id.textEmail);
        etUsuario = (EditText)findViewById(R.id.textUsuario);
        etPassword = (EditText)findViewById(R.id.textPassword);

        try {

            b1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {

                    String nombre = etNombre.getText().toString();
                    String email = etEmail.getText().toString();
                    String usuario = etUsuario.getText().toString();
                    String password = etPassword.getText().toString();
                    Usuario us = new Usuario();
                    boolean sw;
                    sw = us.Registrar(nombre, email, usuario, password);
                    if (sw == true) {
                        Intent intent = new Intent(Registro.this, Main.class);
                        startActivity(intent);
                        error.setText("");
                    } else {
                        error.setText("El usuario ya existe");
                    }


                }

            });
        }catch(Exception e){

        }

    }
}
