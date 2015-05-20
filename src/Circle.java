import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
class Circle {
    Color color;
    int x, y, width, height;
    boolean activateLines;
    ArrayList<Integer> coordinatesLines;
    public Circle(int x, int y, int width, int height, Color color, Boolean linesActivated, ArrayList<Integer> cordsLine) {
        activateLines = linesActivated;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        coordinatesLines = cordsLine;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
        int cnt = 0;
        if (activateLines == true) {
            while (cnt +3 < coordinatesLines.size()) {
                int x1 = Math.round(coordinatesLines.get(cnt));
                int y1 = Math.round(coordinatesLines.get(cnt + 1));
                int x2 = Math.round(coordinatesLines.get(cnt + 2));
                int y2 = Math.round(coordinatesLines.get(cnt + 3));
                if (cnt == 0){
                    g.drawLine(x1,y1, Math.round(coordinatesLines.get(coordinatesLines.size()-2)), Math.round(coordinatesLines.get(coordinatesLines.size()-1)));
                }
                cnt = cnt + 2;
                g.drawLine(x1, y1, x2, y2);
            }
        }
    }
}

