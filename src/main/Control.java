package main;

import main.model.Actor;
import main.model.Scene;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Control {

    public static void main(String[] args) {
        new Control();
    }

    private View view;
    private Scene scene;
    private Timer timer;
    private AssetFactory assetFactory;

    public Control(){
        //create the stuff
        this.view = new View();
        this.scene = new Scene();
        timer = new Timer();
        this.assetFactory = new AssetFactory();

        //pass stuff around to set it up
        this.view.scene = this.scene;

        //start stuff
        this.view.startView();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                view.frame.repaint(); //call repaint on frame rather than on panel is what works, but why?
            }
        }, 0, 35); // afraid of using Timer.scheduleAtFixedRate()

        this.scene.addActor(new Actor(100, 100, assetFactory.constructImage(File.separator + "assets" + File.separator + "shaymin.png")));
    }


}
