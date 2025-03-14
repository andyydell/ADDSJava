package Lesson32;



import javax.swing.JPanel;
import Lesson32.SoundEffects;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements KeyListener, MouseListener {

    public void keyPressed(KeyEvent f) {
    if (f.getKeyCode() == KeyEvent.VK_SPACE) {
        blop();
        xDot = (WIDTHa / 2) - (WIDTH / 2);
        yDot = (HEIGHTa / 2) - (WIDTH / 2);
        repaint();
    }
}

    public void mousePressed(MouseEvent f) {
        xDot = f.getX() - (WIDTH / 2);
        yDot = f.getY() - (WIDTH / 2);
        repaint();
        blip();
    }

    public void keyTyped(KeyEvent f) {
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

    private final int WIDTHa = 400;
    private final int HEIGHTa = 400;
    private final int WIDTH = 20;
    private int xDot = (WIDTHa / 2) - (WIDTH / 2);
    private int yDot = (HEIGHTa / 2) - (WIDTH / 2);
    SoundEffects blip = new SoundEffects("Lesson32/Files/blip.wav");
    SoundEffects blop = new SoundEffects("Lesson32/Files/blop.wav");

    private void blop() {
        blop.setLoop(false);
        blop.open();
        blop.play();
    }

    private void blip() {
        blip.setLoop(false);
        blip.open();
        blip.play();
    }

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(WIDTHa, HEIGHTa));
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphic = (Graphics2D) g;
        graphic.setColor(Color.MAGENTA);

        graphic.setColor(Color.MAGENTA);
        graphic.fillOval(xDot, yDot, WIDTH, WIDTH);
    }
}