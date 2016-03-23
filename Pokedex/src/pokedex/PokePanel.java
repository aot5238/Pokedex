/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author aot5238
 */
public class PokePanel extends JPanel implements ActionListener
{
    JButton next, previous;
    PokeImage pi;
    
    public PokePanel()
    {
        setBackground(Color.RED);
                
        next = new JButton("Next");
        previous = new JButton("Previous");
                
        pi = new PokeImage();
        add(pi);
        
        add(previous);
        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
    
    
}
