package com.soft.app.foodtruck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 10/9/2015.
 */
public class Usuario {

    private String usuario2;
    private String password2;
    private List<String> ls = new ArrayList<>();
    private static final String url = "jdbc:mysql://localhost:3306/usuario";

    public Usuario() {

    }

    public boolean Registrar(String nombre, String email, String usuario, String password){
/*
        boolean sw = false;
        int count = 0;
        try{
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Nombre, Email, Usuario, Password from Usuario");
            while(rs.next()){
                usuario2 = rs.getString(0);
                if(usuario.equals(usuario2)){
                    sw = false;
                }else{
                    sw = true;
                }
                count++;
            }
            if(sw = true) {
                ingresarData(nombre, email, usuario, password);
            }
        }catch(Exception e){
        }*/
        return true;
    }

    public void ingresarData( String nombre, String email, String usuario, String password) {

        try {

            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("update Nombre, Email, Usuario, Password from Usuario");
            while(rs.next()) {

                rs.updateString(0,usuario);
                rs.updateString(1,password);
                rs.updateString(2,email);
                rs.updateString(3,nombre);

            }

        }catch(Exception e) {
        }

    }

    public boolean Ingresar(String usuario, String password){
/*
        boolean sw = false;
        int count = 0;
        try{
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Usuario, Password from Usuario");
            while(rs.next()){
                usuario2 = rs.getString(0);
                password2 = rs.getString(1);
                if(usuario.equals(usuario2) && password.equals(password2)){
                    sw = true;
                }
                count++;
            }
        }catch(Exception e){
        }*/
        return true;
    }

    }
