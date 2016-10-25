package com.example.william.learnenglish.ModificarBaseDatos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.william.learnenglish.R;
import com.example.william.learnenglish.Tablas.Nivel;
import com.example.william.learnenglish.Tablas.Pregunta;

public class fragmentAddInfo extends Fragment {

    public fragmentAddInfo() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_add_info, container, false);

        Spinner sValores = (Spinner) v.findViewById(R.id.spniveles);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getContext(), R.array.niveles,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sValores.setAdapter(adapter);

        Button button = (Button) v.findViewById(R.id.btnagregar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                new AlertDialog.Builder(getContext())
                        .setTitle("Confirmar Acción")
                        .setMessage("¿Esta seguro de agregar esta pregunta?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                EditText etpregunta = (EditText) v.findViewById(R.id.etpregunta);
                                EditText ettitulo = (EditText) v.findViewById(R.id.etitulo);
                                Toast.makeText(getContext(), "Agregado correctamente", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //Cancelar
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });

        return v;
    }
}
