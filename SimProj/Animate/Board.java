package Animate;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

public class Board extends JPanel implements KeyListener {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    final int LEVEL = HEIGHT - 25;

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
    }
    Cannon cannon = new Cannon();
    
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawLine(0, LEVEL, 1600, LEVEL);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, LEVEL, WIDTH, HEIGHT);
        cannon.spawnCannon(graphics);
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
            cannon.rotateDown(5);;
            repaint();
        } else if (x.getKeyCode() == 40) {
            System.out.println("D-ARROW");
        } else if (x.getKeyCode() == 38) {
            System.out.println("U-ARROW");
        }
    }

    

    @Override
    public void keyReleased(KeyEvent f) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

