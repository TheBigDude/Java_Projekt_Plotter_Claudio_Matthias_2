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

        mainPanel = new JPanel();
        optionsPanel = new JPanel();
        spOptionsPanel = new JPanel();
        cChooserPanel = new JPanel();
        cChooserButtonPanel = new JPanel();
        leftPanel = new JPanel();
        rightPanel = new JPanel();


        colorButton = new JButton();
        colorButton2 = new JButton();
        colorButton3 = new JButton();

        sizeLabel = new JLabel();
        yAxisLabel = new JLabel();
        xAxisLabel = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();

        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();

        lineButton = new JCheckBox();
        sizeSlider = new JSlider();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jColorChooser1 = new JColorChooser();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setPreferredSize(new Dimension(1920, 1080));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(150,150));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setPreferredSize(new java.awt.Dimension(1920,1080));
        mainPanel.setMinimumSize(new java.awt.Dimension(150,150));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setPreferredSize(new java.awt.Dimension(960, 1080));


        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setPreferredSize(new java.awt.Dimension(960,1080));


        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setPreferredSize(new java.awt.Dimension(960, 600));

        
        optionsPanel.setBackground(new java.awt.Color(255, 255, 255));
        optionsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        optionsPanel.setPreferredSize(new java.awt.Dimension(960,600));


        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel2.setPreferredSize(new java.awt.Dimension(960, 480));


        jLabel4.setText("Histogram 1:");


        
        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panel3.setPreferredSize(new java.awt.Dimension(960, 480));



        spOptionsPanel.setBackground(new java.awt.Color(255, 255, 255));

        spOptionsPanel.setPreferredSize(new java.awt.Dimension(240,600));


        cChooserPanel.setBackground(new java.awt.Color(255, 255, 255));

        cChooserPanel.setPreferredSize(new java.awt.Dimension(480,600));


        cChooserButtonPanel.setBackground(new java.awt.Color(255, 255, 255));

        cChooserButtonPanel.setPreferredSize(new java.awt.Dimension(240,600));




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

        GridLayout optionsPanelLayout = new GridLayout(0,1);
        spOptionsPanel.setLayout(optionsPanelLayout);
        spOptionsPanel.add(xAxisLabel);
        spOptionsPanel.add(jRadioButton1);
        spOptionsPanel.add(jRadioButton2);
        spOptionsPanel.add(yAxisLabel);
        spOptionsPanel.add(jRadioButton3);
        spOptionsPanel.add(jRadioButton4);
        spOptionsPanel.add(lineButton);
        spOptionsPanel.add(sizeLabel);
        spOptionsPanel.add(sizeSlider);


        //Color Chooser setup
        jColorChooser1.setPreferredSize(new java.awt.Dimension(480, 600));
        cChooserPanel.add(jColorChooser1, BorderLayout.CENTER);

        //cChooserButtons setup
        colorButton.setText("Scatterplot Faerben");
        colorButton.setMaximumSize(new java.awt.Dimension(240, 66));
        colorButton.setPreferredSize(new java.awt.Dimension(240, 66));

        colorButton2.setText("Histogram 1 Faerben");
        colorButton2.setMaximumSize(new java.awt.Dimension(240, 66));
        colorButton2.setPreferredSize(new java.awt.Dimension(240, 66));
 
        colorButton3.setText("Histogram 2 Faerben");
        colorButton3.setMaximumSize(new java.awt.Dimension(240, 66));
        colorButton3.setPreferredSize(new java.awt.Dimension(240, 66));

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


        optionsPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        optionsPanel.add(spOptionsPanel);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 1;
        c.gridy = 0;
        optionsPanel.add(cChooserPanel);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 3;
        c.gridy = 0;
        optionsPanel.add(cChooserButtonPanel);

        //eventHandlers setzen
        jRadioButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        lineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });
        sizeSlider.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                sizeSliderMouseClicked(evt);
            }
        });
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                colorButtonMouseClicked(evt);
            }
        });
        colorButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                colorButton2MouseClicked(evt);
            }
        });
        colorButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                colorButton3MouseClicked(evt);
            }
        });

        //MenueBar zum Frame hinzu
        jMenu1.setText("Datei");
        jMenuItem1.setText("Neue Datei");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenuItem3.setText("Beenden");
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);

        GridLayout leftLayout = new GridLayout(1,2);
        leftPanel.setLayout(leftLayout);
        leftPanel.add(panel1);
        leftPanel.add(optionsPanel);

        GridLayout rightLayout = new GridLayout(1,2);
        rightPanel.setLayout(rightLayout);
        rightPanel.add(panel2);
        rightPanel.add(panel3);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        Container contentPane = getContentPane();
        contentPane.add(mainPanel, BorderLayout.CENTER);

        pack();
    }


    // Event Handlers;
    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean linesActivated;
        if(lineButton.isSelected()) {
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

        width = sizeSlider.getValue();
        for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
            allCircleObjects.get(cnt).changeRadius(width);
        }
        sizeSlider.setValue(width);
        panel1.updatePanel();

    }
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {
        if (jRadioButton1.isSelected()){xIsVariable1 = true; xIsVariable2 = false;}
        else{
            xIsVariable1 = true;
            xIsVariable2 = false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {
        if (jRadioButton2.isSelected()){xIsVariable2 = true; xIsVariable1= false;}
        else{
            xIsVariable2 = true;
            xIsVariable1 = false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {
        if(jRadioButton3.isSelected()){yIsVariable1 = true; yIsVariable2 = false;}
        else{
            yIsVariable1= true;
            yIsVariable2= false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {
        if(jRadioButton4.isSelected()){yIsVariable2 = true;yIsVariable1 = false;}
        else
        {    yIsVariable2= true;
             yIsVariable1= false;
        }
        panel1.clearPanel();
        drawOnPanels();
    }
    private void colorButtonMouseClicked(java.awt.event.ActionEvent evt) {
       for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
        allCircleObjects.get(cnt).changeColor(jColorChooser1.getColor());
        panel1.updatePanel();
       }
    }
    private void colorButton2MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject1.getCreatedHistograms().changeColor(jColorChooser1.getColor());
        panel2.updatePanel();
    }
    private void colorButton3MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject2.getCreatedHistograms().changeColor(jColorChooser1.getColor());
        panel3.updatePanel();
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        File1 = NewAction();
        ProcessVariables allCircles = processVariables(File1, panel1,width,color);
        allCircleObjects = allCircles.getAllCircles();
        histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), panel2);
        histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), panel3);

        jLabel5.setText("histogram 2: "+File1.getVariable2().getName());
        this.setTitle(File1.getFilename());

        drawOnPanels();

        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Histogram 1: "+File1.getVariable1().getName()));
        panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Histogram 1:"+ File1.getVariable2().getName()));
        jRadioButton1.setText(File1.getVariable1().getName());
        jRadioButton1.setSelected(true);
        jRadioButton2.setText(File1.getVariable2().getName());
        jRadioButton3.setText(File1.getVariable1().getName());
        jRadioButton4.setText(File1.getVariable2().getName());
        jRadioButton4.setSelected(true);

    }
    private void formComponentResized(java.awt.event.ComponentEvent evt) {
        System.out.println(mainPanel.getSize());

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

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox lineButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel yAxisLabel;
    private javax.swing.JLabel xAxisLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private DrawingOnPanel1 panel1 = new DrawingOnPanel1();
    private DrawingOnPanel2 panel2 = new DrawingOnPanel2();
    private DrawingOnPanel2 panel3 = new DrawingOnPanel2();
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel spOptionsPanel;
    private javax.swing.JPanel cChooserPanel;
    private javax.swing.JPanel cChooserButtonPanel;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSlider sizeSlider;
    private javax.swing.JButton colorButton;
    private javax.swing.JButton colorButton2;
    private javax.swing.JButton colorButton3;
    boolean xIsVariable1 = true;
    boolean xIsVariable2 = false;
    boolean yIsVariable1 = false;
    boolean yIsVariable2 = true;
    ArrayList<CreateCircles> allCircleObjects;
    ProcessVariablesForHistograms histogramObject1;
    ProcessVariablesForHistograms histogramObject2;
    ActionNewFile File1;
    int width = 5;



    Color color = Color.BLUE;
    // End of variables declaration


}