package main.model;

import java.awt.*;
import java.util.ArrayList;

public class Scene {
    private ArrayList<Actor> actorList;

    public Scene(){
        this.actorList = new ArrayList<Actor>();
    }

    //Draws all actors in the given graphics
    public void drawSelfOn(Graphics graphics){
        for (Actor actor : actorList) {
            actor.drawSelfOn(graphics);
        }
    }
    public void addActor(Actor actor){
        this.actorList.add(actor);
    }
}