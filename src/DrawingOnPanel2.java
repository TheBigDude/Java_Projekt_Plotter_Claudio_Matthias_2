import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthias on 19.05.2015.
 */
public class DrawingOnPanel2 extends JPanel {
    List<Histogram> histograms = new ArrayList<Histogram>();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Histogram histogram : histograms) {
            histogram.drawHistogram(g);
        }

    }

    public void addHistogram(Histogram histogram) {
        histograms.add(histogram);
        repaint();
    }
    public void clearPanel2(){
        removeAll();

    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1900, 400);
    }

}

