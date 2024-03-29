import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

import java.util.Random;

public class SpImage extends Component
{
  Image background;
  Image[] hexes;
  Image test;
  int field[][];
  int boardWidth;
  int boardHeight;
  public void paint(Graphics g)
  {
    Graphics2D g2d = (Graphics2D) g;drawBackground(g2d);
    drawBoard(g2d, field);

  }
  public SpImage(int fieldSize)
  {
    boardWidth = 62*fieldSize;
    boardHeight =38*(fieldSize+1);
    field = new int[fieldSize][fieldSize];
    hexes = new Image[7];

    background = loadImage("starrysky.png");
    hexes[0] = loadImage("tileBlack.png");
    hexes[1] = loadImage("tileBlue.png");
    hexes[2] = loadImage("tileGrey.png");
    hexes[3] = loadImage("tileGreen.png");
    hexes[4] = loadImage("tileRed.png");
    hexes[5] = loadImage("tileOrange.png");
    hexes[6] = loadImage("tileYellow.png");
    for (int i = 0; i<field.length; i++)
      for (int j = 0; j<field.length; j++)
        field[i][j] = (int) Math.floor(Math.random()*7); //hexes = {loadImage("tileBlack.png"),loadImage("tileBlue.png"),loadImage("tileGrey.png"),loadImage("tileGreen.png"),loadImage("tileRed.png"),loadImage("tileOrange.png"),loadImage("tileYellow.png")};
  }

  public void drawHex(Graphics2D g2d, int type, int j, int k, int m)
  { 
    int realWidth = (m+k-j)*31-31;
    int realHeight = (k+j)*19;
    g2d.drawImage(hexes[type],realWidth,realHeight,null);
  }

  public void drawBackground(Graphics2D g2d)
  {
    for(int i = 0; i < boardWidth; i += background.getWidth(null))
      for(int j = 0; j < boardHeight; j += background.getHeight(null))
        g2d.drawImage(background,i,j,null);
  }

  public void drawBoard(Graphics2D g2d, int[][] board)
  {
    int m = board.length;
    for (int rows = 0; rows < m; rows++)
    {
      for (int cols = 0; cols < m; cols++)
      {
        drawHex(g2d,board[rows][cols],rows,cols,m);
      }
    }
  }

  public Image loadImage(String imageName)
  {
    BufferedImage img = null;
    try {
      img = ImageIO.read(new File(imageName));
    } catch (IOException e) {}
	// THIS IS NOT HOW YOU REtURN AN EXCEPTION!
    return img;
  }
}