import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    private void initComponents() {
        ColorButtons colorButtons = makeColorButtons();
        scatterPlotButtons = makeScatterPlotButtons();
        colorChooser = makeColorChooser();
        Frame mainFrame = makeFrame();

        //eventHandlers setzen
        scatterPlotButtons.getRadioButton1().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {jRadioButton1MouseClicked(evt);}
        });
        scatterPlotButtons.getRadioButton2().addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent evt) {jRadioButton2MouseClicked(evt);}
        });
        scatterPlotButtons.getRadioButton3().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {jRadioButton3MouseClicked(evt);}
        });
        scatterPlotButtons.getRadioButton4().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {jRadioButton4MouseClicked(evt);}
        });
        scatterPlotButtons.getLineButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {lineButtonActionPerformed(evt);}
        });
        scatterPlotButtons.getSizeSlider().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {sizeSliderMouseClicked(evt);}
        });
        colorButtons.getColorButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                colorButtonMouseClicked(evt);
            }
        });
        colorButtons.getColorButton2().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                colorButton2MouseClicked(evt);
            }
        });
        colorButtons.getColorButton3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                colorButton3MouseClicked(evt);
            }
        });
        mainFrame.getjMenuItem1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mainFrame.getjMenuItem3().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });

        //Panels Definieren und in Frame setzen
        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setPreferredSize(new java.awt.Dimension(960, 600));

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setPreferredSize(new java.awt.Dimension(960, 480));

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.setPreferredSize(new java.awt.Dimension(960, 480));

        ScatterPlotOptionsPanel spOptionsPanel = makeScatterPlotOptionsPanel(scatterPlotButtons);
        CChooserPanel cChooserPanel = makeCChooserPanel(colorChooser.getColorChooser());
        CChooserButtonPanel cChooserButtonPanel = makeCChooserButtonPanel(colorButtons.getColorButton(),colorButtons.getColorButton2(),colorButtons.getColorButton3());
        OptionsPanel optionsPanel = makeOptionsPanel(spOptionsPanel.getSpOptionsPanel(), cChooserPanel.getCChooserPanel(), cChooserButtonPanel.getCChooserButtonPanel());
        TopPanel topPanel = makeTopPanel(panel1, optionsPanel.getOptionsPanel());
        BottomPanel bottomPanel = makeBottomPanel(panel2,panel3);
        MainPanel mainPanel = makeMainPanel(topPanel.getTopPanel(), bottomPanel.getBottomPanel());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setPreferredSize(new Dimension(1920, 1080));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(150,150));
        setJMenuBar(mainFrame.getjMenuBar1());
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        Container contentPane = getContentPane();
        contentPane.add(mainPanel.getMainPanel(), BorderLayout.CENTER);

        pack();
    }


    // Event Handlers;
    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean linesActivated;
        if(scatterPlotButtons.getLineButton().isSelected()) {
            linesActivated = true;
            for (int cnt = 0; cnt < allCircleObjects.size(); cnt++) {
                allCircleObjects.get(cnt).activateLines(linesActivated);
            }
        }
        else{
             linesActivated = false;
             for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
                allCircleObjects.get(cnt).activateLines(linesActivated);
             }
            }
        panel1.updatePanel();
    }
    private void sizeSliderMouseClicked(java.awt.event.MouseEvent evt) {

        width = scatterPlotButtons.getSizeSlider().getValue();
        for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
            allCircleObjects.get(cnt).changeRadius(width);
        }
        scatterPlotButtons.getSizeSlider().setValue(width);
        panel1.updatePanel();

    }
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {
        if (scatterPlotButtons.getRadioButton1().isSelected()){xIsVariable1 = true; xIsVariable2 = false;}
        else{
            xIsVariable1 = true;
            xIsVariable2 = false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {
        if (scatterPlotButtons.getRadioButton2().isSelected()){xIsVariable2 = true; xIsVariable1= false;}
        else{
            xIsVariable2 = true;
            xIsVariable1 = false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {
        if(scatterPlotButtons.getRadioButton3().isSelected()){yIsVariable1 = true; yIsVariable2 = false;}
        else{
            yIsVariable1= true;
            yIsVariable2= false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {
        if(scatterPlotButtons.getRadioButton4().isSelected()){yIsVariable2 = true;yIsVariable1 = false;}
        else
        {    yIsVariable2= true;
             yIsVariable1= false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void colorButtonMouseClicked(java.awt.event.ActionEvent evt) {
       for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
        allCircleObjects.get(cnt).changeColor(colorChooser.getColorChooser().getColor());
        color = colorChooser.getColorChooser().getColor();
        panel1.updatePanel();
       }
    }
    private void colorButton2MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject1.getCreatedHistograms().changeColor(colorChooser.getColorChooser().getColor());
        panel2.updatePanel();
    }
    private void colorButton3MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject2.getCreatedHistograms().changeColor(colorChooser.getColorChooser().getColor());
        panel3.updatePanel();
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        File1 = NewAction();
        ProcessVariables allCircles = processVariables(File1, panel1,width,color);
        allCircleObjects = allCircles.getAllCircles();
        histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), panel2);
        histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), panel3);

        drawOnPanels();

        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Histogram 1: "+File1.getVariable1().getName()));
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Histogram 1:"+ File1.getVariable2().getName()));
        scatterPlotButtons.getRadioButton1().setText(File1.getVariable1().getName());
        scatterPlotButtons.getRadioButton1().setSelected(true);
        scatterPlotButtons.getRadioButton2().setText(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton3().setText(File1.getVariable1().getName());
        scatterPlotButtons.getRadioButton4().setText(File1.getVariable2().getName());
        scatterPlotButtons.getRadioButton4().setSelected(true);

    }
    private void formComponentResized(java.awt.event.ComponentEvent evt) {


        if(File1!= null){

            ProcessVariables allCircles = processVariables(File1, panel1,width,color);
            allCircleObjects = allCircles.getAllCircles();
            histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), panel2);
            histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), panel3);

            drawOnPanels();
        }
    }
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
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
    private TopPanel makeTopPanel(DrawingOnPanel1 panel1, JPanel optionsPanel){
        TopPanel topPanel = new TopPanel(panel1, optionsPanel);
        return topPanel;
    }
    private BottomPanel makeBottomPanel(DrawingOnPanel2 panel2, DrawingOnPanel2 panel3){
        BottomPanel bottomPanel = new BottomPanel(panel2, panel3);
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
    private ActionNewFile NewAction(){
        ActionNewFile NewAction = new ActionNewFile();
        return NewAction;
    }
    private ProcessVariables processVariables(ActionNewFile File1, DrawingOnPanel1 panel1, int width, Color color){
        ProcessVariables processedVariables = new ProcessVariables(File1, panel1,width,color);
        return processedVariables;
    }
    private ProcessVariablesForHistograms processVariablesForHistograms(ArrayList<Float> values, DrawingOnPanel2 panel){
        ProcessVariablesForHistograms processedVariablesHistograms = new ProcessVariablesForHistograms(values, panel);
        return processedVariablesHistograms;
    }

    public void drawOnPanels(){
        if (xIsVariable1 && yIsVariable2){
            panel1.addCircles(allCircleObjects.get(0));
        }
        if(xIsVariable1 && yIsVariable1){
            panel1.addCircles(allCircleObjects.get(1));
        }
        if(xIsVariable2 && yIsVariable1){
            panel1.addCircles(allCircleObjects.get(2));
        }
        if(xIsVariable2 && yIsVariable2){
            panel1.addCircles(allCircleObjects.get(3));
        }
        panel2.addHistogram(histogramObject1.getCreatedHistograms());
        panel3.addHistogram(histogramObject2.getCreatedHistograms());
    }


    // Variables declaration



    boolean xIsVariable1 = true;
    boolean xIsVariable2 = false;
    boolean yIsVariable1 = false;
    boolean yIsVariable2 = true;
    private DrawingOnPanel1 panel1 = new DrawingOnPanel1();
    private DrawingOnPanel2 panel2 = new DrawingOnPanel2();
    private DrawingOnPanel2 panel3 = new DrawingOnPanel2();
    private ScatterPlotButtons scatterPlotButtons;
    private ColorChooser colorChooser;
    ArrayList<CreateCircles> allCircleObjects;
    ProcessVariablesForHistograms histogramObject1;
    ProcessVariablesForHistograms histogramObject2;
    ActionNewFile File1;
    int width = 5;
    Color color = Color.BLUE;
    // End of variables declaration


}