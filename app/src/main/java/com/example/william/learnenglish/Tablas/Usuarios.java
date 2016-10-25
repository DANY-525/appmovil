package com.example.william.learnenglish.Tablas;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

/**
 * Created by William on 11/08/2016.
 */
@Table
public class Usuarios extends SugarRecord {
    String nombre;
    String contrasena;

    public Usuarios() {
    }

    public Usuarios(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
}
