/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author aot5238
 */
public class PokeImage extends JPanel
{
    
    public PokeImage()
    {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(250,250));
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon Icon = new ImageIcon("images/pika.png");
        g.drawImage(Icon.getImage(), 0, 0, this);
        
    }
}
