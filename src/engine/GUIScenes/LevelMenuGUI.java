/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine.GUIScenes;

import engine.*;
import static engine.Game.gameFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Tony
 */
public class LevelMenuGUI extends Scene
{
    // attributes
    private static Image bgTexture;
    
    public LevelMenuGUI()
    {
        super("LevelMenuGUI");
    }
    
    public void LoadContent()
    {
        // load Image here
        // using ImageLoader.getImage
        bgTexture = ImageLoader.getImage("mainmenu_bg");
    }
    
    @Override
    public void Initialize()
    {
        gameFrame.getContentPane().removeAll();
        gameFrame.getContentPane().add(this);
        this.LoadContent();
    }
    
    @Override
    public void Update()
    {
        
    }
    
    @Override
    public void Draw()
    {
        if (Game.mode == 2)
        {
            JPanel panel=new JPanel();
            JLabel nama_klmpk;
            nama_klmpk = new JLabel("Cube Mazer");
            JLabel judul=new JLabel("Level Menu");
            JLabel nama_level=new JLabel("Indonesian Maze");
            JLabel level=new JLabel("Level 1");
            panel.add(nama_klmpk);             
            panel.add(judul);
            panel.add(nama_level);
            panel.add(level);
            Game.gameFrame.add(panel);
            Game.gameFrame.revalidate();
            Game.gameFrame.repaint();
        }
    }
    
    @Override
    public void paint(Graphics g)
    {
        if (Game.mode == 2)
        {
            Graphics2D g2D = (Graphics2D) g;
            //g2D.drawImage(bgTexture, 0, 0, getWidth(), getHeight(), this);
            // paint Image here
            // using g2D.drawImage
        }
    }
}
