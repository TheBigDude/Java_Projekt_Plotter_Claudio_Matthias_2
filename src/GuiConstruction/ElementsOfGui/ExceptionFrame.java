package GuiConstruction.ElementsOfGui;

import javax.swing.*;

/**
 * Created by Matthias on 06.06.2015.
 */
public class ExceptionFrame {
    JFrame exceptionFrame = new JFrame();

    public ExceptionFrame(){
        JOptionPane.showMessageDialog(exceptionFrame, "Bitte waelen sie eine Datei aus. (Datei, neue Datei)");

    }

    public JFrame getExceptionFrame(){
        return exceptionFrame;
    }
}
