/**
 * Created by Claudio on 09.05.2015.
 */
/*
public class Importer {

    // Scanner machen   -> https://www.youtube.com/watch?v=8gLc-ne_ni0
    Scanner dokumentenScanner;

    Importer(File fileName){
        try {
            dokumentenScanner = new Scanner(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Methode machen
    public ArrayList Importer() {
        ArrayList<String> importierteWerte = null;
        if (dokumentenScanner.hasNext()) {
            String wort = dokumentenScanner.nextLine();

            // Speicher in Klasse Variable
            importierteWerte = new ArrayList<String>();

            String line = dokumentenScanner.nextLine();

            importierteWerte.add(line);

            Variable variableObjekt = new Variable("lolo", importierteWerte);
        }
        return importierteWerte;
    }

    public void schliessen(){
        dokumentenScanner.close();
    }
}*/