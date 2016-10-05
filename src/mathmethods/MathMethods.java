/*
 * 
 * 
 * 
 */

package mathmethods;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author masea3439
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Display
        JFrame window = new JFrame("Who's that number"); //Create a display
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make the program stop running when you close the window
        window.setVisible(true); //Make the window visible
        window.setSize(300,300); //Set the size of the window
        
        //Components
        JFrame hint1 = new JFrame("Hello?"); 
        JFrame hint2 = new JFrame("Hello?"); 
        JFrame hint3 = new JFrame("Hello?"); 
        JFrame hint4 = new JFrame("Hello?"); 
        JTextField answer = new JTextField("");
        
        //Add components to window
        window.getContentPane().add(hint1, FlowLayout());
        window.getContentPane().add(hint2, FlowLayout());
        window.getContentPane().add(hint3, FlowLayout());
        window.getContentPane().add(hint4, FlowLayout());
        window.getContentPane().add(answer, BorderLayout.SOUTH);
    }
    
}
