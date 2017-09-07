package com.example.aaron.imageapp;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Aaron on 29-07-2016.
 */
public class HomePage extends Fragment {

    Button click;
    MediaController mediaController;
    View myView;
    VideoView videoView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.home, container, false);
        videoView = (VideoView)myView.findViewById(R.id.videoView);
        mediaController = new MediaController(getActivity());
        String videopath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.naru;
        videoView.setVideoURI(Uri.parse(videopath));
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
        return myView;
    }

}
