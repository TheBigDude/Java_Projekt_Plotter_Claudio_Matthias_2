import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Matthias on 04.06.2015.
 */
public class EventListeners {

    public EventListeners(DrawingOnPanel1 scatterPlotPanel, DrawingOnPanel2 histogramPanel1, DrawingOnPanel2 histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorButtons colorButtons, ColorChooser colorChooser, Frame mainFrame) {
        final EventActions actions = setEventActions(scatterPlotPanel, histogramPanel1, histogramPanel2, scatterPlotButtons, colorChooser);

        scatterPlotButtons.getRadioButton1().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                actions.jRadioButton1MouseClicked(evt);
            }
        });
        scatterPlotButtons.getRadioButton2().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                actions.jRadioButton2MouseClicked(evt);
            }
        });
        scatterPlotButtons.getRadioButton3().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                actions.jRadioButton3MouseClicked(evt);
            }
        });
        scatterPlotButtons.getRadioButton4().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                actions.jRadioButton4MouseClicked(evt);
            }
        });
        scatterPlotButtons.getLineButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actions.lineButtonActionPerformed(evt);
            }
        });
        scatterPlotButtons.getSizeSlider().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                actions.sizeSliderMouseClicked(evt);
            }
        });
        colorButtons.getColorButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actions.colorButtonMouseClicked(evt);
            }
        });
        colorButtons.getColorButton2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actions.colorButton2MouseClicked(evt);
            }
        });
        colorButtons.getColorButton3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actions.colorButton3MouseClicked(evt);
            }
        });
        mainFrame.getjMenuItem1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actions.jMenuItem1ActionPerformed(evt);
            }
        });
        mainFrame.getjMenuItem3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actions.jMenuItem3ActionPerformed(evt);
            }
        });
        mainFrame.getFrame().addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                actions.formComponentResized(evt);
            }
        });

    }
    private EventActions setEventActions(DrawingOnPanel1 scatterPlotPanel, DrawingOnPanel2 histogramPanel1, DrawingOnPanel2 histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorChooser colorChooser) {
        EventActions actions = new EventActions(scatterPlotPanel, histogramPanel1, histogramPanel2, scatterPlotButtons, colorChooser);
        return actions;
    }

}
