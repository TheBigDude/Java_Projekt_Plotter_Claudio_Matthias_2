package ScanAndSaveDataOfFiles; /**
 * Created by Matthias on 15.05.2015.
 */
import java.util.ArrayList;

// stores the data it gets from FileScanner class
public class Variable {

    String variableName;
    ArrayList values;

    public Variable(String variable, ArrayList<Float> values){
        variableName = variable;
        this.values = values;
    }

    public String getName(){
        return variableName;
    }

    public ArrayList<Float> getValues(){
        return values;
    }
}
