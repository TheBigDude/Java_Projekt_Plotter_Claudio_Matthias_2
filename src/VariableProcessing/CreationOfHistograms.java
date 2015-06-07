package VariableProcessing;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 28.05.2015.
 */
// draws histograms with the processed values which it gets
// by ProcessingOfVariablesForHistograms class
// on an object of HistogramPanel class, when method "drawHistogram()" is called by HistogramPanel class
// the instance variable color is changeable by calling the method changeColor
// in the event routine
public class CreationOfHistograms {
    ArrayList<Float> valuesY;
    int imageWidthOfBin;
    int imageHeight;
    int numberOfBins = 0;
    Color color1;

    public CreationOfHistograms(ArrayList<Float> valuesY, int imageWidthOfBin, int imageHeight, Color color){
        color1 = color;
        this.valuesY = valuesY;
        this.imageWidthOfBin = imageWidthOfBin;
        this.imageHeight = imageHeight;
    }
    public void drawHistogram(Graphics g){

        for (int cnt=0; cnt < valuesY.size(); cnt++){
            g.setColor(color1);
            g.fillRect(20 + cnt * imageWidthOfBin, imageHeight - Math.round(valuesY.get(cnt)), imageWidthOfBin, Math.round(valuesY.get(cnt)));
            g.setColor(Color.BLACK);
            g.drawRect(20+cnt*imageWidthOfBin,imageHeight - Math.round(valuesY.get(cnt)),imageWidthOfBin,Math.round(valuesY.get(cnt)));
            numberOfBins ++;
        }
    }
    public void changeColor(Color color){
        color1 = color;
    }
}
