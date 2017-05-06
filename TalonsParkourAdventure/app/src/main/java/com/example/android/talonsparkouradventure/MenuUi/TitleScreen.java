package com.example.android.talonsparkouradventure.MenuUi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.android.talonsparkouradventure.Game.Game.TalonsParkourAdventure;
import com.example.android.talonsparkouradventure.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class TitleScreen extends AppCompatActivity {
    // these are for landscape

    private View mContentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_title_screen);
        mContentView = findViewById(R.id.fullscreen_content);
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);

    }

    @Override
    protected void onPostResume() {

        super.onPostResume();

    }

    // TODO:
    // EFFECTS: spawn frog that kermits
    public void titleButton (View view) {

    }

    // EFFECTS: starts TalonsParkourAdventure / starts the game
    public void playGameButton (View view) {

        startActivity(new Intent(TitleScreen.this, TalonsParkourAdventure.class));

    }

    // EFFECTS: go to SkinsScreen
    public void skinsButton (View view) {

        startActivity(new Intent(TitleScreen.this, SkinsScreen.class));

    }

    // EFFECTS: go to AboutScreen
    public void aboutButton (View view) {

        startActivity(new Intent(TitleScreen.this, AboutScreen.class));
    }
}
