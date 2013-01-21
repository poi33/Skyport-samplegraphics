import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class SpGraphics extends JPanel {

    public static void main(String[] args) {

        if(args.length >= 1)
        {
            int boardSize = Integer.parseInt(args[0]);
            JFrame frame = new JFrame("Java 2D Skeleton");
            frame.add(new SpImage(boardSize));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(62*boardSize, 38*(boardSize+1));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }else{
            System.out.print("no argument given");
        }
    }
}