package com.example.william.learnenglish.Tablas;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

/**
 * Created by William on 19/08/2016.
 */
@Table
public class ItemDidactico extends SugarRecord {
    String imagen;
    String sonido;
    Pregunta idPregunta;

    public ItemDidactico() {
    }

    public ItemDidactico(String imagen, String sonido, Pregunta idPregunta) {
        this.imagen = imagen;
        this.sonido = sonido;
        this.idPregunta = idPregunta;
    }

    public String getImagen() {
        return imagen;
    }

    public String getSonido() {
        return sonido;
    }

    public Pregunta getIdPregunta() {
        return idPregunta;
    }
}
