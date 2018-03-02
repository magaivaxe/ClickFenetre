/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 * Abstract declaration of mouse clicked from the constructor EcouterSouris()
 * becouse this constructor extends MouseAdapter (Source method) that could call just the 
 * necessaries methods 
 * @author sire_marcos
 */
public class MaFenetre extends JFrame
{
    //Constructor without public first
    public MaFenetre()
    {
        addMouseListener(new EcouterSouris()
        { 
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Clicked on " + x + ", " + y);
            }
        });
        setTitle("Gestion des Clics");
        setBounds(10, 20, 300, 200);
        setVisible(true);
    }

    
    
    
    
    
    
    
}
