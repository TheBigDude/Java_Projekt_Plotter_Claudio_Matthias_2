package EventHandling;

import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ColorButtons;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ColorChooser;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ScatterPlotButtons;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.HistogramPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ScatterPlotPanel;
import GuiConstruction.ElementsOfGui.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Matthias on 04.06.2015.
 */
//Adds all needed event Listeners to the GUIs elements
public class EventListeners {

    public EventListeners(ScatterPlotPanel scatterPlotPanel, HistogramPanel histogramPanel1, HistogramPanel histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorButtons colorButtons, ColorChooser colorChooser, Frame mainFrame) {
        final EventActions actions = setEventActions(scatterPlotPanel, histogramPanel1, histogramPanel2, scatterPlotButtons, colorChooser, mainFrame);

        //adding event listeners to the different buttons, including the function being performed if event triggered
        scatterPlotButtons.getRadioButton1().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {actions.jRadioButton1MouseClicked(evt);}
        });
        scatterPlotButtons.getRadioButton2().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {actions.jRadioButton2MouseClicked(evt);}
        });
        scatterPlotButtons.getRadioButton3().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {actions.jRadioButton3MouseClicked(evt);}
        });
        scatterPlotButtons.getRadioButton4().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {actions.jRadioButton4MouseClicked(evt);}
        });
        scatterPlotButtons.getLineButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {actions.lineButtonActionPerformed(evt);}
        });
        scatterPlotButtons.getSizeSlider().addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {actions.sizeSliderMouseReleased(evt);}
        });
        colorButtons.getColorButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {actions.colorButtonMouseClicked(evt);}
        });
        colorButtons.getColorButton2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {actions.colorButton2MouseClicked(evt);}
        });
        colorButtons.getColorButton3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {actions.colorButton3MouseClicked(evt);}
        });
        mainFrame.getjMenuItem1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {actions.jMenuItem1ActionPerformed(evt);}
        });
        mainFrame.getjMenuItem3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {actions.jMenuItem3ActionPerformed(evt);}
        });
        mainFrame.getFrame().addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {actions.formComponentResized(evt);}
        });
    }

    //Constructor for the subclass which stores the actions
    private EventActions setEventActions(ScatterPlotPanel scatterPlotPanel, HistogramPanel histogramPanel1, HistogramPanel histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorChooser colorChooser,Frame mainFrame) {
        EventActions actions = new EventActions(scatterPlotPanel, histogramPanel1, histogramPanel2, scatterPlotButtons, colorChooser, mainFrame);
        return actions;
    }
}
