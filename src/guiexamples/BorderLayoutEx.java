package guiexamples;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Duncan Skilton
 */
public class BorderLayoutEx extends JFrame{

    public static void borderLayout() {
        JFrame window = new JFrame("Frame Name");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 350);
        window.setLocation(100, 100);
        JLabel label = new JLabel("Overloaded with Text.Center");
        JButton button1 = new JButton("Button1. North");
        button1.setPreferredSize(new Dimension(150, 50));
        JButton button2 = new JButton("Button2. South");
        button2.setPreferredSize(new Dimension(100, 50));
        JButton button3 = new JButton("Button3. East");
        button3.setPreferredSize(new Dimension(150, 100));
        JButton button4 = new JButton("Button4. West");
        button4.setPreferredSize(new Dimension(150, 100));
        window.getContentPane().add(label, BorderLayout.CENTER);
        window.getContentPane().add(button1, BorderLayout.NORTH);
        window.getContentPane().add(button2, BorderLayout.SOUTH);
        window.getContentPane().add(button3, BorderLayout.EAST);
        window.getContentPane().add(button4, BorderLayout.WEST);
        window.setVisible(true);
    }
    
}
