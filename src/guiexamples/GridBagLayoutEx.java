/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexamples;
import java.awt.*;
import javax.swing.*;
  
/**
 *
 * @author Duncan Skilton
 */
public class GridBagLayoutEx extends JFrame{
    private JFrame frame;
    private JPanel eastPnl, southPnl, westPnl, centerPnl;
    private JButton btn1, btn2, btn3, btn4;
    private JLabel lbl1, lbl2, lbl3;
    
    GridBagLayoutEx(){
        //create a frame
        frame = new JFrame("Border Layout");
//        frame.setTitle("GridBagLayout");
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create a new panel with gridbaglayout
        JPanel northPnl = new JPanel (new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets = new Insets(10,10,10,10);
        
        //add components to the panel
        lbl1 = new JLabel("lable 1");
        lbl2 = new JLabel("lable 2");
        lbl3 = new JLabel("lable 3");
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        northPnl.add(lbl1, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        northPnl.add(lbl2, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        northPnl.add(lbl3, constraints);
        
        //set panel border
        northPnl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "North Panel"));
        
        frame.add(northPnl);
    }
}
