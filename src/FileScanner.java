import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Matthias on 16.05.2015.
 */
public class FileScanner {
    String file;
    Variable variable1;
    Variable variable2;
    public FileScanner(String filename){
        file = filename;
        ArrayList<Variable> bothObjects = readFile(file);
        variable1 = bothObjects.get(0);
        variable2 = bothObjects.get(1);
    }
    public Variable getVariable1(){
        return variable1;
    }
    public Variable getVariable2(){
        return variable2;
    }
    private static ArrayList<Variable> readFile(String fileName) {
        File inputFileObject = new File(fileName);
        java.util.Scanner fileScannerObject = null;
        Variable variableObject1;
        Variable variableObject2;

        try {
            fileScannerObject = new java.util.Scanner(inputFileObject);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int cnt = 0;
        ArrayList<Variable> dataModelObject = new ArrayList<Variable>();
        ArrayList<Float> values1 = new ArrayList<Float>();
        ArrayList<Float> values2 = new ArrayList<Float>();
        ArrayList<Float> valuesLines1 = new ArrayList<Float>();
        ArrayList<Float> valuesLines2 = new ArrayList<Float>();
        String variableName1 = null;
        String variableName2 = null;
        if (fileScannerObject != null) try {
            int numberOfVariables = Integer.valueOf(fileScannerObject.nextLine());
            int cnt0 = 0;
            while (cnt0 < (numberOfVariables * 2) + 2) {
                if (cnt0 == 0) {
                    variableName1 = fileScannerObject.nextLine();

                } else {
                    if (cnt0 == 1) {
                        variableName2 = fileScannerObject.nextLine();

                    } else {
                        if (cnt0 == numberOfVariables + 2) {

                            String line = fileScannerObject.nextLine();
                            String[] values = line.split("\\;");
                            int cnt1 = 0;
                            while (cnt1 < values.length) {

                                float value = Float.valueOf(values[cnt1]);
                                valuesLines1.add(value);
                                cnt1++;
                            }
                        }
                        if (cnt0 == numberOfVariables + 3) {
                            String line = fileScannerObject.nextLine();
                            String[] values = line.split("\\;");
                            System.out.println(cnt0);
                            int cnt2 = 0;
                            while (cnt2 < values.length) {

                                float value = Float.valueOf(values[cnt2]);
                                valuesLines2.add(value);
                                cnt2++;
                            }
                        } else {
                            if (cnt0 == 3) {
                                String spareOne = fileScannerObject.nextLine();
                            }
                        }
                    }
                }
                cnt0 = cnt0 + 1;
            }
            variableObject1 = new Variable(variableName1, valuesLines1);
            variableObject2 = new Variable(variableName2, valuesLines2);
            dataModelObject.add(variableObject1);
            dataModelObject.add(variableObject2);
            return dataModelObject;

        } catch (NumberFormatException e) {
            cnt = 0;

            try {
                fileScannerObject = new java.util.Scanner(inputFileObject);
            } catch (FileNotFoundException e1) {
                e.printStackTrace();
            }
            while (fileScannerObject.hasNextLine()) {
                String line = fileScannerObject.nextLine();
                String[] parts;
                parts = line.split("\t");
                String variable1 = parts[0];
                String variable2 = parts[1];
                if (cnt >= 1) {
                    float value1 = Float.valueOf(variable1);
                    float value2 = Float.valueOf(variable2);
                    values1.add(value1);
                    values2.add(value2);
                } else {
                    variableName1 = variable1;
                    variableName2 = variable2;
                }
                cnt = cnt + 1;
            }

            variableObject1 = new Variable(variableName1, values1);
            variableObject2 = new Variable(variableName2, values2);
            dataModelObject.add(variableObject1);
            dataModelObject.add(variableObject2);
        }
        return dataModelObject;
    }
}

