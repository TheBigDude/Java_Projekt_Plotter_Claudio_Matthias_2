/**
 * Created by Claudio on 10.05.2015.
 */
import java.util.ArrayList;

public class Variable {

    String name;
    ArrayList werte;

    public Variable(String n, ArrayList<String> w){
        name = n;
        werte = w;
    }

    public String getName(){
        return name;
    }

    public float addValueFloat(float wert){
        return wert;
    }
}
