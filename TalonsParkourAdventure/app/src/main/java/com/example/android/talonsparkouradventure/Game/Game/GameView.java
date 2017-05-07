package com.example.android.talonsparkouradventure.Game.Game;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.example.android.talonsparkouradventure.Game.Game.Enemies.Wall;
import com.example.android.talonsparkouradventure.R;

/**
 * Created by Gavin Ham on 5/5/2017.
 */

public class GameView extends SurfaceView implements Runnable {

    volatile boolean playing;
    private Thread gameThread = null;

    //adding the player to this class
    private Player player;

    private Wall wall;

    //These objects will be used for drawing
    private Paint paint;
    private Canvas canvas;
    private SurfaceHolder surfaceHolder;

    public GameView(Context context) {
        super(context);

        //initializing player object
        player = new Player(context, BitmapFactory.decodeResource(context.getResources(),R.drawable.cute_talon_icon));
        wall = new Wall(context, BitmapFactory.decodeResource(context.getResources(),R.drawable.mario_bg), 5);

        //initializing drawing objects
        surfaceHolder = getHolder();
        paint = new Paint();

        // hides action bar
        this.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }

    @Override
    public void run() {

        while (playing) {
            update();
            draw();
            control();

        }
    }

    private void update() {
        //updating player position
        player.update();
        wall.update();

    }

    private void draw() {
        //checking if surface is valid
        if (surfaceHolder.getSurface().isValid()) {
            //locking the canvas
            canvas = surfaceHolder.lockCanvas();
            //drawing a background color for canvas
            canvas.drawColor(Color.BLACK);

            drawBitmap(wall);
            //Drawing the player
            drawBitmap(player);

            //Unlocking the canvas
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

    private void drawBitmap (AbstractObject thing) {
        canvas.drawBitmap(
                thing.getBitmap(),
                thing.getX(),
                thing.getY(),
                paint);
    }


    private void control() {
        try {
            gameThread.sleep(17);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        playing = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
        }
    }

    public void resume() {
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
}
