/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdb;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author gomaa
 */
public class image extends JPanel {
    public image(){
        this.setLayout(null);
    }
    private ImageIcon i;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        i=new ImageIcon(getClass().getResource("v3.jpg"));
        i.paintIcon(this, g,0,0);
        
    }
    
}
