/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author sire_marcos
 */
public class MaFenetre extends JFrame
{
    //Constructor without public first
    MaFenetre()
    {
        setTitle("Gestion des Clics");
        setBounds(10, 20, 300, 200);
        addMouseListener(new MouseAdapter()
        {public void mouseClicked(MouseEvent e)
            {                  
                //This method get the x and y values and print on terminal
                int x = e.getX();
                int y = e.getY();
                System.out.println("Ils sont " + x + ", " + y);
            }
        });
        setVisible(true);
    }

    
    
    
    
    
    
    
}
