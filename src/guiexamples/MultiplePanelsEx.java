package guiexamples;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author MC03353
 */
public class MultiplePanelsEx extends JFrame {
    
    public static void multiplePanelsEx(){
    JFrame frame = new JFrame("Border Layout");
    
    // -------------------------------------------------------
    // Make Panel with 5 button 
    // -------------------------------------------------------
    frame.setLayout(new BorderLayout());
    
    JPanel northPanel = new JPanel();    
    JPanel eastPanel = new JPanel();    
    JPanel southPanel = new JPanel();    
    JPanel westPanel = new JPanel();    
    JPanel centerPanel = new JPanel();    
    
    northPanel.setLayout(new FlowLayout());
    eastPanel.setLayout(new GridLayout());
    southPanel.setLayout(new SpringLayout());
    westPanel.setLayout(new FlowLayout());
    centerPanel.setLayout(new FlowLayout());

    JButton x1 = new JButton("I am x1");
    JButton x2 = new JButton("I am x2");
    JButton x3 = new JButton("I am x3");
    JButton x4 = new JButton("I am x4");
    JButton x5 = new JButton("I am x5");

    northPanel.add(x1, "North");
    northPanel.add(x2, "South");
    northPanel.add(x3, "East");
    northPanel.add(x4, "West");
    northPanel.add(x5, "Center");

    frame.getContentPane().add(northPanel, "North");   // Add MyPanel1 to North

    // -----------------------------------------------------------
    // Make another Panel with 5 button 
    // -----------------------------------------------------------
    JPanel MyPanel2 = new JPanel();

    MyPanel2.setLayout( new BorderLayout() );

    JButton x6 = new JButton("I am x6");
    JButton x7 = new JButton("I am x7");
    JButton x8 = new JButton("I am x8");
    JButton x9 = new JButton("I am x9");
    JButton x10 = new JButton("I am x10");

    MyPanel2.add(x6, "North");
    MyPanel2.add(x7, "South");
    MyPanel2.add(x8, "East");
    MyPanel2.add(x9, "West");
    MyPanel2.add(x10, "Center");

    frame.getContentPane().add(MyPanel2, "South");   // Paste MyPanel2 to South
//    frame.getContentPane().add(MyPanel2, "Center");  // Paste MyPanel2 to Center

      frame.setSize(400, 300);
      frame.setVisible(true);
    }
}