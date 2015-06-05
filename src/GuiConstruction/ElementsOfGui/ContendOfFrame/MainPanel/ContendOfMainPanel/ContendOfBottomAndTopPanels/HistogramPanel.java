package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels;

import VariableProcessing.CreateHistograms;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 19.05.2015.
 */
public class HistogramPanel extends JPanel {
    CreateHistograms histograms;
    String name;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (histograms != null) {
            histograms.drawHistogram(g);
        }
        if(name!= null){
            setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Histogram 1: " + name));
        }
        else{setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));}
        setBackground(new java.awt.Color(255, 255, 255));

        setPreferredSize(new java.awt.Dimension(960, 480));
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
    public void setVariableNames(String name){
        this.name= name;

    }
}

