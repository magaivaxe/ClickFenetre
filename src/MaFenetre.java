/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author sire_marcos
 */
public class MaFenetre extends JFrame
{
    //------------------ Objects ------------------
    //Mouse object/instance
    EcouterSouris souris = new EcouterSouris();
    ButtonListener1 bListener1 = new ButtonListener1();
    ButtonListener2 bListener2 = new ButtonListener2();
    //Button object/instances
    private JButton monButton1, monButton2; 
    //Variable cont type container
    Container content = getContentPane();
    //---------------------------------------------
    /**
     * Constructor without public at first. It is possible. MaFenetre building
     * and calling the JFrame methods directly. Because MaFenetre is a extends
     * of JFrame.
     * setVisible must be the last to show all.
     */
    public MaFenetre()
    {
        //Call the mouse listener 
        addMouseListener(souris);
        //Window sets
        setTitle("With two buttons");
        setBounds(10, 20, 600, 600);
        //Button sets, by default this String is the ActionCommand
        monButton1 = new JButton("Button A");
        monButton2 = new JButton("Button B");
        //We can set an other action command by...
        monButton1.setActionCommand("My button A");
        monButton2.setActionCommand("My button B");
        //Set the layout to button
        content.setLayout(new FlowLayout());
        //Add the buttons to window container
        content.add(monButton1);
        content.add(monButton2);
        //Add an action listener (Interface) to button and the listener is 
        //an object to each class and button
        monButton1.addActionListener(bListener1);
        monButton2.addActionListener(bListener2);
        //Show all and visible. This method must be the last allways, else 
        //anything will be invisible
        setVisible(true);
    }
        

    
    
    
    
    
    
    
}
