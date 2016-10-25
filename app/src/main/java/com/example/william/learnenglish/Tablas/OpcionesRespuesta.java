package com.example.william.learnenglish.Tablas;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

/**
 * Created by William on 11/08/2016.
 */
@Table
public class OpcionesRespuesta extends SugarRecord {
    String resultado;
    Boolean esCorrecto;
    Pregunta idPregunta;

    public OpcionesRespuesta(){}

    public OpcionesRespuesta(String resultado, Boolean esCorrecto, Pregunta idPregunta) {
        this.resultado = resultado;
        this.esCorrecto = esCorrecto;
        this.idPregunta = idPregunta;
    }

    public String getResultado() {
        return resultado;
    }

    public Boolean getEsCorrecto() {
        return esCorrecto;
    }
}