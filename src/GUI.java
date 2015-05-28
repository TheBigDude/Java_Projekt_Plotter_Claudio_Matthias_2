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

        jColorButton = new JButton();
        jColorButton2 = new JButton();
        jColorButton3 = new JButton();

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();

        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();

        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jSeparator1 = new JSeparator();

        jColorChooser1 = new JColorChooser();
        jColorChooser1.setMinimumSize(new java.awt.Dimension(0, 0));
        jCheckBox1 = new JCheckBox();
        jSizeSlider = new JSlider(Min_Size,Max_Size,Size_INIT);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setPreferredSize(new Dimension(1920, 1080));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setMaximumSize(new java.awt.Dimension(950, 600));
        panel1.setPreferredSize(new java.awt.Dimension(950, 600));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 958, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 613, Short.MAX_VALUE)
        );

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setMaximumSize(new java.awt.Dimension(950, 400));
        panel2.setPreferredSize(new java.awt.Dimension(950, 400));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 422, Short.MAX_VALUE)
        );
        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.setMaximumSize(new java.awt.Dimension(950, 400));
        panel3.setMinimumSize(new java.awt.Dimension(0, 0));
        panel3.setPreferredSize(new java.awt.Dimension(950, 400));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 422, Short.MAX_VALUE)
        );

        jCheckBox1.setText("mit Linie Verbinden");
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });


        jColorButton.setText("Scatterplot Faerben");
        jColorButton.setMaximumSize(new java.awt.Dimension(175, 53));
        jColorButton.setMinimumSize(new java.awt.Dimension(0, 0));
        jColorButton.setPreferredSize(new java.awt.Dimension(175, 53));
        jColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jColorButtonMouseClicked(evt);
            }
        });

        jColorButton2.setText("Histogram 1 Faerben");
        jColorButton2.setMaximumSize(new java.awt.Dimension(175, 53));
        jColorButton2.setMinimumSize(new java.awt.Dimension(0, 0));
        jColorButton2.setPreferredSize(new java.awt.Dimension(175, 53));
        jColorButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jColorButton2MouseClicked(evt);
            }
        });
        jColorButton3.setText("Histogram 2 Faerben");
        jColorButton3.setMaximumSize(new java.awt.Dimension(175, 53));
        jColorButton3.setMinimumSize(new java.awt.Dimension(0, 0));
        jColorButton3.setPreferredSize(new java.awt.Dimension(175, 53));
        jColorButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jColorButton3MouseClicked(evt);
            }
        });
        jSizeSlider.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jSizeSliderMouseClicked(evt);
            }
        });
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

        jLabel1.setText("Grösse der Punkte");
        jLabel2.setText("X - Achse");
        jLabel3.setText("Y - Achse");

        jRadioButton1.setText("Variable 1");
        jRadioButton2.setText("Variable 2");
        jRadioButton3.setText("Variable 1");
        jRadioButton4.setText("Variable 2");

        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);

        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton1);
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);

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




        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jSizeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jColorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jColorButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jColorButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(30, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jColorChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jColorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jColorButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jColorButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
        );

        pack();
    }


    // Event Handlers;
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean linesActivated;
        if(jCheckBox1.isSelected()) {
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
    private void jSizeSliderMouseClicked(java.awt.event.MouseEvent evt) {

        width = jSizeSlider.getValue();
        for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
            allCircleObjects.get(cnt).changeRadius(width);
        }
        jSizeSlider.setValue(width);
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
    private void jColorButtonMouseClicked(java.awt.event.ActionEvent evt) {
       for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
        allCircleObjects.get(cnt).changeColor(jColorChooser1.getColor());
        panel1.updatePanel();
       }
    }
    private void jColorButton2MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject1.getCreatedHistograms().changeColor(jColorChooser1.getColor());
        panel2.updatePanel();
    }
    private void jColorButton3MouseClicked(java.awt.event.ActionEvent evt) {
        histogramObject2.getCreatedHistograms().changeColor(jColorChooser1.getColor());
        panel3.updatePanel();
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        File1 = NewAction();
        ProcessVariables allCircles = processVariables(File1, panel1,width,color);
        allCircleObjects = allCircles.getAllCircles();
        histogramObject1 = processVariablesForHistograms(File1.getVariable1().getValues(), panel2);
        histogramObject2 = processVariablesForHistograms(File1.getVariable2().getValues(), panel3);

        drawOnPanels();


        //hier noch Histogram
        jRadioButton1.setText(File1.getVariable1().getName());
        jRadioButton2.setText(File1.getVariable2().getName());
        jRadioButton3.setText(File1.getVariable1().getName());
        jRadioButton4.setText(File1.getVariable2().getName());

    }
    private void formComponentResized(java.awt.event.ComponentEvent evt) {

        if(File1!= null){
            System.out.println("true");
            panel1.clearPanel();
            panel2.clearPanel2();
            panel3.clearPanel2();
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


    // Variables declaration - do not modify

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private DrawingOnPanel1 panel1 = new DrawingOnPanel1();
    private DrawingOnPanel2 panel2 = new DrawingOnPanel2();
    private DrawingOnPanel2 panel3 = new DrawingOnPanel2();
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSizeSlider;
    private javax.swing.JButton jColorButton;
    private javax.swing.JButton jColorButton2;
    private javax.swing.JButton jColorButton3;
    static final int Min_Size = 1;
    static final int Max_Size = 40;
    static final int Size_INIT = 10;
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