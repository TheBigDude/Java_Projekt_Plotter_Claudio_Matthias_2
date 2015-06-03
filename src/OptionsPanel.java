import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class OptionsPanel extends JPanel {
    JPanel optionsPanel = new JPanel();
    public OptionsPanel(JPanel spOptionsPanel, JPanel cChooserPanel, JPanel cChooserButtonPanel){
        optionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        optionsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        optionsPanel.setPreferredSize(new java.awt.Dimension(960,600));
        optionsPanel.setLayout(new BorderLayout());
        optionsPanel.add(spOptionsPanel, BorderLayout.WEST);
        optionsPanel.add(cChooserPanel, BorderLayout.CENTER);
        optionsPanel.add(cChooserButtonPanel, BorderLayout.EAST);
    }
    public JPanel getOptionsPanel(){
        return optionsPanel;
    }
}
