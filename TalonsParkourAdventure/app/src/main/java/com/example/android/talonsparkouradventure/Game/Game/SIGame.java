package com.example.android.talonsparkouradventure.Game.Game;

/**
 * Created by Gavin Ham on 4/17/2017.
 */

public class SIGame {

    private boolean isGameOver;


    public SIGame () {

        isGameOver = false;
        initializeObjects();
        reset();

    }

    private void reset() {
    }

    private void initializeObjects() {
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
    private boolean checkMeHit () {return false;}

}
