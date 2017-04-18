package com.example.android.talonsparkouradventure.Game.Game;

import android.media.Image;

/**
 * Created by Gavin Ham on 4/17/2017.
 */
//Represents an in-game object
public abstract class Object {

    protected int x;
    protected int y;
    protected Image image;

    // EFFECTS: constructs a missile with x and y value along with its given picture
    public Object (int x, int y, Image image) {

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

    // TODO
    // EFFECTS: handles what happens when hit another obstacle
    public abstract void handleCollision ();

}
