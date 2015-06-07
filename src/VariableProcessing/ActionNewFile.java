package VariableProcessing;

import ScanAndSaveDataOfFiles.FileScanner;
import ScanAndSaveDataOfFiles.Variable;

import javax.swing.*;

/**
 * Created by Matthias on 17.05.2015.
 */
public class ActionNewFile {
    Variable variable1;
    Variable variable2;
    static String fileName;
    public ActionNewFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        if(fc.getSelectedFile() == null){
            if(getFileName() != null){
                FileScanner File1 = scanFile(fileName); // Hier wird einfach repaintet mit altem filename
                variable1 = File1.getVariable1();
                variable2 = File1.getVariable2();
                return;
            }
            else{
                while(fc.getSelectedFile() == null){ // Lösung nicht so elegant. Am besten if Bedingung machen und
                    fc.showOpenDialog(null);         // File Chooser beenden und an den Anfang des Programms springen
                }
            }
        }
        fileName = fc.getSelectedFile().getName();
        FileScanner File1 = scanFile(fileName);
        variable1 = File1.getVariable1();
        variable2 = File1.getVariable2();
    }
    public static FileScanner scanFile(String fileToScan) {
        FileScanner File1 = new FileScanner(fileToScan);
        return File1;
    }
    public Variable getVariable1(){
        return variable1;
    }
    public Variable getVariable2(){
        return variable2;
    }
    public String getFileName(){
        return fileName;
    }
}