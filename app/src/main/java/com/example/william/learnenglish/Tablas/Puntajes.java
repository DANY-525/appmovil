package com.example.william.learnenglish.Tablas;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

/**
 * Created by William on 11/08/2016.
 */
@Table
public class Puntajes extends SugarRecord {
    String alias;
    Integer puntaje;

    public Puntajes() {
    }

    public Puntajes(String alias, Integer puntaje) {
        this.alias = alias;
        this.puntaje = puntaje;
    }

    public String getAlias() {
        return alias;
    }

    public Integer getPuntaje() {
        return puntaje;
    }
}
