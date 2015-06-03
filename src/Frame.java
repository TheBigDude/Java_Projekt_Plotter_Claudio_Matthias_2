import javax.swing.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class Frame extends JFrame {
    JMenuBar jMenuBar1;
    JMenuItem jMenu1;
    JMenuItem jMenuItem1;
    JMenuItem jMenuItem3;
    Frame(){
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

    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JMenuItem getjMenu1() {
        return jMenu1;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public JMenuItem getjMenuItem3() {
        return jMenuItem3;
    }
}
