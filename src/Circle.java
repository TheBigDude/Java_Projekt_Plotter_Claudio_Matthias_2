import java.awt.*;

/**
 * Created by Matthias on 17.05.2015.
 */
class Circle {
    Color color;
    int x, y, width, height;

    public Circle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
