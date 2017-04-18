package com.example.android.talonsparkouradventure.Game.Game;

import android.media.Image;

/**
 * Created by Gavin Ham on 4/16/2017.
 */

public abstract class AbstractMissile extends Object{

    protected int velocity;


    public AbstractMissile(int x, int y, Image image, int velocity) {

        super(x, y, image);
        this.velocity = velocity;

    }

    @Override
    public void draw() {

    }

    @Override
    public void handleCollision() {

    }

    // TODO:
    // EFFECTS: removes missile if it travels off the screen
    protected void handleBoundary () {

    }
}