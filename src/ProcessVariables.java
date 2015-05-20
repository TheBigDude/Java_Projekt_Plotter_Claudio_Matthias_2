import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ProcessVariables {
    ArrayList<Float> coordinatesPoints = new ArrayList<Float>();
    ArrayList<Float>variableA;
    ArrayList<Float>variableB;
    float maxX;
    float maxY;
    ArrayList<Float>absoluteValuesA = new ArrayList<Float>();
    ArrayList<Float>absoluteValuesB = new ArrayList<Float>();
    public ProcessVariables(ArrayList<Float> variableX, ArrayList<Float> variableY){
        int numberOfVariables = variableX.size();
        variableA= variableY;
        variableB= variableX;
        int cnt = 0;
        while ( cnt<variableB.size()){
            absoluteValuesB.add(Math.abs(variableB.get(cnt)));
            absoluteValuesA.add(Math.abs(variableA.get(cnt)));
            cnt++;
        }

        maxX = Collections.max(absoluteValuesB);
        maxY = Collections.max(absoluteValuesA);

        int cnt1 = 0;
        while(cnt1< numberOfVariables&& variableB != null){
            coordinatesPoints.add(variableB.get(cnt1));
            coordinatesPoints.add(variableA.get(cnt1));
           cnt1++;
        }
    }

    public ArrayList<Float> getCoordinatesPoints(){
        return coordinatesPoints;
    }
    public float getMaxX(){
        return maxX;
    }
    public float getMaxY(){
        return maxY;
    }
}
