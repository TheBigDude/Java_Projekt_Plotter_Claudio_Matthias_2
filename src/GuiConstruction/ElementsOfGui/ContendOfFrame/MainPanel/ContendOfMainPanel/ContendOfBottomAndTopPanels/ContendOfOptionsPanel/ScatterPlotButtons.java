package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel;

import javax.swing.*;

/**
 * Created by Matthias on 03.06.2015.
 */
public class ScatterPlotButtons  {
    JLabel xAxisLabel;
    JLabel yAxisLabel;
    JLabel sizeLabel;

    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;

    ButtonGroup buttonGroup1;
    ButtonGroup buttonGroup2;

    JCheckBox lineButton;
    JSlider sizeSlider;
    public ScatterPlotButtons(){
        sizeLabel = new JLabel();
        yAxisLabel = new JLabel();
        xAxisLabel = new JLabel();

        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();

        lineButton = new JCheckBox();
        sizeSlider = new JSlider();

        //Setup der ScatterPlot Bedienelemente
        yAxisLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yAxisLabel.setText("Y - Achse");
        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Variable1");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Variable2");
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        xAxisLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        xAxisLabel.setText("X - Achse");
        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Variable1");
        jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Variable2");
        jRadioButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lineButton.setBackground(new java.awt.Color(255, 255, 255));
        lineButton.setText("mit Linie verbinden");
        lineButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sizeLabel.setText("Grösse der Punkte");
        sizeSlider.setBackground(new java.awt.Color(255, 255, 255));
        sizeSlider.setMinimum(0);
        sizeSlider.setMaximum(20);
        sizeSlider.setValue(10);

    }

    public JLabel getXAxisLabel() {
        return xAxisLabel;
    }

    public JLabel getYAxisLabel() {
        return yAxisLabel;
    }

    public JLabel getSizeLabel() {
        return sizeLabel;
    }

    public JRadioButton getRadioButton1() {
        return jRadioButton1;
    }

    public JRadioButton getRadioButton2() {
        return jRadioButton2;
    }

    public JRadioButton getRadioButton3() {
        return jRadioButton3;
    }

    public JRadioButton getRadioButton4() {
        return jRadioButton4;
    }

    public JCheckBox getLineButton() {
        return lineButton;
    }

    public JSlider getSizeSlider() {
        return sizeSlider;
    }
}
