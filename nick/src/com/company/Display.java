package com.company;
import javax.swing.*;
import java.awt.Image;
import java.awt.Graphics;

public class Display extends JPanel{

    JFrame frame;
    public Display(JFrame jFrame){
        this.frame=jFrame;

    }
    Image fone= new ImageIcon("pole.png").getImage();
    public void paint(Graphics gp){
        gp.drawImage(fone, 0, 0,frame.getWidth(),frame.getHeight(),null);
    }

}
