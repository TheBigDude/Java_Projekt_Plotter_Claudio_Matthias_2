import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ActionNewFile {
    ArrayList<Float> coordinates;

    public ActionNewFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        String filename = fc.getSelectedFile().getName();
        FileScanner File1 = ScannFile(filename);
        ArrayList<Float> coordinatesX;
        ArrayList<Float> coordinatesY;

        coordinatesX = File1.getValuesVariable1();

        coordinatesY = File1.getValuesVariable2();
        while (coordinatesX == null) {
        }
        ;
        if (coordinatesX != null && coordinatesY != null) {
            ProcessVariablesForCircles processedValues;
            processedValues = ProcessVariables(coordinatesX, coordinatesY);
            coordinates = processedValues.getCoordinatesPoints();

        }
    }

    public static ProcessVariablesForCircles ProcessVariables(ArrayList<Float> coordinatesX, ArrayList<Float> coordinatesY) {
        ProcessVariablesForCircles processedValues = new ProcessVariablesForCircles(coordinatesX, coordinatesY);
        return processedValues;
    }

    public static FileScanner ScannFile(String fileToScann) {
        FileScanner File1 = new FileScanner(fileToScann);
        return File1;
    }


    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }
}