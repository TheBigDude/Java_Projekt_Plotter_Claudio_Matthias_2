package GuiConstruction.ElementsOfGui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class Frame {
    JFrame mainFrame;
    JMenuBar jMenuBar1;
    JMenuItem jMenu1;
    JMenuItem jMenuItem1;
    JMenuItem jMenuItem3;
    public Frame(){
        mainFrame = new JFrame();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenu1.setText("Datei");
        jMenuItem1.setText("Neue Datei");
        jMenu1.add(jMenuItem1);
        jMenuItem3.setText("Beenden");
        jMenu1.add(jMenuItem3);
        jMenuBar1.add(jMenu1);

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBackground(new Color(255, 255, 255));
        mainFrame.setPreferredSize(new Dimension(1920, 1080));
        mainFrame.setMaximumSize(new java.awt.Dimension(1920, 1080));
        mainFrame.setMinimumSize(new java.awt.Dimension(150,150));
        mainFrame.setJMenuBar(jMenuBar1);

    }
    public JFrame getFrame(){
        return mainFrame;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public JMenuItem getjMenuItem3() {
        return jMenuItem3;
    }
}
