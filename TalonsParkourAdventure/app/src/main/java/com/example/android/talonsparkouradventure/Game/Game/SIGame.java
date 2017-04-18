package com.example.android.talonsparkouradventure.Game.Game;

import android.media.Image;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gavin Ham on 4/17/2017.
 */

public class SIGame {

    private static final int x = 5;
    private static final int y = 5;
    private boolean isGameOver;
    private List<AbstractEnemy> enemies;
    private Talon talon;
    private int score;


    public SIGame (Image skin) {

        enemies = new ArrayList<>();
        isGameOver = false;
        talon = new Talon(x, y, skin);
        reset();

    }

    private void reset() {
    }

    // TODO:
    // EFFECTS: look at the name
    void jump() {

    }

    //TODO:
    // EFFECTS: tick function
    public void update() {

    }

    // EFFECTS: returns if game is over
    public boolean isOver () {return isGameOver;}

    //TODO:
    // EFFECTS: sets up clean game
    private void setUp() {}

    //TODO:
    // EFFECTS: removes stuff off screen
    private void checkStuff () {}

    //TODO:
    // EFFECTS: checks if player was hit by skill
    private void checkMeHit () {

    }

    private boolean checkMeHitHelper (AbstractEnemy enemy) {
        return false;
    }

    private int score () {
        return this.score += 1;
    }

}
