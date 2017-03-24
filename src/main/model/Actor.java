package main.model;

import java.awt.*;

public class Actor {
    private int xPos; //Position in the X axis
    private int yPos; //Position in the Y axis
    private Image sprite;

    public Actor(int xPos, int yPos, Image sprite){
        this.xPos = xPos;
        this.yPos = yPos;
        this.sprite = sprite;
    }

    //Draws the actor in the given graphics
    public void drawSelfOn(Graphics graphics){
        graphics.drawImage(this.sprite, this.xPos, this.yPos, null);
    }
}