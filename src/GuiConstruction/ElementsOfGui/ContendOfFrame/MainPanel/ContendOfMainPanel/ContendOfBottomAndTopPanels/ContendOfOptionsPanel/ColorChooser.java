package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel;

import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class ColorChooser {
    JColorChooser jColorChooser;
    public ColorChooser(){
        jColorChooser = new JColorChooser();
        //Color Chooser setup
        AbstractColorChooserPanel[] panels = jColorChooser.getChooserPanels();
        for(AbstractColorChooserPanel p:panels) {
            String displayName = p.getDisplayName();

            if (displayName.equals("HSV")) {
                jColorChooser.removeChooserPanel(p);
            }
            if (displayName.equals("HSL")){
                jColorChooser.removeChooserPanel(p);
            }
            if( displayName.equals("CMYK")) {
                jColorChooser.removeChooserPanel(p);
            }

            p.setBackground(Color.WHITE);

            }

        jColorChooser.setMinimumSize(new java.awt.Dimension(0,0));
        jColorChooser.setBackground(Color.WHITE);

    }

    public JColorChooser getColorChooser() {
        return jColorChooser;
    }
}
