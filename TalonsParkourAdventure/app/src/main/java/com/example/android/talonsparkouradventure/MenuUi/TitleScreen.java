package com.example.android.talonsparkouradventure.MenuUi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Point;
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

    public static final int UI_ANIMATION_DELAY = 0;
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private View mControlsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.fullscreen_content);


    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);
        hide();

    }

    @Override
    protected void onPostResume() {

        super.onPostResume();
        hide();

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


    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);

    }
}
