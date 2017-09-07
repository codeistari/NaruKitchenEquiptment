package com.example.aaron.imageapp;

import android.app.Activity;
import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

/**
 * Created by Aaron on 16-12-2016.
 */
public class Video extends Activity {
    Button click;
    VideoView videoView;
    MediaController mediaController;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        click = (Button) findViewById(R.id.videoButton);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);

    }

    public void videoplay(View v) {
        String videopath = "android.resource://com.example.aaron.imageapp/" + R.raw.video;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }

}
