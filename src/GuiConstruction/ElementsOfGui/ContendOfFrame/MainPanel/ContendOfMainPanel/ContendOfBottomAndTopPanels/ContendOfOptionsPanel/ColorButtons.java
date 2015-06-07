package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel;

import javax.swing.*;

/**
 * Created by Matthias on 03.06.2015.
 */
// Creates 3 buttons for CChooserButtonPanel class
public class ColorButtons extends JButton {
    JButton colorButton;
    JButton colorButton2;
    JButton colorButton3;

    public ColorButtons(){
        colorButton = new JButton();
        colorButton2 = new JButton();
        colorButton3 = new JButton();
        //cChooserButtons setup
        colorButton.setText("Scatterplot Faerben");
        colorButton.setMaximumSize(new java.awt.Dimension(240, 66));
        colorButton.setPreferredSize(new java.awt.Dimension(240, 66));

        colorButton2.setText("Histogram links Faerben");
        colorButton2.setMaximumSize(new java.awt.Dimension(240, 66));
        colorButton2.setPreferredSize(new java.awt.Dimension(240, 66));

        colorButton3.setText("Histogram rechts Faerben");
        colorButton3.setMaximumSize(new java.awt.Dimension(240, 66));
        colorButton3.setPreferredSize(new java.awt.Dimension(240, 66));
    }

    public JButton getColorButton(){
        return colorButton;
    }
    public JButton getColorButton2(){
        return colorButton2;
    }
    public JButton getColorButton3(){
        return colorButton3;
    }
}
