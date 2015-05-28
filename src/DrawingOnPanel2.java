import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 19.05.2015.
 */
public class DrawingOnPanel2 extends JPanel {
    CreateHistograms histograms;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (histograms != null) {
            histograms.drawHistogram(g);
        }

    }

    public void addHistogram(CreateHistograms histogram) {
        histograms = histogram;
        repaint();
    }
    public void clearPanel2(){
        removeAll();
        histograms = null;
    }
    public void updatePanel(){
        repaint();
    }
}

