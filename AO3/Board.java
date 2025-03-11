package AO3;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private BufferedImage img;
    private int x = 0;
    private int y = 0;
    private double angle = 0;
    private final int IMAGE_SIZE = 100; // Assumed size for scaling
    private final int SPEED = 1;
    private SoundClip sitarMusic;
    private SoundClip owSound;
    private int ySpeed;
   /*
    * Constructor
    */

   public Board() {
       setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        
        try {
            File imageFile = new File("AO3/Media/Media/Andy.png");
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.err.println("Unable to load image: " + e.getMessage());
        }
        
        sitarMusic = new SoundClip("AO3/Media/Media/sitar.wav");
        sitarMusic.open();
        sitarMusic.setLoop(true);
        sitarMusic.play();
        
        owSound = new SoundClip("AO3/Media/Media/ow.wav");
        owSound.open();
        
        Random rand = new Random();
        x = B_WIDTH / 2 - IMAGE_SIZE / 2;
        y = B_HEIGHT / 2 - IMAGE_SIZE / 2;
        xSpeed = rand.nextInt(5) + 1;
        ySpeed = rand.nextInt(5) + 1;
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(), 0, PERIOD_INTERVAL);
    }
    

   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (img != null) {
            // Create a copy of the image to ensure we don't overwrite the original
            AffineTransform affineTransform = new AffineTransform();

            affineTransform.translate(x + IMAGE_SIZE / 2, y + IMAGE_SIZE / 2);  // Move the origin to the center of the image
            affineTransform.rotate(Math.toRadians(angle));  // Apply rotation
            affineTransform.translate(-IMAGE_SIZE / 2, -IMAGE_SIZE / 2);  // Move the origin back

            g2d.drawImage(img, affineTransform, this);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
   }
    private Timer timer;
   private final int INITIAL_DELAY = 100;
   private final int PERIOD_INTERVAL = 25;
   private int xSpeed = 2;

   private class ScheduledUpdate extends TimerTask {
        @Override
        public void run() {
            x += xSpeed;
            y += ySpeed;
            
            if (x <= 0 || x + IMAGE_SIZE >= B_WIDTH) {
                xSpeed = -xSpeed;
                owSound.play();
            }
            
            if (y <= 0 || y + IMAGE_SIZE >= B_HEIGHT) {
                ySpeed = -ySpeed;
                owSound.play();
            }
            
            angle += 1;
            if (angle >= 360) {
                angle = 0;
            }
            repaint();
        }
    }
}



