package VariableProcessing;

import ScanAndSaveDataOfFiles.FileScanner;
import ScanAndSaveDataOfFiles.Variable;

import javax.swing.*;

/**
 * Created by Matthias on 17.05.2015.
 */
// opens a fileChooser where the user can chose the file with his data, the file has to be in the projects folder!
// and passes the file name to FileScanner class
public class ActionNewFile {
    Variable variable1;
    Variable variable2;
    static String fileName;
    public ActionNewFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        if(fc.getSelectedFile() == null){
            if(getFileName() != null){
                FileScanner File1 = scanFile(fileName);
                variable1 = File1.getVariable1();
                variable2 = File1.getVariable2();
                return;
            }
            else{
                while(fc.getSelectedFile() == null){
                    fc.showOpenDialog(null);
                }
            }
        }
        fileName = fc.getSelectedFile().getName();
        FileScanner File1 = scanFile(fileName);
        variable1 = File1.getVariable1();
        variable2 = File1.getVariable2();
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

    //Constructor for FileScanner
    private static FileScanner scanFile(String fileToScan) {
        FileScanner File1 = new FileScanner(fileToScan);
        return File1;
    }
}