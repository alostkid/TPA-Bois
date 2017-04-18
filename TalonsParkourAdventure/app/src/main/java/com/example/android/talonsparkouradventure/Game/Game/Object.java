package com.example.android.talonsparkouradventure.Game.Game;

import android.media.Image;

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


}
