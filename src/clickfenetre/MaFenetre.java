/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clickfenetre;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author sire_marcos
 */
public class MaFenetre extends JFrame implements MouseListener
{
    //Constructor without public first
    MaFenetre()
    {
        setTitle("Gestion des Clics");
        setBounds(10, 20, 300, 200);
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Ils sont " + x + ", " + y);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
       
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
       
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
       
    }
    
    
    
    
    
    
    
}
