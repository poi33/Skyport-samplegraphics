import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class SpGraphics extends JPanel {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java 2D Skeleton");
        frame.add(new SpImage(40));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}