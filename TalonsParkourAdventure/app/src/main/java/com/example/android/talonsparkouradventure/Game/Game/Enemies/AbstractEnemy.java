package com.example.android.talonsparkouradventure.Game.Game.Enemies;

import android.content.Context;
import android.graphics.Bitmap;

import com.example.android.talonsparkouradventure.Game.Game.AbstractObject;

/**
 * Created by Gavin Ham on 5/7/2017.
 */

public abstract class AbstractEnemy extends AbstractObject {

    protected int speed;

    AbstractEnemy(Context context, Bitmap bitmap,int speed) {

        super(context, bitmap);
       this.speed = speed;

    }
    // TODO: MAKE
    private void handleCollisions () {}


}
