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
    String fileName;
    public ActionNewFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
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