import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ActionNewFile {
    ArrayList<Float> coordinates;
    String NameVariable1;
    String NameVariable2;
    float maxX;
    float maxY;
    public ActionNewFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        String filename = fc.getSelectedFile().getName();
        FileScanner File1 = ScannFile(filename);
        ArrayList<Float> coordinatesX;
        ArrayList<Float> coordinatesY;

        coordinatesX = File1.getValuesVariable1();

        coordinatesY = File1.getValuesVariable2();
        Float maxV1;
        Float maxV2;


        NameVariable1 = File1.getNameVariable1();
        NameVariable2 = File1.getNameVariable2();

        while (coordinatesX == null) {
        }
        ;
        if (coordinatesX != null && coordinatesY != null) {
            ProcessVariables processedValues;
            processedValues = ProcessVariables(coordinatesX, coordinatesY);
            coordinates = processedValues.getCoordinatesPoints();
            maxX = processedValues.getMaxX();
            maxY = processedValues.getMaxY();

        }
    }

    public static ProcessVariables ProcessVariables(ArrayList<Float> coordinatesX, ArrayList<Float> coordinatesY) {
        ProcessVariables processedValues = new ProcessVariables(coordinatesX, coordinatesY);
        return processedValues;
    }

    public static FileScanner ScannFile(String fileToScann) {
        FileScanner File1 = new FileScanner(fileToScann);
        return File1;
    }


    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }
    public String getNameVariable1(){
        return NameVariable1;
    }
    public String getNameVariable2(){
        return NameVariable2;
    }
    public float getFactorV1X(){
        float factorV1X = 450/maxX;
        return factorV1X;
    }
    public float getFactorV1Y(){
        float factorV1Y = 300/maxX;
        return factorV1Y;
    }
    public float getFactorV2X(){
        float factorV2X = 450/maxY;
        return factorV2X;
    }
    public float getFactorV2Y(){
        float factorV2Y = 300/maxY;
        return factorV2Y;
    }
}
