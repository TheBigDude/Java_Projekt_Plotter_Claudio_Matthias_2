import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthias on 17.05.2015.
 */
class DrawingOnPanel1 extends JPanel {

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
    public void clearPanel1(){
        removeAll();
        circles.clear();
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(900, 600);
    }

}