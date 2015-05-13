/**
 * Created by Claudio on 10.05.2015.
 */
import java.util.ArrayList;

public class Variable {

    String variableName;
    ArrayList values;


    public Variable(String variable, int cnt){
        if (cnt<=1) {
            float value = Float.valueOf(variable);
            values.add(value);
        }
        else {
            variableName = variable;
        }



    }

    public String getName(){
        return variableName;
    }

    public ArrayList<Float> getValues(){
        return values;

    }
}
