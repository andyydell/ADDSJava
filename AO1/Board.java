package AO1;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;


public class Board extends JPanel {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;

   /*
    * Constructor
    */
   public Board() {
       setBackground(Color.CYAN);
       setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
   }
   private final int SIDE_LEN = 150;
   
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Calculate translation to center the shape
        int x_t = B_WIDTH / 2 - SIDE_LEN / 2;
        int y_t = B_HEIGHT / 2 - SIDE_LEN / 2;

        // Create the transformation
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t, y_t);
        affineTransform.rotate(Math.toRadians(22.5), SIDE_LEN / 2.0, SIDE_LEN / 2.0);
        g2d.setColor(Color.BLUE);
        g2d.drawString("Hello World!", 50,50);
        

        // Create and transform the rectangle
        Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
        Shape transformedShape = affineTransform.createTransformedShape(rect);
        // Draw the transformed shape
        g2d.setColor(Color.MAGENTA);
        g2d.fill(transformedShape);
   }   
   

}

