/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;

/**
 *
 * @author sire_marcos
 */
public class MaFenetre extends JFrame
{
    EcouterSouris souris= new EcouterSouris();
    //Constructor without public first
    public MaFenetre()
    {
        addMouseListener(souris);
        setTitle("Gestion des Clics");
        setBounds(10, 20, 300, 200);
        setVisible(true);
    }

    
    
    
    
    
    
    
}
