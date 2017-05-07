package com.example.android.talonsparkouradventure.Game.Game.Enemies;

import android.content.Context;
import android.graphics.Bitmap;

import com.example.android.talonsparkouradventure.Game.Game.Enemies.AbstractEnemy;

/**
 * Created by Gavin Ham on 5/7/2017.
 */

public class Wall extends AbstractEnemy {


    Wall(Context context, Bitmap bitmap, int speed) {

        super(context, bitmap, speed);

    }

    @Override
    public void update() {

        x -= speed;

    }
}
