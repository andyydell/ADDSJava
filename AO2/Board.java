package AO2;


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
import java.awt.image.BufferedImage;
import java.io.File;


public class Board extends JPanel {
    private final int B_WIDTH = 1000;
    private final int B_HEIGHT = 500;
    private BufferedImage img;

   /*
    * Constructor
    */
   public Board() {
       // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // attempt to load the image.
        try {
            File imageFile = new File("AO2/Media/Snowman.jpg");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void paintComponent(Graphics g) {
       super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (img != null) {
            int imgWidth = B_WIDTH / 2;
            int imgHeight = B_HEIGHT / 2;
            int x = B_WIDTH - imgWidth;
            int y = B_HEIGHT - imgHeight;
            g2d.drawImage(img, 1000, 500, imgWidth, imgHeight, this);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }

   }   
   

}


