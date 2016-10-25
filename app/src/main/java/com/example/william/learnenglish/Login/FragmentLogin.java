package com.example.william.learnenglish.Login;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.william.learnenglish.R;
import com.example.william.learnenglish.ModificarBaseDatos.fragmentAddInfo;

public class FragmentLogin extends Fragment {

    public FragmentLogin() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_login, container, false);

        Button button = (Button) v.findViewById(R.id.buttoniniciar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textuser = (EditText) v.findViewById(R.id.etusuario);
                EditText textpass = (EditText) v.findViewById(R.id.etcontrasena);
                {
                    if (textuser.getText().toString().equals("admin") && textpass.getText().toString().equals("1234")) {
                        FragmentManager fm1 = getFragmentManager();
                        FragmentTransaction tx1;
                        Fragment fragment1 = new fragmentAddInfo();
                        tx1 = fm1.beginTransaction();
                        tx1.replace(R.id.contenedor, fragment1);
                        tx1.commit();
                    } else
                        Toast.makeText(getContext(), "Datos Incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }
}