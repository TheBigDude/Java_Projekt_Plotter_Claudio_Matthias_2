import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class CChooserPanel  extends JPanel {
    JPanel cChooserPanel = new JPanel();

    public CChooserPanel(JColorChooser jColorChooser1){

        GridLayout cChooserPanelLayout = new GridLayout(1,1);
        cChooserPanel.setLayout(cChooserPanelLayout);
        cChooserPanel.add(jColorChooser1);
    }
    public JPanel getCChooserPanel(){
        return cChooserPanel;
    }

}
