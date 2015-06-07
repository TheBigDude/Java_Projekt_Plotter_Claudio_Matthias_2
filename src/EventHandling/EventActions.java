package EventHandling;

import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ColorChooser;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ScatterPlotButtons;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.HistogramPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ScatterPlotPanel;
import VariableProcessing.ActionNewFile;
import VariableProcessing.CreationOfCircles;
import VariableProcessing.ProcessingOfVariablesForHistograms;
import VariableProcessing.ProcessingOfVariablesForScatterPlot;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 04.06.2015.
 */
// stores the methods being triggered by the events of EventListeners class
public class EventActions {
    GuiConstruction.ElementsOfGui.Frame mainFrame;
    ScatterPlotPanel scatterPlotPanel;
    HistogramPanel histogramPanel1;
    HistogramPanel histogramPanel2;
    ScatterPlotButtons scatterPlotButtons;
    ColorChooser colorChooser;

    ArrayList<CreationOfCircles> allCircleObjects;
    ProcessingOfVariablesForHistograms histogramObject1;
    ProcessingOfVariablesForHistograms histogramObject2;
    ActionNewFile File1;

    //Initial values for Plot settings
    boolean xIsVariable1 = true;
    boolean xIsVariable2 = false;
    boolean yIsVariable1 = false;
    boolean yIsVariable2 = true;
    boolean linesActivated;
    int width = 5;
    Color histogramColor1 = Color.GREEN;
    Color histogramColor2 = Color.MAGENTA;
    Color color = Color.BLUE;

    public EventActions(ScatterPlotPanel scatterPlotPanel, HistogramPanel histogramPanel1, HistogramPanel histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorChooser colorChooser, GuiConstruction.ElementsOfGui.Frame mainFrame){
        this.mainFrame = mainFrame;
        this.scatterPlotPanel = scatterPlotPanel;
        this.histogramPanel1 = histogramPanel1;
        this.histogramPanel2 = histogramPanel2;
        this.scatterPlotButtons = scatterPlotButtons;
        this.colorChooser = colorChooser;
    }

