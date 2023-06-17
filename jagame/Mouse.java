/* Mouse class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
// import java.awt.event.MouseWheelListener;
// import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse {
    final int X = 0;
    final int Y = 1;
    private int[] mousePos = new int[2];
    private boolean[] mouseButtons;
    
    public Mouse(Surface surface) {
        mouseButtons = new boolean[MouseInfo.getNumberOfButtons()];
        ButtonListener mouseListener = new ButtonListener();
        surface.getGraphicsPanel().addMouseListener(mouseListener);
        MotionListener mouseMotionListener = new MotionListener();
        surface.getGraphicsPanel().addMouseMotionListener(mouseMotionListener);
        
    }
    
    public int[] getPos(){
        return mousePos;
    }
    
    public boolean[] getPressed(MouseEvent e){
        return mouseButtons;
    }
    
    public class MotionListener implements MouseMotionListener {
//        final int X = 0;
//        final int Y = 1;
//        private int[] mousePos = new int[2];
        public void mouseDragged(MouseEvent e){
            
        }
        public void mouseMoved(MouseEvent e){
            mousePos[X] = e.getX();
            mousePos[Y] = e.getY();
        }
        public void setPos(int x, int y, MouseEvent e){
            int xOffset = mousePos[X] - e.getX();
            int yOffset = mousePos[Y] - e.getY();
            e.translatePoint(xOffset, yOffset);
        }
    }
    
    public class ButtonListener implements MouseListener {
        public void mouseClicked(MouseEvent e){
        }
        public void mousePressed(MouseEvent e){
            mouseButtons[e.getButton()] = true;
        }
        public void mouseReleased(MouseEvent e){
            mouseButtons[e.getButton()] = false;
        }
        public void mouseEntered(MouseEvent e){ 
        }
        public void mouseExited(MouseEvent e){
        }
    }
    
    public ButtonListener getMouseListener(){
        return new ButtonListener();
    }
    
    public MotionListener getMouseMotionListener(){
        return new MotionListener();
    }
    
//    public int[] getPos() {
////        PointerInfo cursorInfo = MouseInfo.getPointerInfo();
////        Point cursorLocation = cursorInfo.getLocation();
////        mousePos[0] = (int) cursorLocation.getX();
////        mousePos[1] = (int) cursorLocation.getY();
//        return mousePos;
//    }
 
//    public void setPos(int x, int y){
//        int xOffset = mousePos[X] - e.getX();
//        int yOffset = mousePos[Y] - e.getY();
//        e.translatePoint(xOffset, yOffset);
//    }
    
//    public void setPos(int x, int y, MouseEvent e){
//        int xOffset = mousePos[X] - e.getX();
//        int yOffset = mousePos[Y] - e.getY();
//        e.translatePoint(xOffset, yOffset);
//    }
    
//    public void getRel(){
//    }
}
