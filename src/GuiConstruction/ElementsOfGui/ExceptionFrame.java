package GuiConstruction.ElementsOfGui;

import javax.swing.*;

/**
 * Created by Claudio on 06.06.2015.
 */
public class ExceptionFrame {
    JFrame exceptionFrame = new JFrame();

    public ExceptionFrame(){

        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 75;
        exceptionFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        JLabel label = new JLabel("Bitte zuerst eine Datei auswählen");
        JPanel panel = new JPanel();
        panel.add(label);
        exceptionFrame.add(panel);
        exceptionFrame.setLocationRelativeTo(null);
        exceptionFrame.setVisible(true);
    }

    public JFrame getExceptionFrame(){
        return exceptionFrame;
    }
}
