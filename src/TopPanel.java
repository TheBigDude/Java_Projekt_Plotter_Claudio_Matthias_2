import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class TopPanel extends JPanel {
    JPanel topPanel = new JPanel();
    public TopPanel (DrawingOnPanel1 panel1, JPanel optionsPanel){
        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setPreferredSize(new java.awt.Dimension(960, 1080));
        GridLayout topLayout = new GridLayout(1,2);
        topPanel.setLayout(topLayout);
        topPanel.add(panel1);
        topPanel.add(optionsPanel);

    }
    public JPanel getTopPanel(){
        return topPanel;
    }
}
