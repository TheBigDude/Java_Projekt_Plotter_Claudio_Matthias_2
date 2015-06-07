package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels;

import VariableProcessing.CreationOfHistograms;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 19.05.2015.
 */
// Creates a panel which is able to trigger the drawing of the histograms on itself by calling its method addHistogram
public class HistogramPanel extends JPanel {
    CreationOfHistograms histograms;
    String name;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (histograms != null) {
            histograms.drawHistogram(g);
        }
        if(name!= null){
            setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Histogram:" + name));
        }
        else{setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));}
        setBackground(new java.awt.Color(255, 255, 255));

        setPreferredSize(new java.awt.Dimension(960, 480));
    }

    public void addHistogram(CreationOfHistograms histogram) {
        histograms = histogram;
        repaint();
    }
    public void updatePanel(){
        repaint();
    }
    public void setVariableNames(String name){
        this.name= name;

    }
}

