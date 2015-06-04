import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class ColorChooser {
    JColorChooser jColorChooser;
    public ColorChooser(){
        jColorChooser = new JColorChooser();
        //Color Chooser setup
        jColorChooser.setMinimumSize(new java.awt.Dimension(0,0));
        jColorChooser.setBackground(Color.WHITE);
        
    }

    public JColorChooser getColorChooser() {
        return jColorChooser;
    }
}
