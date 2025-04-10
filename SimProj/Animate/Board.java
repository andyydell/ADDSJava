package Animate;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements KeyListener {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    final int LEVEL = HEIGHT - 25;
    private Ball Ball;
    private Timer timer;    
    Cannon cannon = new Cannon();
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        Ball = new Ball(LEVEL);
        Ball = new Ball(LEVEL);  
        cannon.setBall(Ball);  
                
        timer = new Timer(20, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Ball.updateBall();
            repaint();
            }});
        timer.start();
    }
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawLine(0, LEVEL, 1600, LEVEL);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, LEVEL, WIDTH, HEIGHT);
        cannon.spawnCannon(graphics);
        details(graphics);
        Ball.draw(graphics);
    }

    private void details(Graphics2D graphics) {
        graphics.setColor(Color.BLACK);
        graphics.drawString("Use ← or → to angle cannon     -     press SPACE to fire", 20, 20);
        graphics.drawString("Angle: " + (int)cannon.getAngle()*(-1) + "°", 20, 40);
    }
    public void keyPressed(KeyEvent x) {
        if (x.getKeyCode() == 32) {
            System.out.println("SPACEBAR");
            cannon.fire();
            repaint();
        } else if (x.getKeyCode() == 37) {
            System.out.println("L-ARROW");
            cannon.rotateUp(5);
            repaint();
        } else if (x.getKeyCode() == 39) {
            System.out.println("R-ARROW");
            cannon.rotateDown(5);
            repaint();
        } else if (x.getKeyCode() == 40) {
            System.out.println("D-ARROW");
        } else if (x.getKeyCode() == 38) {
            System.out.println("U-ARROW");
        }
    }

    


    public void keyReleased(KeyEvent f) {
    }


    public void keyTyped(KeyEvent e) {
    }

}
    