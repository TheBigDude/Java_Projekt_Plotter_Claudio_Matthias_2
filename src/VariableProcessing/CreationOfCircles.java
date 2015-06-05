package VariableProcessing;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
public class CreationOfCircles {
    ArrayList<Float> coordinatesX = new ArrayList<Float>();
    ArrayList<Float> coordinatesY = new ArrayList<Float>();
    boolean linesActivated;
    int width;
    Color color;
    public CreationOfCircles(ArrayList<Float> coordinatesX, ArrayList<Float> coordinatesY, int width, Color color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.width = width;
        this.color = color;
    }

    public void draw(Graphics g){
        g.setColor(color);
        for(int cnt =0; cnt<coordinatesX.size(); cnt++) {
            g.fillOval(Math.round(coordinatesX.get(cnt)), Math.round(coordinatesY.get(cnt)), width, width);
            if (linesActivated) {
                if (cnt <= coordinatesX.size() - 2) {
                    g.drawLine((int) (Math.round(coordinatesX.get(cnt)) + 0.5*width), (int) Math.round(coordinatesY.get(cnt) + 0.5*width), (int) Math.round(coordinatesX.get(cnt + 1) + 0.5*width), (int) Math.round(coordinatesY.get(cnt + 1) + 0.5*width));
                }
            }
        }
    }

    public void changeColor(Color color){
        this.color = color;
    }
    public void changeRadius(int radius){
        width = radius;
    }
    public void activateLines(boolean linesActivated){
        this.linesActivated=linesActivated;
    }
}