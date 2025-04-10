package Animate;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball {
    public enum STATUS {STATIONARY, AIR, FIRING}
    private STATUS status; 
    private double xPosition;
    private double yPosition;
    private double xVelo;
    private double yVelo;
    private final double gravity = 9.8;
    private final double level; 
    private final int radius = 10;
    private final double time = 7.0;

    public Ball(double ground) {
        this.level = ground;
        this.status = STATUS.STATIONARY;
    }

    public void draw(Graphics2D graphics) {
        if (status == STATUS.AIR) {
            graphics.setColor(Color.RED);
            graphics.fill(new Ellipse2D.Double(xPosition - radius, yPosition - radius, 2 * radius, 2 * radius));
        } else if (status == STATUS.FIRING) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval((int)xPosition - 15, (int)yPosition - 15, 30, 30); 
        }
    }

    public void updateBall() {
        if (status != STATUS.AIR) return;

        yVelo += gravity / time;

        yPosition += yVelo / time;
        xPosition += xVelo / time;

        if (yPosition >= level) {
            yPosition = level;
            status = STATUS.FIRING;
            xVelo = 0;
            yVelo = 0;
        }
    }

    public void launch(double xi, double yi, double Vxi, double Vyi) {
        if (status == STATUS.AIR) return;

        xPosition = xi;
        yPosition = yi;
        xVelo = Vxi;
        yVelo = -Vyi;  
        status = STATUS.AIR;
    }

    public void resetSystem() {
        status = STATUS.STATIONARY;
    }

    public STATUS getStatus() {
        return status;
    }
}