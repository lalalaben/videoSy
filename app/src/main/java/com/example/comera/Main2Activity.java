package com.example.comera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

import java.io.ByteArrayInputStream;

public class Main2Activity extends AppCompatActivity {

    private static  String TAG = "Main2Activity";

    private VideoView videoView;
    static final int REQUEST_VIDEO_CAPTURE = 1;

    private Uri videoUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG,"start");
        setContentView(R.layout.activity_main2);
        videoView = findViewById(R.id.videoView);

        Bundle bundle = this.getIntent().getExtras();
        String Suri = bundle.getString("videoUri");
//        Log.e(TAG,Suri);
//        Uri.parse(Suri);
//        videoView.setVideoURI(videoUri);

    }

}
