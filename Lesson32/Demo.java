package Lesson32;

import javax.swing.JFrame;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse and Keyboard Interaction");
        Board board = new Board();
        
        frame.add(board);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}