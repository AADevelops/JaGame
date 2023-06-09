/* Mouse class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.MouseInfo;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class Mouse {
    //
    final static int X = 0;
    final static int Y = 0;
    private static int[] mousePos = new int[2];
  static boolean[] mouseButtons = new boolean[MouseInfo.getNumberOfButtons()];
  public void mouseClicked(MouseEvent e){
  }
  public void mouseEntered(MouseEvent e){
  }
  public void mouseExited(MouseEvent e){
  }
  public void mousePressed(MouseEvent e){
    mouseButtons[e.getButton()] = true;
  }
  public void mouseReleased(MouseEvent e){
    mouseButtons[e.getButton()] = false;
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
    int xOffset = mousePos[X] - e.getX();
    int yOffset = mousePos[Y] - e.getY();
    e.translatePoint(xOffset, yOffset);
  }
  
  public void getRel(){
  }
}
