package VariableProcessing;

import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.HistogramPanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matthias on 28.05.2015.
 */
//calculates the coordinates of the different rectangles building the Histograms, by
//taking the actual size of the panel to draw them on (histogramPanel1/2) created by HistogramPanel class
//by passing the calculated values to CreationOfHistograms class
public class ProcessingOfVariablesForHistograms {
    ArrayList<Float> values= new ArrayList<Float>();
    HistogramPanel panel;
    ArrayList<Float> coordsY= new ArrayList<Float>();   
    int imageWidthOfBin;
    CreationOfHistograms createdHistograms;
    public ProcessingOfVariablesForHistograms(ArrayList<Float> values, HistogramPanel panel, Color color){
        this.values = values;
        this.panel = panel;
        float max = Collections.max(values) ;
        float min = Collections.min(values);
        int numberOfBins = (int) Math.sqrt(values.size());
        float binWidth = (max-min)/numberOfBins;

        int[] counts = new int[numberOfBins];
        for(int cnt = 0; cnt<counts.length; cnt++){
            counts[cnt] = 0;
        }
        for(int cnt = 0; cnt < values.size(); cnt++){
            float check = values.get(cnt);
            for(int binCounter = 0; binCounter < counts.length; binCounter++){
                if(min + binCounter*binWidth <= check && check < min + (binCounter+1)*binWidth){
                    int counter = counts[binCounter];
                    counter++;
                    counts[binCounter] = counter;
                }
            }
        }
        int imageWidth = (panel.getWidth()) - 40;

        int imageHeight = panel.getHeight();
        int maxCounts = counts[0];
        for(int cnt = 0; cnt < counts.length; cnt++){
            int tmp = counts[cnt];
            if(tmp > maxCounts){
                maxCounts = tmp;
            }
        }

        imageWidthOfBin = imageWidth/numberOfBins;

        for(int cnt = 0; cnt < counts.length; cnt++){
            float heightOfBin = (float) imageHeight/maxCounts*counts[cnt];

            coordsY.add(heightOfBin);
        }
        createdHistograms = CreateHistograms(coordsY,imageWidthOfBin,imageHeight,color);
    }

    public CreationOfHistograms getCreatedHistograms(){
        return createdHistograms;
    }

    private CreationOfHistograms CreateHistograms(ArrayList<Float> valuesY, int width, int height,Color color){
        CreationOfHistograms createdHistograms = new CreationOfHistograms(valuesY,width, height,color);
        return createdHistograms;
    }
}



