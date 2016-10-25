package com.example.william.learnenglish.Tablas;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

/**
 * Created by William on 11/08/2016.
 */
@Table
public class Pregunta extends SugarRecord {
    String titulo;
    String descripcionPregunta;
    Nivel idNivel;
    String categoria;

    public Pregunta() {
    }

    public Pregunta(String titulo, String descripcionPregunta, Nivel idNivel) {
        this.titulo = titulo;
        this.descripcionPregunta = descripcionPregunta;
        this.idNivel = idNivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcionPregunta() {
        return descripcionPregunta;
    }
}
