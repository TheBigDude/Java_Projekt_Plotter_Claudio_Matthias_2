import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ProcessVariablesForCircles {
    ArrayList<Float> coordinatesPoints = new ArrayList<Float>();
    ArrayList<Float>variableA;
    ArrayList<Float>variableB;
    public ProcessVariablesForCircles(ArrayList<Float> variableX, ArrayList<Float> variableY){
        int numberOfVariables = variableX.size();
        variableA= variableY;
        variableB= variableX;
        float maxX = Collections.max(variableB);
        float factor = 400/maxX;
        int cnt = 0;

        while(cnt< numberOfVariables&& variableB != null){
            coordinatesPoints.add(factor * variableB.get(cnt));
            coordinatesPoints.add(450 - variableY.get(cnt));
           cnt++;
        }
    }

    public ArrayList<Float> getCoordinatesPoints(){
        return coordinatesPoints;
    }

}
