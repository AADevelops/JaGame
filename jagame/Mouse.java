/* Mouse class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
// import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
// import java.awt.event.MouseWheelListener;
// import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {
    final int X = 0;
    final int Y = 1;

    private int[] mousePos = new int[2];
    private boolean[] mouseButtons = new boolean[MouseInfo.getNumberOfButtons()];

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
    public void mouseDragged(MouseEvent e){
        
    }
    
    public boolean[] getPressed(MouseEvent e){
        return mouseButtons;
    }
    
    public int[] getPos() {
        PointerInfo cursorInfo = MouseInfo.getPointerInfo();
        Point cursorLocation = cursorInfo.getLocation();
        mousePos[0] = (int) cursorLocation.getX();
        mousePos[1] = (int) cursorLocation.getY();
        return mousePos;
    }
 
//    public void setPos(int x, int y){
//        int xOffset = mousePos[X] - e.getX();
//        int yOffset = mousePos[Y] - e.getY();
//        e.translatePoint(xOffset, yOffset);
//    }
    
    public void setPos(int x, int y, MouseEvent e){
        int xOffset = mousePos[X] - e.getX();
        int yOffset = mousePos[Y] - e.getY();
        e.translatePoint(xOffset, yOffset);
    }
    
    public void getRel(){
    }
}
