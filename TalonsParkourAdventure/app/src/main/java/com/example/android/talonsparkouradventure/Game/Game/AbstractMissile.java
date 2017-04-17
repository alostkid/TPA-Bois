package com.example.android.talonsparkouradventure.Game.Game;

import android.media.Image;

/**
 * Created by Gavin Ham on 4/16/2017.
 */

public abstract class AbstractMissile{

    protected int x;
    protected int y;
    protected Image image;

    // EFFECTS: constructs a missile with x and y value along with its given picture
    public AbstractMissile (int x, int y, Image image) {

        this.x = x;
        this.y = y;
        this.image = image;

    }

    public int getX () {return x;}

    public int getY () {return y;}

    // TODO:
    // MODIFIES: this
    // EFFECTS: moves the sprite
    public abstract void draw ();

    // TODO:
    // EFFECTS: removes missile if it travels off the screen
    protected void handleBoundary () {

    }
}
