import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Matthias on 17.05.2015.
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    public GUI() {
        initComponents();
    }

    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jColorButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSizeSlider = new javax.swing.JSlider(Min_Size,Max_Size,Size_INIT);
        jLabel1 = new javax.swing.JLabel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 378, Short.MAX_VALUE)
        );

        jCheckBox1.setText("mit Linie Verbinden");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });


        jColorButton.setText("Farbe Anwenden");
        jColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jColorButtonMouseClicked(evt);
            }
        });

        jSizeSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSizeSliderMouseClicked(evt);
            }
        });
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        jLabel1.setText("Grösse der Punkte");
        jLabel2.setText("X - Achse");
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Variable 1");
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Variable 2");
        jLabel3.setText("Y - Achse");
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Variable 1");
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Variable 2");
        jMenu1.setText("Datei");
        jMenuItem1.setText("Neue Datei");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenuItem3.setText("Beenden");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenuBar1.add(jMenu1);
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);

        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jCheckBox1)
                                                                        .addGap(29, 29, 29))
                                                                .addComponent(jSizeSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1))
                                                        .addComponent(jLabel2)
                                                        .addComponent(jRadioButton1)
                                                        .addComponent(jRadioButton2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jRadioButton3)
                                                        .addComponent(jRadioButton4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jColorButton)
                                                .addGap(233, 233, 233))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)
                                                .addGap(4, 4, 4)
                                                .addComponent(jRadioButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)
                                                .addGap(2, 2, 2)
                                                .addComponent(jSizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jColorButton))
                                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        drawOnPanel();
    }
    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {
        if (jRadioButton2.isSelected()){xIsVariable2 = true; xIsVariable1= false;}
        else{
            xIsVariable2 = true;
            xIsVariable1 = false;
        }
        panel1.clearPanel();
        drawOnPanel();
    }
    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {
        if(jRadioButton3.isSelected()){yIsVariable1 = true; yIsVariable2 = false;}
        else{
            yIsVariable1= true;
            yIsVariable2= false;
        }
        panel1.clearPanel();
        drawOnPanel();
    }
    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {
        if(jRadioButton4.isSelected()){yIsVariable2 = true;yIsVariable1 = false;}
        else
        {    yIsVariable2= true;
             yIsVariable1= false;
        }
        panel1.clearPanel();
        drawOnPanel();
    }
    private void jColorButtonMouseClicked(java.awt.event.ActionEvent evt) {
       for(int cnt=0;cnt < allCircleObjects.size();cnt++) {
        allCircleObjects.get(cnt).changeColor(jColorChooser1.getColor());
        panel1.updatePanel();
       }




    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        ActionNewFile File1 = NewAction();
        ProcessVariables allCircles = processVariables(File1, panel1,width,color);
        allCircleObjects = allCircles.getAllCircles();
        drawOnPanel();

        //hier noch Histogram
        jRadioButton1.setText(File1.getVariable1().getName());
        jRadioButton2.setText(File1.getVariable2().getName());
        jRadioButton3.setText(File1.getVariable1().getName());
        jRadioButton4.setText(File1.getVariable2().getName());

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

    public void drawOnPanel(){
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
    private DrawingOnPanel2 jPanel2 = new DrawingOnPanel2();
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSizeSlider;
    private javax.swing.JButton jColorButton;
    static final int Min_Size = 1;
    static final int Max_Size = 40;
    static final int Size_INIT = 10;
    boolean xIsVariable1 = true;
    boolean xIsVariable2 = false;
    boolean yIsVariable1 = false;
    boolean yIsVariable2 = true;
    ArrayList<CreateCircles> allCircleObjects;
    int width = 5;


    private Boolean linesActivated = false;
    Color color = Color.BLUE;
    // End of variables declaration


}