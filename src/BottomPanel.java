import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class BottomPanel extends JPanel {
    JPanel bottomPanel = new JPanel();
    public BottomPanel (DrawingOnPanel2 panel2, DrawingOnPanel2 panel3 ){
        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(960,1080));
        GridLayout topLayout = new GridLayout(1,2);
        bottomPanel.setLayout(topLayout);
        bottomPanel.add(panel2);
        bottomPanel.add(panel3);

    }
    public JPanel getBottomPanel(){
        return bottomPanel;
    }
}