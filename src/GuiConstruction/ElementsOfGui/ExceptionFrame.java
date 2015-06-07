package GuiConstruction.ElementsOfGui;

import javax.swing.*;

/**
 * Created by Matthias on 06.06.2015.
 */
public class ExceptionFrame {
    JFrame exceptionFrame = new JFrame();

    public ExceptionFrame(){
        JOptionPane.showMessageDialog(exceptionFrame,
                "Bitte lesen sie eine Datei mit Daten ein. (Datei, neue Datei",
                "Data error",
                JOptionPane.ERROR_MESSAGE);
    }

    public JFrame getExceptionFrame(){
        return exceptionFrame;
    }
}
