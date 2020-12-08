package com.auroeducative.billboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.webkit.WebView;

public class GameActivity extends Activity {

    private String mode = "ad"; // ad, tutorial, game
    WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        view = findViewById(R.id.webView);
        view.clearCache(true);
        view.clearHistory();
        view.getSettings().setMediaPlaybackRequiresUserGesture(false);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://nwqm.pe.hu/AuroEducative/AdVideos/PlayAd.html");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if(mode.equals("ad")){
            view.loadUrl("http://nwqm.pe.hu/AuroEducative/AuroEducative/PlayTutorial.html");
        } else {
            super.dispatchKeyEvent(event);
        }
        return true;
    }
}