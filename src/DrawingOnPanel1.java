import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 17.05.2015.
 */
public class DrawingOnPanel1 extends JPanel {
   CreateCircles circles;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (circles != null){
            circles.draw(g);
        }
    }

    public void addCircles(CreateCircles circle) {
        circles=circle;
        repaint();
    }


    public void updatePanel(){
        repaint();
    }
    public void clearPanel(){
        removeAll();
        circles = null;
    }


}