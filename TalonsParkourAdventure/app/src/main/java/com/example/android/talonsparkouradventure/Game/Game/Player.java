package com.example.android.talonsparkouradventure.Game.Game;

import android.content.Context;

/**
 * Created by Gavin Ham on 5/5/2017.
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.android.talonsparkouradventure.R;

public class Player extends AbstractObject {

    //motion speed of the character

    //constructor
    public Player(Context context, Bitmap bitmap) {
        super(context, bitmap);

        //Getting bitmap from drawable resource
    }



    //Method to update coordinate of character
    @Override
    public void update(){
        //updating x coordinate
        x++;
    }



}
