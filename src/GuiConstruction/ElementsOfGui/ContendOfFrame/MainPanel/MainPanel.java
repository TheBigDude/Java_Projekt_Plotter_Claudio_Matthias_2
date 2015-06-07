package GuiConstruction.ElementsOfGui.ContendOfFrame.MainPanel;

import javax.swing.*;

/**
 * Created by Matthias on 03.06.2015.
 */
//Creates the parent panel for all other panels
public class MainPanel extends JPanel {
    JPanel mainPanel = new JPanel();

    public MainPanel(JPanel topPanel, JPanel bottomPanel){
        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setPreferredSize(new java.awt.Dimension(1920,1080));
        mainPanel.setMinimumSize(new java.awt.Dimension(150,150));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
