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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(960, 600));
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