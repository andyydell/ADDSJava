package Animate;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import Lesson32.SoundEffects;

public class Cannon {
    BufferedImage cannonImage;
    private final int DIMENSIONX = 1280;
    private final int DIMENSIONY = 720;
    final static int CannonV = 100;

    final int CANNONHEIGHT = 51;
    final int CANNONWIDTH = 124;
    final int XANGLE = 15;
    final int YANGLE = (CANNONHEIGHT/2);

    private int x;
    private int y;
    private int angle; 
    private int velo;
    private SoundEffects cannonSound;
    private SoundEffects wheelSound;

    private Ball ball;
     
    public Cannon() {
        try {
            File cannonFile = new File("SimProj/Animate/Media/sm_cannon.png");
            
            cannonImage = ImageIO.read(cannonFile);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        try {
            cannonSound = new SoundEffects("SimProj/Animate/Media/cannon.wav");
            cannonSound.open();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        try {
            wheelSound = new SoundEffects("SimProj/Animate/Media/wheel.wav");
            wheelSound.open();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        x = 60 - XANGLE;
        y = 720 - 60 - YANGLE;
        angle = -45;
        velo = 100;  
    }

    public void setBall(Ball ball){
        this.ball = ball;
    }

    public void playFireSound() {
         try {
            if(cannonSound != null){
                cannonSound.play();
            }

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void playWheelSound() {
         try {
            wheelSound.play();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void rotateUp(double factor) {
        angle = (int) (angle + factor);
        playWheelSound();
        if (angle < -90) {
            angle = -90;
        } else if (angle > 0) {
            angle = 0;
        }
    }

    public void rotateDown(double factor) {
    angle = (int) (angle - factor);
        playWheelSound();
        if (angle > 0) {
            angle = 0;
        } else if (angle < -90) {
            angle = -90;
        }
    }

    public void fire() {
        playFireSound();
        if (ball.getStatus() == Ball.STATUS.AIR) return;
        double radians = Math.toRadians(angle);
        double xVelo = velo * Math.cos(radians);
        double yVelo = -velo * Math.sin(radians); 

        ball.launch(x + CANNONWIDTH / 2.0, y - YANGLE, xVelo, yVelo);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVi(int velo) {
        this.velo = velo; 
    }

    public double getAngle() {
        return angle; 
    }

    public double getVi() {
        return velo;
    }

    public void spawnCannon(Graphics2D graphics) {
        final int r2 = 10;
        AffineTransform AT = new AffineTransform();
        
        AT.translate(x, y);
        AT.rotate(Math.toRadians(angle), XANGLE, YANGLE);
        graphics.drawImage(cannonImage, AT, null);

        int bX = 60;              
        int bY = 720 - 25;        

        int[] xPoints = {bX-35, bX + 35, bX};
        int[] yPoints = {bY, bY, bY - 35};
        graphics.setColor(Color.BLACK);
        graphics.fillPolygon(xPoints, yPoints, 3);
        
        int cX = bX - 5;
        int cY = (bY - 35) - 5;
        graphics.setColor(Color.BLUE);
        graphics.fillOval(cX, cY, 5 * 2, 5 * 2);
        
    }
    
    
    
   } 