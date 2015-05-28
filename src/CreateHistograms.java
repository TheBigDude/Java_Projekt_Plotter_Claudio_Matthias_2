import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Matthias on 28.05.2015.
 */
public class CreateHistograms {
    ArrayList<Float> valuesY;
    int imageWidthOfBin;
    int imageHeight;
    int numberOfBins = 0;

    Random randomColor = new Random();
    float r = randomColor.nextFloat();
    float h = randomColor.nextFloat();
    float b = randomColor.nextFloat();
    Color color1 = new Color(r, h, b);

    public CreateHistograms(ArrayList<Float> valuesY, int imageWidthOfBin, int imageHeight){
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
