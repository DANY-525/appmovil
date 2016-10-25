package com.example.william.learnenglish;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMapa extends Fragment {

    MediaPlayer player = null;

    public FragmentMapa() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mapa, container, false);
        // Inflate the layout for this fragment

        player = MediaPlayer.create(getContext(), R.raw.fondoloops);
        player.setLooping(true);
        player.start();

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
        player.stop();
    }

    @Override
    public void onResume() {
        super.onResume();
        player.start();
    }
}
