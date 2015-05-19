import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;
import java.util.Random;

/**
 * Created by Matthias on 19.05.2015.
 */
public class Histogram {
    int sizeOfDrawnClasses = 190;
    int numberOfClasses = 5;
    int widthOfClassVariable1;
    int widthOfClassVariable2;
    ArrayList<Float> valuesVariable1 = new ArrayList<Float>();
    ArrayList<Float> valuesVariable2 = new ArrayList<Float>();
    ArrayList<Float> coordinates;
    Color color;
    int factorForScaling1;
    int factorForScaling2;
    ArrayList<Integer> numbersOfItemsInClasses1 = new ArrayList<Integer>();
    ArrayList<Integer> numbersOfItemsInClasses2 = new ArrayList<Integer>();
    //number of elements in each class
    int v1c1 = 0;
    int v1c2 = 0;
    int v1c3 = 0;
    int v1c4 = 0;
    int v1c5 = 0;
    int v2c1 = 0;
    int v2c2 = 0;
    int v2c3 = 0;
    int v2c4 = 0;
    int v2c5 = 0;

    public Histogram(ArrayList<Float> coordinates, Color color){
        int cnt = 0;
        this.coordinates = coordinates;
        while (cnt<coordinates.size()){
            valuesVariable1.add(coordinates.get(cnt));
            valuesVariable2.add(coordinates.get(cnt+1));
        cnt = cnt+2;
        }
        int minVariable1 = Math.round(Collections.min(valuesVariable1));
        int maxVariable1 = Math.round(Collections.max(valuesVariable1));
        int minVariable2 = Math.round(Collections.min(valuesVariable2));
        int maxVariable2 = Math.round(Collections.max(valuesVariable2));
        widthOfClassVariable1 = (maxVariable1 - minVariable1)/numberOfClasses;
        widthOfClassVariable2 = (maxVariable2 - minVariable2)/numberOfClasses;
        int cnt1 = 0;
        while (cnt1 < valuesVariable1.size()){
            if(valuesVariable1.get(cnt1)<= minVariable1+widthOfClassVariable1){v1c1++;}
            if((valuesVariable1.get(cnt1)> minVariable1+widthOfClassVariable1) && (valuesVariable1.get(cnt1)<=minVariable1+2*widthOfClassVariable1)){v1c2++;}
            if((valuesVariable1.get(cnt1)> minVariable1+2*widthOfClassVariable1) && (valuesVariable1.get(cnt1)<=minVariable1+3*widthOfClassVariable1)){v1c3++;}
            if((valuesVariable1.get(cnt1)> minVariable1+3*widthOfClassVariable1) && (valuesVariable1.get(cnt1)<=minVariable1+4*widthOfClassVariable1)){v1c4++;}
            if((valuesVariable1.get(cnt1)> minVariable1+4*widthOfClassVariable1) && (valuesVariable1.get(cnt1)<=minVariable1+5*widthOfClassVariable1)){v1c5++;}

            if(valuesVariable2.get(cnt1)<= minVariable2+widthOfClassVariable2){v2c1++;}
            if((valuesVariable2.get(cnt1)> minVariable2+widthOfClassVariable2) && (valuesVariable2.get(cnt1)<=minVariable2+2*widthOfClassVariable2)){v2c2++;}
            if((valuesVariable2.get(cnt1)> minVariable2+2*widthOfClassVariable2) && (valuesVariable2.get(cnt1)<=minVariable2+3*widthOfClassVariable2)){v2c3++;}
            if((valuesVariable2.get(cnt1)> minVariable2+3*widthOfClassVariable2) && (valuesVariable2.get(cnt1)<=minVariable2+4*widthOfClassVariable2)){v2c4++;}
            if((valuesVariable2.get(cnt1)> minVariable2+4*widthOfClassVariable2) && (valuesVariable2.get(cnt1)<=minVariable2+5*widthOfClassVariable2)){v2c5++;}
            cnt1 ++;
        }
        this.color = color;
        numbersOfItemsInClasses1.add(v1c1);
        numbersOfItemsInClasses1.add(v1c2);
        numbersOfItemsInClasses1.add(v1c3);
        numbersOfItemsInClasses1.add(v1c4);
        numbersOfItemsInClasses1.add(v1c5);

        numbersOfItemsInClasses1.add(v2c1);
        numbersOfItemsInClasses1.add(v2c2);
        numbersOfItemsInClasses1.add(v2c3);
        numbersOfItemsInClasses1.add(v2c4);
        numbersOfItemsInClasses1.add(v2c5);
        factorForScaling1 = Math.round(396/Collections.max(numbersOfItemsInClasses1));

    }
    public void drawHistogram(Graphics g){
        g.setColor(color);
        g.fillRect(0,396-factorForScaling1* v1c1, sizeOfDrawnClasses,factorForScaling1 *v1c1);
        g.fillRect(sizeOfDrawnClasses,396-factorForScaling1 *v1c2, sizeOfDrawnClasses,factorForScaling1 *v1c2);
        g.fillRect(sizeOfDrawnClasses*2,396-factorForScaling1 *v1c3, sizeOfDrawnClasses,factorForScaling1 *v1c3);
        g.fillRect(sizeOfDrawnClasses*3,396-factorForScaling1 *v1c4, sizeOfDrawnClasses,factorForScaling1 *v1c4);
        g.fillRect(sizeOfDrawnClasses*4,396-factorForScaling1 *v1c5, sizeOfDrawnClasses,factorForScaling1 *v1c5);
        Random randomColor = new Random();
        float r = randomColor.nextFloat();
        float h = randomColor.nextFloat();
        float b = randomColor.nextFloat();
        Color randomColorforPlot = new Color(r, h, b);
        g.setColor(randomColorforPlot);
        g.fillRect(sizeOfDrawnClasses*5,396-factorForScaling1 *v2c1, sizeOfDrawnClasses,factorForScaling1 *v2c1);
        g.fillRect(sizeOfDrawnClasses*6,396-factorForScaling1 *v2c2, sizeOfDrawnClasses,factorForScaling1 *v2c2);
        g.fillRect(sizeOfDrawnClasses*7,396-factorForScaling1 *v2c3, sizeOfDrawnClasses,factorForScaling1 *v2c3);
        g.fillRect(sizeOfDrawnClasses*8,396-factorForScaling1 *v2c4, sizeOfDrawnClasses,factorForScaling1 *v2c4);
        g.fillRect(sizeOfDrawnClasses*9,396-factorForScaling1 *v2c5, sizeOfDrawnClasses,factorForScaling1 *v2c5);
        g.setColor(Color.BLACK);
        g.drawRect(0,396-factorForScaling1* v1c1, sizeOfDrawnClasses,factorForScaling1 *v1c1);
        g.drawRect(sizeOfDrawnClasses,396-factorForScaling1 *v1c2, sizeOfDrawnClasses,factorForScaling1 *v1c2);
        g.drawRect(sizeOfDrawnClasses*2,396-factorForScaling1 *v1c3, sizeOfDrawnClasses,factorForScaling1 *v1c3);
        g.drawRect(sizeOfDrawnClasses*3,396-factorForScaling1 *v1c4, sizeOfDrawnClasses,factorForScaling1 *v1c4);
        g.drawRect(sizeOfDrawnClasses*4,396-factorForScaling1 *v1c5, sizeOfDrawnClasses,factorForScaling1 *v1c5);
        g.drawRect(sizeOfDrawnClasses*5,396-factorForScaling1 *v2c1, sizeOfDrawnClasses,factorForScaling1 *v2c1);
        g.drawRect(sizeOfDrawnClasses*6,396-factorForScaling1 *v2c2, sizeOfDrawnClasses,factorForScaling1 *v2c2);
        g.drawRect(sizeOfDrawnClasses*7,396-factorForScaling1 *v2c3, sizeOfDrawnClasses,factorForScaling1 *v2c3);
        g.drawRect(sizeOfDrawnClasses*8,396-factorForScaling1 *v2c4, sizeOfDrawnClasses,factorForScaling1 *v2c4);
        g.drawRect(sizeOfDrawnClasses*9,396-factorForScaling1 *v2c5, sizeOfDrawnClasses,factorForScaling1 *v2c5);
    }
}
