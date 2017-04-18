package com.example.android.talonsparkouradventure.Game.Game;

import android.media.Image;

/**
 * AbstractEnemy base
 */

public abstract class AbstractEnemy extends Object{

    protected int velocity;


    public AbstractEnemy(int x, int y, Image image, int velocity) {

        super(x, y, image);
        this.velocity = velocity;

    }

    @Override
    public void draw() {

    }

    // TODO:
    // EFFECTS: removes missile if it travels off the screen
    protected void handleBoundary () {

    }

    // EFFECTS: changes position by velocity
    protected void move () {

        x += velocity;

    }
}
