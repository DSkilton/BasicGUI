/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexamples;
import javax.swing.*;

/**
 *
 * @author Duncan Skilton
 */
public class GuiExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new GridBagLayoutEx().setVisible(true);
            }
        });
        
        
    }
    
}
