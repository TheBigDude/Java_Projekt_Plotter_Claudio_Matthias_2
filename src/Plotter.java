import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Claudio on 09.05.2015.
 */

public class Plotter {
    public static void main(String[] args) {

        // File auswählen und der Methode übergeben

        /* System.out.println("Welche Datei soll importiert werden: ");
        Scanner console = new Scanner(System.in);
        String x = console.next();

        File zuImportierendesFile = new File("zuLesendesFile.txt");
        Importer importerObjekt = new Importer(zuImportierendesFile);

        ArrayList x = new Importer(); */

        // Scanner machen   -> https://www.youtube.com/watch?v=8gLc-ne_ni0

        Variable variable = readFile("zuLesendesFile.txt");  //http://www.c4learn.com/java/java-returning-object-from-method/

        System.out.println(variable.getName());

        //System.out.println(ob1.name);

    }

    public static Variable readFile(String fileName){
        File inputFileObjekt = new File(fileName);
        Scanner fileScannerObjekt = null ;
        Variable variablenObjekt = null;
        try {
            fileScannerObjekt = new Scanner(inputFileObjekt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (fileScannerObjekt != null && fileScannerObjekt.hasNextLine()) {

            ArrayList<String> importierteWerteArray = new ArrayList<String>();

            String line = fileScannerObjekt.nextLine();

            importierteWerteArray.add(line);

            variablenObjekt = new Variable("lolo", importierteWerteArray);
        }

        return variablenObjekt;

    }

}