    // actions being performed on the different elements
    public void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {

        if(scatterPlotButtons.getLineButton().isSelected()) {
            linesActivated = true;
            try{
                for (int cnt = 0; cnt < allCircleObjects.size(); cnt++) {
                    allCircleObjects.get(cnt).activateLines(linesActivated);
                }
            }catch(NullPointerException npe){
                ExceptionFrame exceptionFrame= new ExceptionFrame();
                exceptionFrame.getExceptionFrame();
            }
        }

        else{
            linesActivated = false;
            try {
                for (int cnt = 0; cnt < allCircleObjects.size(); cnt++) {
                    allCircleObjects.get(cnt).activateLines(linesActivated);
                }
            }catch(NullPointerException npe) {
                ExceptionFrame exceptionFrame = new ExceptionFrame();
                exceptionFrame.getExceptionFrame();
            }
        }
        scatterPlotPanel.updatePanel();
    }
    public void sizeSliderMouseReleased(java.awt.event.MouseEvent evt) {

        width = scatterPlotButtons.getSizeSlider().getValue();
        try{
            for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
                allCircleObjects.get(cnt).changeRadius(width);
            }
        }catch(NullPointerException npe) {
            ExceptionFrame exceptionFrame = new ExceptionFrame();
            exceptionFrame.getExceptionFrame();
        }
        scatterPlotButtons.getSizeSlider().setValue(width);
        scatterPlotPanel.updatePanel();
    }
    public void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {
        if (scatterPlotButtons.getRadioButton1().isSelected()){xIsVariable1 = true; xIsVariable2 = false;}
        else{
            xIsVariable1 = true;
            xIsVariable2 = false;
        }
        scatterPlotPanel.clearPanel();
        drawOnPanels();
    }
    public void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {
        if (scatterPlotButtons.getRadioButton2().isSelected()){xIsVariable2 = true; xIsVariable1= false;}
        else{
            xIsVariable2 = true;
            xIsVariable1 = false;
        }
        scatterPlotPanel.clearPanel();
        drawOnPanels();
    }
    public void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {
        if(scatterPlotButtons.getRadioButton3().isSelected()){yIsVariable1 = true; yIsVariable2 = false;}
        else{
            yIsVariable1= true;
            yIsVariable2= false;
        }
        scatterPlotPanel.clearPanel();
        drawOnPanels();
    }
    public void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {
        if(scatterPlotButtons.getRadioButton4().isSelected()){yIsVariable2 = true;yIsVariable1 = false;}
        else
        {    yIsVariable2= true;
            yIsVariable1= false;
        }
        scatterPlotPanel.clearPanel();
        drawOnPanels();
    }
    public void colorButtonMouseClicked(java.awt.event.ActionEvent evt) {
        try {
            for (int cnt = 0; cnt < allCircleObjects.size(); cnt++) {
                allCircleObjects.get(cnt).changeColor(colorChooser.getColorChooser().getColor());
                color = colorChooser.getColorChooser().getColor();
                scatterPlotPanel.updatePanel();
            }
        }
        catch(NullPointerException npe) {
            ExceptionFrame exceptionFrame = new ExceptionFrame();
            exceptionFrame.getExceptionFrame();
        }
    }
    public void colorButton2MouseClicked(java.awt.event.ActionEvent evt) {
        try{
            histogramObject1.getCreatedHistograms().changeColor(colorChooser.getColorChooser().getColor());
            histogramColor1 = colorChooser.getColorChooser().getColor();
            histogramPanel1.updatePanel();
        }catch(NullPointerException npe) {
            ExceptionFrame exceptionFrame = new ExceptionFrame();
            exceptionFrame.getExceptionFrame();
        }
    }
    public void colorButton3MouseClicked(java.awt.event.ActionEvent evt) {
        try {
            histogramObject2.getCreatedHistograms().changeColor(colorChooser.getColorChooser().getColor());
            histogramColor2 = colorChooser.getColorChooser().getColor();
            histogramPanel2.updatePanel();
        }catch(NullPointerException npe) {
            ExceptionFrame exceptionFrame = new ExceptionFrame();
            exceptionFrame.getExceptionFrame();
        }
    }
    public void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        File1 = NewAction();
        ProcessingOfVariablesForScatterPlot allCircles = processVariables(File1, scatterPlotPanel,width,color);
        allCircleObjects = allCircles.getAllCircles();
        histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), histogramPanel1,histogramColor1);
        histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), histogramPanel2,histogramColor2);

        drawOnPanels();

        histogramPanel1.setVariableNames(File1.getVariable1().getName());
        histogramPanel2.setVariableNames(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton1().setText(File1.getVariable1().getName());
        scatterPlotButtons.getRadioButton1().setSelected(true);
        scatterPlotButtons.getRadioButton2().setText(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton3().setText(File1.getVariable1().getName());
        scatterPlotButtons.getRadioButton4().setText(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton4().setSelected(true);
        mainFrame.getFrame().setTitle(File1.getFileName());
    }
    public void formComponentResized(java.awt.event.ComponentEvent evt) {

        if(File1!= null){

            ProcessingOfVariablesForScatterPlot allCircles = processVariables(File1, scatterPlotPanel,width,color);
            allCircleObjects = allCircles.getAllCircles();
            histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), histogramPanel1,histogramColor1);
            histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), histogramPanel2, histogramColor2);

            drawOnPanels();
            if (linesActivated){
                for (int cnt = 0; cnt < allCircleObjects.size(); cnt++) {
                    allCircleObjects.get(cnt).activateLines(linesActivated);
                }
            }
            scatterPlotPanel.updatePanel();
        }
    }
    public void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    //Add the calculated plots to their panels
    private void drawOnPanels(){
        try {
            if (xIsVariable1 && yIsVariable2) {
                scatterPlotPanel.addCircles(allCircleObjects.get(0));
            }
            if (xIsVariable1 && yIsVariable1) {
                scatterPlotPanel.addCircles(allCircleObjects.get(1));
            }
            if (xIsVariable2 && yIsVariable1) {
                scatterPlotPanel.addCircles(allCircleObjects.get(2));
            }
            if (xIsVariable2 && yIsVariable2) {
                scatterPlotPanel.addCircles(allCircleObjects.get(3));
            }
            histogramPanel1.addHistogram(histogramObject1.getCreatedHistograms());
            histogramPanel2.addHistogram(histogramObject2.getCreatedHistograms());
        }catch(NullPointerException npe) {
            ExceptionFrame exceptionFrame = new ExceptionFrame();
            exceptionFrame.getExceptionFrame();
        }
    }

    //Constructors
    private ActionNewFile NewAction(){
        ActionNewFile NewAction = new ActionNewFile();
        return NewAction;
    }
    private ProcessingOfVariablesForScatterPlot processVariables(ActionNewFile File1, ScatterPlotPanel scatterPlotPanel, int width, Color color){
        ProcessingOfVariablesForScatterPlot processedVariables = new ProcessingOfVariablesForScatterPlot(File1, scatterPlotPanel,width,color);
        return processedVariables;
    }
    private ProcessingOfVariablesForHistograms processVariablesForHistograms(ArrayList<Float> values, HistogramPanel panel,Color color){
        ProcessingOfVariablesForHistograms processedVariablesHistograms = new ProcessingOfVariablesForHistograms(values, panel,color);
        return processedVariablesHistograms;
    }
}
