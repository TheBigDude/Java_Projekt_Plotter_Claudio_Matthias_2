import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 17.05.2015.
 */
public class GUI {

    public GUI() {
        initComponents();
    }

    private void initComponents() {

        colorButtons = makeColorButtons();
        scatterPlotButtons = makeScatterPlotButtons();
        colorChooser = makeColorChooser();
        scatterPlotPanel = makeScatterPlotPanel();
        histogramPanel1 = makeHistogramPanel();
        histogramPanel2 = makeHistogramPanel();
        mainFrame = makeFrame();

        //eventRoutine setzen
        addEventListeners(scatterPlotPanel, histogramPanel1,histogramPanel2, scatterPlotButtons,colorButtons,colorChooser, mainFrame);

        ScatterPlotOptionsPanel spOptionsPanel = makeScatterPlotOptionsPanel(scatterPlotButtons);
        CChooserPanel cChooserPanel = makeCChooserPanel(colorChooser.getColorChooser());
        CChooserButtonPanel cChooserButtonPanel = makeCChooserButtonPanel(colorButtons.getColorButton(),colorButtons.getColorButton2(),colorButtons.getColorButton3());
        OptionsPanel optionsPanel = makeOptionsPanel(spOptionsPanel.getSpOptionsPanel(), cChooserPanel.getCChooserPanel(), cChooserButtonPanel.getCChooserButtonPanel());
        TopPanel topPanel = makeTopPanel(scatterPlotPanel, optionsPanel.getOptionsPanel());
        BottomPanel bottomPanel = makeBottomPanel(histogramPanel1,histogramPanel2);
        MainPanel mainPanel = makeMainPanel(topPanel.getTopPanel(), bottomPanel.getBottomPanel());

        mainFrame.getFrame().getContentPane().add(mainPanel.getMainPanel(), BorderLayout.CENTER);
        mainFrame.getFrame().pack();
        mainFrame.getFrame().setVisible(true);
    }

    //Objekte initialisieren;
    private ColorButtons makeColorButtons(){
        ColorButtons colorButtons = new ColorButtons();
        return colorButtons;
    }
    private ScatterPlotButtons makeScatterPlotButtons(){
        ScatterPlotButtons scatterPlotButtons = new ScatterPlotButtons();
        return scatterPlotButtons;
    }
    private ColorChooser makeColorChooser(){
        ColorChooser colorChooser = new ColorChooser();
        return colorChooser;
    }
    private Frame makeFrame(){
        Frame mainFrame = new Frame();
        return mainFrame;
    }
    private MainPanel makeMainPanel(JPanel topPanel, JPanel bottomPanel){
        MainPanel mainPanel = new MainPanel(topPanel, bottomPanel);
        return mainPanel;
    }
    private TopPanel makeTopPanel(DrawingOnPanel1 scatterPlotPanel, JPanel optionsPanel){
        TopPanel topPanel = new TopPanel(scatterPlotPanel, optionsPanel);
        return topPanel;
    }
    private BottomPanel makeBottomPanel(DrawingOnPanel2 histogramPanel1, DrawingOnPanel2 histogramPanel2){
        BottomPanel bottomPanel = new BottomPanel(histogramPanel1, histogramPanel2);
        return bottomPanel;
    }
    private OptionsPanel makeOptionsPanel(JPanel spOptionsPanel, JPanel cChooserPanel, JPanel cChooserButtonPanel){
        OptionsPanel optionsPanel = new OptionsPanel(spOptionsPanel, cChooserPanel,cChooserButtonPanel);
        return optionsPanel;
    }
    private CChooserPanel makeCChooserPanel(JColorChooser jColorChooser1){
        CChooserPanel cChooserPanel = new CChooserPanel(jColorChooser1);
        return cChooserPanel;
    }
    private CChooserButtonPanel makeCChooserButtonPanel(JButton colorButton, JButton colorButton2, JButton colorButton3){
        CChooserButtonPanel cChooserButtonPanel = new CChooserButtonPanel(colorButton,colorButton2,colorButton3);
        return cChooserButtonPanel;
    }
    private ScatterPlotOptionsPanel makeScatterPlotOptionsPanel(ScatterPlotButtons scatterPlotButtons){
        ScatterPlotOptionsPanel scatterPlotOptionsPanel = new ScatterPlotOptionsPanel(scatterPlotButtons);
        return scatterPlotOptionsPanel;
    }
    private DrawingOnPanel1 makeScatterPlotPanel(){
        DrawingOnPanel1 scatterPlotPanel= new DrawingOnPanel1();
        return scatterPlotPanel;
    }
    private DrawingOnPanel2 makeHistogramPanel(){
        DrawingOnPanel2 histogramPanel= new DrawingOnPanel2();
        return histogramPanel;
    }
    private void addEventListeners(DrawingOnPanel1 scatterPlotPanel, DrawingOnPanel2 histogramPanel1, DrawingOnPanel2 histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorButtons colorButtons, ColorChooser colorChooser, Frame mainFrame){
        new EventListeners(scatterPlotPanel, histogramPanel1,histogramPanel2, scatterPlotButtons,colorButtons,colorChooser, mainFrame);
    }

    // Variables declaration
    private DrawingOnPanel1 scatterPlotPanel;
    private DrawingOnPanel2 histogramPanel1;
    private DrawingOnPanel2 histogramPanel2;
    private ScatterPlotButtons scatterPlotButtons;
    private ColorChooser colorChooser;
    private ColorButtons colorButtons;
    private Frame mainFrame;
    // End of variables declaration
}