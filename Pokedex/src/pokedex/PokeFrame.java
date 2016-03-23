/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author aot5238
 */
public class PokeFrame extends JFrame
{
    
    public PokeFrame()
    {
        super("Pokedex");
        PokePanel thePokePanel = new PokePanel();
        
        getContentPane().add(thePokePanel);
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(550,850);
        setVisible(true);
    }
    
}
