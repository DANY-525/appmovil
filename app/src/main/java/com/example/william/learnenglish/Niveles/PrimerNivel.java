package com.example.william.learnenglish.Niveles;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.william.learnenglish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimerNivel extends Fragment {
    boolean tutorial;
    MediaPlayer player, player2;

    public PrimerNivel() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_primer_nivel, container, false);

        tutorial = true;
        player = MediaPlayer.create(getContext(), R.raw.legoclick);
        player2 = MediaPlayer.create(getContext(), R.raw.legoclick);
        player.setLooping(true);
        player.start();

        Button button = (Button) v.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.start();
            }
        });

        Button button1 = (Button) v.findViewById(R.id.b2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                player2.start();
                EditText et1 = (EditText) v.findViewById(R.id.e2);
                et1.setText("I");
                //List<Nivel> nivel = Nivel.find(Nivel.class, "descripcion = 1", null);
               // List<Pregunta> consulta = Pregunta.find(Pregunta.class, nivel.get(0) + " = 1 ", null);
            }
        });

        Button button2 = (Button) v.findViewById(R.id.b3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.start();
                EditText et1 = (EditText) v.findViewById(R.id.e3);
                et1.setText("N");
            }
        });

        Button button3 = (Button) v.findViewById(R.id.b4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.start();
                EditText et1 = (EditText) v.findViewById(R.id.e4);
                et1.setText("K");

                while (player2.isPlaying()) {
                }
                player2 = MediaPlayer.create(getContext(), R.raw.levelup);
                player2.start();

                while (player2.isLooping()) {
                }

                player2 = MediaPlayer.create(getContext(), R.raw.legoclick);

                if (player.isPlaying()) {
                    player.stop();
                    player.release();
                }

                FragmentManager fm = getFragmentManager();
                FragmentTransaction tx;
                Fragment fragment = new SegundoNivel();
                tx = fm.beginTransaction();
                tx.replace(R.id.contenedor, fragment);
                tx.commit();
            }
        });

        return v;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (player.isPlaying()) {
            player.stop();
            player.release();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if(player.isPlaying())
        player.stop();
    }

    @Override
    public void onResume() {
        super.onResume();
        if(!player.isPlaying())
        player.start();
    }
}

