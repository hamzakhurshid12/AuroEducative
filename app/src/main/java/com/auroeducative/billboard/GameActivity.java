package com.auroeducative.billboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;

public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        WebView view = findViewById(R.id.webView);
        view.clearCache(true);
        view.clearHistory();
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://nwqm.pe.hu/AuroEducative/AuroEducative/count-js_game/count-game.html");
    }
}