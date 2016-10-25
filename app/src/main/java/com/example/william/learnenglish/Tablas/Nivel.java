package com.example.william.learnenglish.Tablas;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

import java.util.List;

/**
 * Created by William on 11/08/2016.
 */
@Table
public class Nivel extends SugarRecord {
    String tituloNivel;
    String descripcion;

    public Nivel() {
    }

    public Nivel(String titulo, String descripcion) {
        this.tituloNivel = titulo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return tituloNivel;
    }

    List<Pregunta> getNivel() {
        return Nivel.find(Pregunta.class, "idNivel = ?", String.valueOf(getId()));
    }
}
