
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sire_marcos
 */
public class EcouterSouris extends MouseAdapter
{
    //The constructor could be write without public: Question professor
    public EcouterSouris()
    {
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        //This method get the x and y values and print on terminal
        int x = e.getX();
        int y = e.getY();
        System.out.println("Ils sont " + x + ", " + y);
    }

}
