package com.example.android.talonsparkouradventure.Game.Game;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Background {

    private Bitmap image;
    private int x, y, dx;
    private TalonsParkourAdventure game;

    public Background(Bitmap res)
    {
        image = res;
    }
    public void update()
    {
        x+=dx;
        if(x<-game.getDeviceWidth()){
            x=0;
        }
    }
    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(image, x, y,null);
        if(x<0)
        {
            canvas.drawBitmap(image, x+game.getDeviceWidth(), y, null);
        }
    }
    public void setVector(int dx)
    {
        this.dx = dx;
    }
}
