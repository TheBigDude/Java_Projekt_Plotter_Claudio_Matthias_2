package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class CChooserButtonPanel extends JPanel {
    JPanel cChooserButtonPanel = new JPanel();

    public CChooserButtonPanel(JButton colorButton, JButton colorButton2, JButton colorButton3){
        cChooserButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        cChooserButtonPanel.setPreferredSize(new java.awt.Dimension(240,600));

        //set Layout and add Buttons
        cChooserButtonPanel.setLayout(new BoxLayout(cChooserButtonPanel, BoxLayout.PAGE_AXIS));
        cChooserButtonPanel.add(Box.createRigidArea(new Dimension(0, 66)));
        colorButton.setAlignmentX(colorButton.CENTER_ALIGNMENT);
        cChooserButtonPanel.add(colorButton);
        colorButton2.setAlignmentX(colorButton2.CENTER_ALIGNMENT);
        cChooserButtonPanel.add(Box.createRigidArea(new Dimension(0,132 )));
        cChooserButtonPanel.add(colorButton2);
        cChooserButtonPanel.add(Box.createRigidArea(new Dimension(0,132 )));
        colorButton3.setAlignmentX(colorButton3.CENTER_ALIGNMENT);
        cChooserButtonPanel.add(colorButton3);
        cChooserButtonPanel.add(Box.createRigidArea(new Dimension(0,66 )));
    }
    public JPanel getCChooserButtonPanel(){
        return cChooserButtonPanel;
    }
}
