import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthias on 17.05.2015.
 */
class DrawingPanel extends JPanel {

    List<Circle> circles = new ArrayList<Circle>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Circle circle : circles) {
            circle.draw(g);
        }
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(900, 600);
    }
}