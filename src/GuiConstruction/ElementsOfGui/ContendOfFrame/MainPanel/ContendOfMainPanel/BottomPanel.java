package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel;

import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.HistogramPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
// Creates the parent panel for the two histogram panels
public class BottomPanel extends JPanel {
    JPanel bottomPanel = new JPanel();

    public BottomPanel (HistogramPanel panel2, HistogramPanel panel3 ){
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