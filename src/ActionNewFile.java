import javax.swing.*;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ActionNewFile {
    Variable variable1;
    Variable variable2;
    String filename;
    public ActionNewFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        filename = fc.getSelectedFile().getName();
        FileScanner File1 = ScannFile(filename);
        variable1 = File1.getVariable1();
        variable2 = File1.getVariable2();
    }
    public static FileScanner ScannFile(String fileToScann) {
        FileScanner File1 = new FileScanner(fileToScann);
        return File1;
    }
    public Variable getVariable1(){
        return variable1;
    }
    public Variable getVariable2(){
        return variable2;
    }
    public String getFilename(){
        return filename;
    }
}