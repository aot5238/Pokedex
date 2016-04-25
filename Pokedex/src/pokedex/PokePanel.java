/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aot5238
 */
public class PokePanel extends JPanel
{
    JButton next, previous, blank, another,one, damn;
    PokeImage pi;
    PokeDetail pd;
    
    public PokePanel()
    {
        //setBackground(Color.RED);
                      
        next = new JButton("Next");
        previous = new JButton("Previous");
        blank = new JButton("                                              ");
        another = new JButton("                                              ");
        one = new JButton("                                              ");
        damn = new JButton("                                              ");
        
        add(blank);
        add(another);
        add(one);
        add(damn);
        
                
        pi = new PokeImage();
        pd = new PokeDetail();
        
        add(pi);
        add(pd);        
        
        add(previous = new JButton(new ImageIcon("arrowleft.png")));
        add(next = new JButton(new ImageIcon("arrowright.png")));
        
        nextListen nextButton = new nextListen();
        previousListen previousButton = new previousListen();
        
        next.addActionListener(nextButton);
        previous.addActionListener(previousButton);
        
        previous.setBounds(new Rectangle(50,50,150,150));
        next.setBounds(new Rectangle(50,50,350,150));
        
        previous.setOpaque(false);
        previous.setContentAreaFilled(false);
        previous.setBorderPainted(false);
        next.setOpaque(false);
        next.setContentAreaFilled(false);
        next.setBorderPainted(false);
        blank.setOpaque(false);
        blank.setContentAreaFilled(false);
        blank.setBorderPainted(false);
        another.setOpaque(false);
        another.setContentAreaFilled(false);
        another.setBorderPainted(false);
        one.setOpaque(false);
        one.setContentAreaFilled(false);
        one.setBorderPainted(false);
        damn.setOpaque(false);
        damn.setContentAreaFilled(false);
        damn.setBorderPainted(false);
        
        System.out.println("Hello");
        
    }

    class nextListen implements ActionListener
    {
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(pi.currentImage >= 0 && pi.currentImage < 150)
        {
            pi.PokeImage.remove(0);
            pi.currentImage = pi.currentImage + 1;
            ImageIcon NextPoke = pi.pokemon[pi.currentImage];
            pi.PokeImage.add(new JLabel(NextPoke));
            pi.PokeImage.validate();
            pi.PokeImage.repaint();
        }
        else
        {
            pi.PokeImage.remove(0);
            pi.PokeImage.add(new JLabel(pi.mew));
            pi.currentImage = 150;
            pi.PokeImage.validate();
            pi.PokeImage.repaint();
        }
    
        if(pd.currentDetail >= 0 && pd.currentDetail < 150)
        {
            pd.PokeDetail.remove(0);
            pd.currentDetail = pd.currentDetail + 1;
            JLabel NextDet = pd.pokemon[pd.currentDetail];
            pd.PokeDetail.add(NextDet);
            pd.PokeDetail.validate();
            pd.PokeDetail.repaint();
        }
        else
        {
            pd.PokeDetail.remove(0);
            pd.PokeDetail.add(pd.charmander);
            pd.currentDetail = 150;
            pd.PokeDetail.validate();
            pd.PokeDetail.repaint();
        }
    }
    }
    
    class previousListen implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
    {
        if(pi.currentImage > 0 && pi.currentImage <= 150)
        {
            pi.PokeImage.remove(0);
            pi.currentImage = pi.currentImage - 1;
            ImageIcon NextPoke = pi.pokemon[pi.currentImage];
            pi.PokeImage.add(new JLabel(NextPoke));
            pi.PokeImage.validate();
            pi.PokeImage.repaint();
        }
        else
        {
            pi.PokeImage.remove(0);
            pi.PokeImage.add(new JLabel(pi.charmander));
            pi.currentImage = 0;
            pi.PokeImage.validate();
            pi.PokeImage.repaint();
        }
        if(pd.currentDetail > 0 && pd.currentDetail <= 150)
        {
            pd.PokeDetail.remove(0);
            pd.currentDetail = pd.currentDetail - 1;
            JLabel NextDet = pd.pokemon[pd.currentDetail];
            pd.PokeDetail.add(NextDet);
            pd.PokeDetail.validate();
            pd.PokeDetail.repaint();
        }
        else
        {
            pd.PokeDetail.remove(0);
            pd.PokeDetail.add(pd.charmander);
            pd.currentDetail = 0;
            pd.PokeDetail.validate();
            pd.PokeDetail.repaint();
        }
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon Icon = new ImageIcon("dex.png");
        g.drawImage(Icon.getImage(), 0, 0, this);
        
    }

}