/* Plan class
 * @description: Random file with program structure.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/5/2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class JaGame {
  public void init(int width, int height){
    Display.init(width, height);
//    while(true){
//      Display.update();
//      try{Thread.sleep(frameRate);}catch(Exception e){}
//    }
  }
  public void update(){
    Display.update();
  }
}

public class Surface {
  
}

public class Display {
  //
  JFrame gameWindow;
  GraphicsPanel canvas;
  static boolean run;
  public void init(int width, int height){
    gameWindow = new JFrame("");
    gameWindow.setSize(width, height);
    gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    canvas = new GraphicsPanel();
    gameWindow.add(canvas);
    gameWindow.setVisible(true);
//    run = true;
  }
  
  public void quit(){
    canvas = null;
    gameWindow = null;
//    run = false;
  }
  
  public void update(){
    gameWindow.repaint();
  }
}


public class Draw extends JPanel{
//  JFrame frame = Display.getFrame();
//  GraphicsPanel canvas = new GraphicsPanel();
//  frame.add(canvas);
  //
  public Queue<E> drawQueue = new LinkedList<E>();
  
//  public class Rect{
//    
//  }
//  
//  public class Polygon{
//    
//  }
//  
//  public class Circle{
//    
//  }
//  
//  public class Ellipse{
//    
//  }
//  
//  public class Arc{
//    
//  }
//  
//  public class Line{
//    
//  }
//  
//  public class Image{
//    
//  }
  public void image(Image picture){
    g.drawImage(picture, x, y, null);
  }
  
  public void rect(Graphics g){
    g.setColor();
    g.drawRect();
  }
  public void polygon(){
    g.setColor();
    g.fillPolygon();
  }
  public void circle(){
    g.setColor();
    g.fillOval();
  }
  public void ellipse(){
    g.setColor();
    g.fillOval();
  }
  public void arc(){
    g.setColor();
    g.drawArc();
  }
  public void line(){
    g.setColor();
    g.drawLine();
  }
  
  public class GraphicsPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      while(!drawQueue.isEmpty()){
        draw(drawQueue.remove());
      }
    }
  }
}

//public class Image {
//  //
//  private BufferedImage picture;
//  private int x;
//  private int y;
//  
//  public BufferedImage load(String fileName){
//    try{
//      this.picture = ImageIO.read(new File(fileName));
//    }catch (IOException ex){}
//  }
//  public void save(){
//    
//  }
//}

//public class 

public class Key implements KeyListener{
  //
  HashMap<Integer, Boolean> keyMap = new HashMap<Integer, Boolean>();
  
  public void init(){
    //load from file to keyMap

  }
  
  public void keyPressed(KeyEvent e){
    int key = e.getKeyCode();
    keyMap.replace(key, true);
  }
  
  public void keyReleased(KeyEvent e){
    int key = e.getKeyCode();
    keyMap.replace(key, false);
  }
  
  public void keyTyped(KeyEvent e){
  }
  
  public Set<Boolean> getPressed(){
    return keyMap.entrySet();
  }
  
  public boolean isPressed(int key){
    return keyMap.get(key);
  }
}

public class Mouse implements MouseListener, MouseMotionListener {
  //
  private static int[] mousePos = new int[2];
  static boolean[] mouseButtons = new boolean[MouseInfo.getNumberOfButtons()];
  public void mouseClicked(MouseEvent e){
  }
  public void mouseEntered(MouseEvent e){
  }
  public void mouseExited(MouseEvent e){
  }
  public void mousePressed(MouseEvent e){
    mouseButtons[mouse.getButton()] = true;
  }
  public void mouseReleased(MouseEvent e){
    mouseButtons[mouse.getButton()] = false;
  }
  public void mouseMoved(MouseEvent e){
    mousePos[0] = e.getX();
    mousePos[1] = e.getY();
  }
  public void mouseDragged(MouseEvent e){
    
  }
  
  public boolean[] getPressed(MouseEvent e){
    return mouseButtons;
  }
  
  public int[] getPos(MouseEvent e){
    return mousePos;
  }
  
  public void setPos(int x, int y){
    MouseEvent e = new MouseEvent();
    int xOffset = x - e.getX();
    int yOffset = y - e.getY();
    e.translatePoint(xOffset, yOffset);
  }
  
  public void getRel(){
  }
}
