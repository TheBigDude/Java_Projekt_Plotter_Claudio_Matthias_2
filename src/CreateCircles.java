import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
class CreateCircles {
    ArrayList<Float> coordinatesX = new ArrayList<Float>();
    ArrayList<Float> coordinatesY = new ArrayList<Float>();
    boolean linesActivated;
    int width;
    Color color;
    public CreateCircles(ArrayList<Float> coordinatesX, ArrayList<Float> coordinatesY, int width, Color color) {
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
                    g.drawLine(Math.round(coordinatesX.get(cnt)), Math.round(coordinatesY.get(cnt)), Math.round(coordinatesX.get(cnt + 1)), Math.round(coordinatesY.get(cnt + 1)));
                } else {
                    g.drawLine(Math.round(coordinatesX.get(0)), Math.round(coordinatesY.get(0)), Math.round(coordinatesX.get(cnt)), Math.round(coordinatesY.get(cnt)));
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