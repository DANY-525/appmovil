package com.example.william.learnenglish.Niveles;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.william.learnenglish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoNivel extends Fragment {

    MediaPlayer player, player2;

    public SegundoNivel() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v=inflater.inflate(R.layout.fragment_segundo_nivel, container, false);

        player = MediaPlayer.create(getContext(), R.raw.legoclick);
        player2 = MediaPlayer.create(getContext(), R.raw.legoclick);
        player.setLooping(true);
        player.start();

        return v;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        /*if (player.isPlaying()) {
            player.stop();
            player.release();
        }*/
    }

    @Override
    public void onPause() {
        super.onPause();
        //player.stop();
    }

    @Override
    public void onResume() {
        super.onResume();
        //player.start();
    }

}
