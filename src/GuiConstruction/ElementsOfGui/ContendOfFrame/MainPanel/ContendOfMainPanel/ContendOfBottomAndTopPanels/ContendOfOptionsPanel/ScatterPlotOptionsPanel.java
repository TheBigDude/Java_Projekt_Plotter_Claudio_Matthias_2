package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel;

import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ComponentsInsidePanels.ScatterPlotButtons;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class ScatterPlotOptionsPanel extends JPanel {
    JPanel spOptionsPanel = new JPanel();
    public ScatterPlotOptionsPanel(ScatterPlotButtons scatterPlotButtons){
        spOptionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        spOptionsPanel.setPreferredSize(new java.awt.Dimension(240,600));
        GridLayout spOptionsPanelLayout = new GridLayout(0,1);
        spOptionsPanel.setLayout(spOptionsPanelLayout);
        spOptionsPanel.add(scatterPlotButtons.getXAxisLabel());
        spOptionsPanel.add(scatterPlotButtons.getRadioButton1());
        spOptionsPanel.add(scatterPlotButtons.getRadioButton2());
        spOptionsPanel.add(scatterPlotButtons.getYAxisLabel());
        spOptionsPanel.add(scatterPlotButtons.getRadioButton3());
        spOptionsPanel.add(scatterPlotButtons.getRadioButton4());
        spOptionsPanel.add(scatterPlotButtons.getLineButton());
        spOptionsPanel.add(scatterPlotButtons.getSizeLabel());
        spOptionsPanel.add(scatterPlotButtons.getSizeSlider());
    }
    public JPanel getSpOptionsPanel(){
        return spOptionsPanel;
    }
}
