import java.awt.*;

/**
 * Created by Matthias on 17.05.2015.
 */
class Circle {

    int x, y, width, height;

    public Circle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, width, height);
    }
}
