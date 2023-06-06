/* Plan class
 * @description: Random file with program structure.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/5/2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display {
  //
  
}

public class Draw {
//  JFrame frame = Display.getFrame();
//  GraphicsPanel canvas = new GraphicsPanel();
//  frame.add(canvas);
  //
  public void image(Image picture){
    g.drawImage(picture, x, y, null);
  }
  
  public void rect(){
    g.drawRect();
  }
  public void polygon(){
    g.fillPolygon();
  }
  public void circle(){
    g.fillOval();
  }
  public void ellipse(){
    g.fillOval();
  }
  public void arc(){
    g.drawArc();
  }
  public void line(){
    g.drawLine();
  }
  public class GraphicsPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor();
      g.fillRect();
    }
  }
}

import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException
public class Image {
  //
  
  public void load(){
    
  }
  public void save(){
    
  }
}

//public class 

public class Key implements KeyListener{
  //
  HashMap<Integer, Boolean> keyMap = new HashMap<Integer, Boolean>();
  
  public void init(){
    keyMap.put(KeyEvent.VK_0, false);
    keyMap.put(KeyEvent.VK_1, false);
    keyMap.put(KeyEvent.VK_2, false);
    keyMap.put(KeyEvent.VK_3, false);
    keyMap.put(KeyEvent.VK_4, false);
    keyMap.put(KeyEvent.VK_5, false);
    keyMap.put(KeyEvent.VK_6, false);
    keyMap.put(KeyEvent.VK_7, false);
    keyMap.put(KeyEvent.VK_8, false);
    keyMap.put(KeyEvent.VK_9, false);
    keyMap.put(KeyEvent.VK_A, false);
    keyMap.put(KeyEvent.VK_B, false);
    keyMap.put(KeyEvent.VK_C, false);
    keyMap.put(KeyEvent.VK_D, false);
    keyMap.put(KeyEvent.VK_E, false);
    keyMap.put(KeyEvent.VK_F, false);
    keyMap.put(KeyEvent.VK_G, false);
    keyMap.put(KeyEvent.VK_H, false);
    keyMap.put(KeyEvent.VK_I, false);
    keyMap.put(KeyEvent.VK_J, false);
    keyMap.put(KeyEvent.VK_K, false);
    keyMap.put(KeyEvent.VK_L, false);
    keyMap.put(KeyEvent.VK_M, false);
    keyMap.put(KeyEvent.VK_N, false);
    keyMap.put(KeyEvent.VK_O, false);
    keyMap.put(KeyEvent.VK_P, false);
    keyMap.put(KeyEvent.VK_Q, false);
    keyMap.put(KeyEvent.VK_R, false);
    keyMap.put(KeyEvent.VK_S, false);
    keyMap.put(KeyEvent.VK_T, false);
    keyMap.put(KeyEvent.VK_U, false);
    keyMap.put(KeyEvent.VK_V, false);
    keyMap.put(KeyEvent.VK_W, false);
    keyMap.put(KeyEvent.VK_X, false);
    keyMap.put(KeyEvent.VK_Y, false);
    keyMap.put(KeyEvent.VK_Z, false);
    keyMap.put(KeyEvent.VK_SPACE, false);
    keyMap.put(KeyEvent.VK_TAB, false);
    keyMap.put(KeyEvent.VK_ENTER, false);
    keyMap.put(KeyEvent.VK_SHIFT, false);
    keyMap.put(KeyEvent.VK_ESCAPE, false);
    keyMap.put(KeyEvent.VK_DOWN, false);
    keyMap.put(KeyEvent.VK_LEFT, false);
    keyMap.put(KeyEvent.VK_RIGHT, false);
    keyMap.put(KeyEvent.VK_UP, false);
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
}

public class Mouse implements MouseListener, MouseMotionListener{
  //
  static int[] mousePos = new int[2];
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
  
  public int[] getRel(){
  }
}
