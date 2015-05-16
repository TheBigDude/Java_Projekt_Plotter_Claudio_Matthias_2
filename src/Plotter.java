import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matthias on 15.05.2015.
 */
public class Plotter {
    public static void main(String[] args) {
    FileScanner File1 = ScannFile("test2.txt");
    System.out.println(File1.getNameVariable1());
    System.out.println(File1.getNameVariable2());
    System.out.println(File1.getValuesVariable1());
    System.out.println(File1.getValuesVariable2());


    }
    public static FileScanner ScannFile(String fileToScann){
        FileScanner File1 = new FileScanner(fileToScann);
        return File1;
    }


}
