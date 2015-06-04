import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 04.06.2015.
 */
public class EventActions {
    DrawingOnPanel1 scatterPlotPanel;
    DrawingOnPanel2 histogramPanel1;
    DrawingOnPanel2 histogramPanel2;
    ScatterPlotButtons scatterPlotButtons;
    ColorChooser colorChooser;
    boolean xIsVariable1 = true;
    boolean xIsVariable2 = false;
    boolean yIsVariable1 = false;
    boolean yIsVariable2 = true;
    ArrayList<CreateCircles> allCircleObjects;
    ProcessVariablesForHistograms histogramObject1;
    ProcessVariablesForHistograms histogramObject2;
    ActionNewFile File1;
    int width = 5;
    Color color = Color.BLUE;

    public EventActions(DrawingOnPanel1 scatterPlotPanel, DrawingOnPanel2 histogramPanel1, DrawingOnPanel2 histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorChooser colorChooser){
        this.scatterPlotPanel = scatterPlotPanel;
        this.histogramPanel1 = histogramPanel1;
        this.histogramPanel2 = histogramPanel2;
        this.scatterPlotButtons = scatterPlotButtons;
        this.colorChooser = colorChooser;
    }

    private void drawOnPanels(){
        if (xIsVariable1 && yIsVariable2){
            scatterPlotPanel.addCircles(allCircleObjects.get(0));
        }
        if(xIsVariable1 && yIsVariable1){
            scatterPlotPanel.addCircles(allCircleObjects.get(1));
        }
        if(xIsVariable2 && yIsVariable1){
            scatterPlotPanel.addCircles(allCircleObjects.get(2));
        }
        if(xIsVariable2 && yIsVariable2){
            scatterPlotPanel.addCircles(allCircleObjects.get(3));
        }
        histogramPanel1.addHistogram(histogramObject1.getCreatedHistograms());
        histogramPanel2.addHistogram(histogramObject2.getCreatedHistograms());
    }
    private ActionNewFile NewAction(){
        ActionNewFile NewAction = new ActionNewFile();
        return NewAction;
    }
    private ProcessVariables processVariables(ActionNewFile File1, DrawingOnPanel1 scatterPlotPanel, int width, Color color){
        ProcessVariables processedVariables = new ProcessVariables(File1, scatterPlotPanel,width,color);
        return processedVariables;
    }
    private ProcessVariablesForHistograms processVariablesForHistograms(ArrayList<Float> values, DrawingOnPanel2 panel){
        ProcessVariablesForHistograms processedVariablesHistograms = new ProcessVariablesForHistograms(values, panel);
        return processedVariablesHistograms;
    }

    public void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean linesActivated;
        if(scatterPlotButtons.getLineButton().isSelected()) {
            linesActivated = true;
            for (int cnt = 0; cnt < allCircleObjects.size(); cnt++) {
                allCircleObjects.get(cnt).activateLines(linesActivated);
            }
        }
        else{
            linesActivated = false;
            for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
                allCircleObjects.get(cnt).activateLines(linesActivated);
            }
        }
        scatterPlotPanel.updatePanel();
    }
    public void sizeSliderMouseClicked(java.awt.event.MouseEvent evt) {

        width = scatterPlotButtons.getSizeSlider().getValue();
        for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
            allCircleObjects.get(cnt).changeRadius(width);
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
        for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
            allCircleObjects.get(cnt).changeColor(colorChooser.getColorChooser().getColor());
            color = colorChooser.getColorChooser().getColor();
            scatterPlotPanel.updatePanel();
        }
    }
    public void colorButton2MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject1.getCreatedHistograms().changeColor(colorChooser.getColorChooser().getColor());
        histogramPanel1.updatePanel();
    }
    public void colorButton3MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject2.getCreatedHistograms().changeColor(colorChooser.getColorChooser().getColor());
        histogramPanel2.updatePanel();
    }
    public void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        File1 = NewAction();
        ProcessVariables allCircles = processVariables(File1, scatterPlotPanel,width,color);
        allCircleObjects = allCircles.getAllCircles();
        histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), histogramPanel1);
        histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), histogramPanel2);

        drawOnPanels();

        histogramPanel1.setVariableNames(File1.getVariable1().getName());
        histogramPanel2.setVariableNames(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton1().setText(File1.getVariable1().getName());
        scatterPlotButtons.getRadioButton1().setSelected(true);
        scatterPlotButtons.getRadioButton2().setText(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton3().setText(File1.getVariable1().getName());
        scatterPlotButtons.getRadioButton4().setText(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton4().setSelected(true);

    }
    public void formComponentResized(java.awt.event.ComponentEvent evt) {


        if(File1!= null){

            ProcessVariables allCircles = processVariables(File1, scatterPlotPanel,width,color);
            allCircleObjects = allCircles.getAllCircles();
            histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), histogramPanel1);
            histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), histogramPanel2);

            drawOnPanels();
        }
    }
    public void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
