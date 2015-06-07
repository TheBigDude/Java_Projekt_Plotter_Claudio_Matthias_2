package VariableProcessing;

import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ScatterPlotPanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ProcessingOfVariablesForScatterPlot {
    ArrayList<Float> coordinatesV1X = new ArrayList<Float>();
    ArrayList<Float> coordinatesV2X = new ArrayList<Float>();
    ArrayList<Float> coordinatesV2Y = new ArrayList<Float>();
    ArrayList<Float> coordinatesV1Y = new ArrayList<Float>();
    ArrayList<CreationOfCircles> allCircles = new ArrayList<CreationOfCircles>();
    int width;
    Color color;

    public ProcessingOfVariablesForScatterPlot(ActionNewFile File1, ScatterPlotPanel scatterPlotPanel, int width, Color color) {
        this.width=width;
        this.color=color;
        ArrayList<Float> valuesX;
        ArrayList<Float> valuesY;
        valuesX = File1.getVariable1().getValues();
        valuesY = File1.getVariable2().getValues();
        int panelWidth = scatterPlotPanel.getWidth();
        int panelHeight = scatterPlotPanel.getHeight();
        final int BORDER = 50;
        int widthOfDrawing = panelWidth - 2 * BORDER;
        int heightOfDrawing = panelHeight - 2 * BORDER;

        float min = Collections.min(valuesX);
        float max = Collections.max(valuesX);
        float minY = Collections.min(valuesY);
        float maxY = Collections.max(valuesY);
        float range = max - min;
        float rangeY = maxY - minY;
        for (int cnt = 0; cnt < valuesX.size(); cnt++) {
            float x = valuesX.get(cnt);
            float y = valuesY.get(cnt);
            float xBer;
            float yBer;

            xBer = widthOfDrawing * (x - min) / range + BORDER;
            coordinatesV1X.add(xBer);
            xBer = panelHeight-(heightOfDrawing * (x - min) / range + BORDER);
            coordinatesV1Y.add(xBer);

            yBer = panelHeight -(heightOfDrawing * (y - minY) / rangeY + BORDER);
            coordinatesV2Y.add(yBer);
            yBer = widthOfDrawing * (y - minY) / rangeY + BORDER;
            coordinatesV2X.add(yBer);
        }
        CreationOfCircles circles1 = makeCircles(coordinatesV1X,coordinatesV2Y,width,color);
        allCircles.add(circles1);
        CreationOfCircles circles2 = makeCircles(coordinatesV1X,coordinatesV1Y,width,color);
        allCircles.add(circles2);
        CreationOfCircles circles3 = makeCircles(coordinatesV2X,coordinatesV1Y,width,color);
        allCircles.add(circles3);
        CreationOfCircles circles4 = makeCircles(coordinatesV2X,coordinatesV2Y,width,color);
        allCircles.add(circles4);
    }
    private CreationOfCircles makeCircles(ArrayList<Float> coordinatesX, ArrayList<Float> coordinatesY, int width, Color color) {
        CreationOfCircles createdCircles = new CreationOfCircles(coordinatesX,coordinatesY,width,color);
        return createdCircles;
    }
    public ArrayList<CreationOfCircles> getAllCircles(){
        return allCircles;
    }
}



