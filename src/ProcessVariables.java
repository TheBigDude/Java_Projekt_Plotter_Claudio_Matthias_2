import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ProcessVariables {
    ArrayList<Float> coordinatesV1X = new ArrayList<Float>();
    ArrayList<Float> coordinatesV2X = new ArrayList<Float>();
    ArrayList<Float> coordinatesV2Y = new ArrayList<Float>();
    ArrayList<Float> coordinatesV1Y = new ArrayList<Float>();
    ArrayList<CreateCircles> allCircles = new ArrayList<CreateCircles>();
    int width;
    Color color;


    public ProcessVariables(ActionNewFile File1, DrawingOnPanel1 panel1, int width, Color color) {
        this.width=width;
        this.color=color;
        ArrayList<Float> valuesX;
        ArrayList<Float> valuesY;
        valuesX = File1.getVariable1().getValues();
        valuesY = File1.getVariable2().getValues();
        int panelWidth = panel1.getWidth();
        int panelHeight = panel1.getHeight();
        int border = 50;
        int widthOfDrawing = panelWidth - 2 * border;
        int heightOfDrawing = panelHeight - 2 * border;

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
            if (min < 0) {
                xBer = panelWidth-((widthOfDrawing / Math.abs(min) * x + widthOfDrawing) * Math.abs(min) / (range) + border);
                coordinatesV1X.add(xBer);
                xBer = panelHeight-((heightOfDrawing / Math.abs(min) * x + heightOfDrawing) * Math.abs(min) / (range) + border);
                coordinatesV1Y.add(xBer);
            } else {
                xBer = panelWidth-((widthOfDrawing / Math.abs(min) * x - widthOfDrawing) * Math.abs(min) / (range) + border);
                coordinatesV1X.add(xBer);
                xBer = panelHeight-((heightOfDrawing / Math.abs(min) * x - heightOfDrawing) * Math.abs(min) / (range) + border);
                coordinatesV1Y.add(xBer);
            }
            if (minY < 0) {
                yBer = panelHeight-((heightOfDrawing / Math.abs(minY) * y + heightOfDrawing) * Math.abs(minY) / (rangeY) + border);
                coordinatesV2Y.add(yBer);
                yBer = panelWidth-((widthOfDrawing / Math.abs(minY) * y + widthOfDrawing) * Math.abs(minY) / (rangeY) + border);
                coordinatesV2X.add(yBer);


            } else {
                yBer = panelHeight-((heightOfDrawing / Math.abs(minY) * y - heightOfDrawing) * Math.abs(minY) / (rangeY) + border);
                coordinatesV2Y.add(yBer);
                yBer = panelWidth-((widthOfDrawing / Math.abs(minY) * y - widthOfDrawing) * Math.abs(minY) / (rangeY) + border);
                coordinatesV2X.add(yBer);
            }
        }
        CreateCircles circles1 = makeCircles(coordinatesV1X,coordinatesV2Y,width,color);
        allCircles.add(circles1);
        CreateCircles circles2 = makeCircles(coordinatesV1X,coordinatesV1Y,width,color);
        allCircles.add(circles2);
        CreateCircles circles3 = makeCircles(coordinatesV2X,coordinatesV1Y,width,color);
        allCircles.add(circles3);
        CreateCircles circles4 = makeCircles(coordinatesV2X,coordinatesV2Y,width,color);
        allCircles.add(circles4);
    }
    private CreateCircles makeCircles(ArrayList<Float> coordinatesX, ArrayList<Float> coordinatesY, int width, Color color) {
        CreateCircles createdCircles = new CreateCircles(coordinatesX,coordinatesY,width,color);
        return createdCircles;
    }
    public ArrayList<CreateCircles> getAllCircles(){
        return allCircles;
    }
}



