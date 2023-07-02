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
public class image2 extends JPanel {
    public image2(){
        this.setLayout(null);
    }
    private ImageIcon i;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        i=new ImageIcon(getClass().getResource("g0.jpg"));
        i.paintIcon(this, g, 0,0);
        
    }
    
}
