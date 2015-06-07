package GuiConstruction;

import EventHandling.EventListeners;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.BottomPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.CChooserButtonPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.CChooserPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ColorButtons;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ColorChooser;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ScatterPlotButtons;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ContendOfOptionsPanel.ScatterPlotOptionsPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.HistogramPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.OptionsPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.ContendOfBottomAndTopPanels.ScatterPlotPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.ContendOfMainPanel.TopPanel;
import GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel.MainPanel;
import GuiConstruction.ElementsOfGui.Frame;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Matthias on 17.05.2015.
 */
public class GUI {
    //Central Point of all classes combining all elements of the program
    //GUI() called in Main class will show the main Frame containing all
    //functions and elements.
    public GUI() {
        initComponents();
    }

    //set up all elements of the GUI


    private void initComponents() {

        colorButtons = makeColorButtons();
        scatterPlotButtons = makeScatterPlotButtons();
        colorChooser = makeColorChooser();
        scatterPlotPanel = makeScatterPlotPanel();
        histogramPanel1 = makeHistogramPanel();
        histogramPanel2 = makeHistogramPanel();
        mainFrame = makeFrame();

        //add event routine to the elements
        addEventListeners(scatterPlotPanel, histogramPanel1,histogramPanel2, scatterPlotButtons,colorButtons,colorChooser, mainFrame);

        //adding all elements to their panels, and adding all panels to their parent panel
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

    //Constructors
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
    private TopPanel makeTopPanel(ScatterPlotPanel scatterPlotPanel, JPanel optionsPanel){
        TopPanel topPanel = new TopPanel(scatterPlotPanel, optionsPanel);
        return topPanel;
    }
    private BottomPanel makeBottomPanel(HistogramPanel histogramPanel1, HistogramPanel histogramPanel2){
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
    private ScatterPlotPanel makeScatterPlotPanel(){
        ScatterPlotPanel scatterPlotPanel= new ScatterPlotPanel();
        return scatterPlotPanel;
    }
    private HistogramPanel makeHistogramPanel(){
        HistogramPanel histogramPanel= new HistogramPanel();
        return histogramPanel;
    }
    private void addEventListeners(ScatterPlotPanel scatterPlotPanel, HistogramPanel histogramPanel1, HistogramPanel histogramPanel2, ScatterPlotButtons scatterPlotButtons, ColorButtons colorButtons, ColorChooser colorChooser, Frame mainFrame){
        new EventListeners(scatterPlotPanel, histogramPanel1,histogramPanel2, scatterPlotButtons,colorButtons,colorChooser, mainFrame);
    }

    // Variables declaration
    private ScatterPlotPanel scatterPlotPanel;
    private HistogramPanel histogramPanel1;
    private HistogramPanel histogramPanel2;
    private ScatterPlotButtons scatterPlotButtons;
    private ColorChooser colorChooser;
    private ColorButtons colorButtons;
    private Frame mainFrame;
}