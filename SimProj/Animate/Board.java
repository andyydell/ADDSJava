package Animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Board extends JPanel implements KeyListener {
    
    public Board(){
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    final int LEVEL = HEIGHT - 25;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawLine(0, LEVEL, 1600, LEVEL);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, LEVEL, WIDTH, HEIGHT);
    }
    public void keyPressed(KeyEvent x) {
        if  (x.getKeyCode() == KeyEvent.VK_SPACE){
            System.out.println("SPACEBAR");
        }else if (x.getKeyCode() == 37) {
            System.out.println("LEFT RROW");
        } else if (x.getKeyCode() == 39) {
            System.out.println("RIGHT ARROW");
        } else if (x.getKeyCode() == 40) {
            System.out.println("DOWN ARROW");
        } else if (x.getKeyCode() == 38) {
            System.out.println("UP ARROW");
        }
    }

    public void keyReleased(KeyEvent f) {
    }

    public void mouseClicked(MouseEvent f) {
    }

    public void mouseEntered(MouseEvent f) {
    }

    public void mouseExited(MouseEvent f) {
    }

    public void mouseReleased(MouseEvent f) {
    }

    public void keyTyped(KeyEvent e) {
   
    }
   
  

}