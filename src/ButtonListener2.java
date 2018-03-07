
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eleves
 */
public class ButtonListener2 implements ActionListener
{

    /**
     * button action add by actionListener that it is a interface ou abstract
     * method. This method is used by the two buttons
     * @param event action performed by button
     */
    @Override
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("Action on Button B");
    } 
    
}
