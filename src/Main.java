import GuiConstruction.GUI;

/**
 * Created by Matthias on 15.05.2015.
 */
public class Main {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}




