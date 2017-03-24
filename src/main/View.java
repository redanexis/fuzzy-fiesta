package main;

import main.model.Scene;

import javax.swing.*;
import java.awt.*;

public class View {
    public DrawCanvas drawCanvas;
    public Scene scene;
    public JFrame frame;

    public void startView(){
        this.drawCanvas = new DrawCanvas(this);
        this.frame = new JFrame("Stuffs");
        drawCanvas = new DrawCanvas(this);
        this.frame.add(drawCanvas);
        this.frame.setSize(700, 700);
        this.frame.setLocationRelativeTo(null); //centers window on screen
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public void drawOn(Graphics graphics){
        this.scene.drawSelfOn(graphics);
    }

    private class DrawCanvas extends JPanel{
        private View view;

        public DrawCanvas(View view){
            this.view = view;
        }

        @Override
        public void paintComponent(Graphics graphics){
            //Super's paintComponent($graphics) for some reason clears $graphics. This is useful for redrawing.
            super.paintComponent(graphics);
            this.view.drawOn(graphics);
        }
    }
}
