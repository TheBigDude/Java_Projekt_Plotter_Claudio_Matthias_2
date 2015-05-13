import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Claudio on 09.05.2015.
 */

public class Plotter {
    public static void main(String[] args) {

        //Variable variable1 = readFile("zuLesendesFile.txt");
        //Variable variable2 = readFile("zuLesendesFile.txt");

        ArrayList<Variable> beideObjekte = readFile("zuLesendesFile.txt");
        Variable variable1 = beideObjekte.get(0);
        Variable variable2 = beideObjekte.get(1);


        System.out.println(variable1.getName());
        System.out.println(variable1.getValues());
        System.out.println(variable2.getName());
        System.out.println(variable2.getValues());
    }

    public static ArrayList<Variable> readFile(String fileName) {
        File inputFileObjekt = new File(fileName);
        Scanner fileScannerObjekt = null;
        Variable variablenObjekt1;
        Variable variablenObjekt2;
        try {
            fileScannerObjekt = new Scanner(inputFileObjekt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int cnt = 0;
        ArrayList<Variable> dataModelObjekt = new ArrayList<Variable>();
        while (fileScannerObjekt != null && fileScannerObjekt.hasNextLine()) {


            String line = fileScannerObjekt.nextLine();
            String[] parts = line.split("   ");
            String variable1 = parts[0];
            String variable2 = parts[1];


            variablenObjekt1 = new Variable(variable1, cnt);
            variablenObjekt2 = new Variable(variable2, cnt);




            cnt = cnt + 1;
        }
        dataModelObjekt.add(variablenObjekt1);
        dataModelObjekt.add(variablenObjekt2);
        return dataModelObjekt;


    }

}
