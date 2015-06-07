package EventHandling;

import javax.swing.*;

/**
 * Created by Matthias on 06.06.2015.
 */
// Creates a message dialog to tell the user that he performed a forbidden action
public class ExceptionFrame {
    JFrame exceptionFrame = new JFrame();

    public ExceptionFrame(){
        JOptionPane.showMessageDialog(exceptionFrame,
                "Bitte lesen sie eine Datei mit Daten ein. (Datei, neue Datei)",
                "Data error",
                JOptionPane.ERROR_MESSAGE);
    }

    public JFrame getExceptionFrame(){
        return exceptionFrame;
    }
}
