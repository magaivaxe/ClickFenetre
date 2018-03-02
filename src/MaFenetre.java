/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author sire_marcos
 */
public class MaFenetre extends JFrame implements ActionListener
{
    //Mouse object
    EcouterSouris souris = new EcouterSouris();
    //Button object
    private JButton monButton; 
    //Variable cont type container
    Container cont = getContentPane();
   
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
        setTitle("Gestion des Clics");
        setBounds(10, 20, 600, 600);
        //Button sets
        monButton = new JButton("Essai!");
        //Set the layout to button
        cont.setLayout(new FlowLayout());
        //Add the button to window container
        cont.add(monButton);
        //Add an action listener to button and the listener is MaFenetre itself
        monButton.addActionListener(this);
        //Show all
        setVisible(true);
    }
    /**
     * button action
     * @param e event or action performed by button
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("action sur button Essai");
    }

    
    
    
    
    
    
    
}
