/* Mouse class
 * @description: Allows programmers to monitor mouse status and activity.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse implements MouseListener, MouseMotionListener {
    private final int X = 0;
    private final int Y = 1;
    private int[] mousePos;
    private boolean[] mouseButtons;
    private boolean isDragging;
    private boolean inFrame;

    public Mouse(GraphicsPanel surface) {
        this.mousePos = new int[2];
        this.mouseButtons = new boolean[MouseInfo.getNumberOfButtons()];

        surface.addMouseListener(this);
        surface.addMouseMotionListener(this);
    }

    /* METHODS */

    public void mouseDragged(MouseEvent e) {
        this.mousePos[X] = e.getX();
        this.mousePos[Y] = e.getY();
        this.mouseButtons[e.getButton()] = true;
        this.isDragging = true;
    }

    public void mouseMoved(MouseEvent e) {
        this.mousePos[X] = e.getX();
        this.mousePos[Y] = e.getY();
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        this.mouseButtons[e.getButton()] = true;
    }

    public void mouseReleased(MouseEvent e) {
        this.mouseButtons[e.getButton()] = false;
        this.isDragging = false;
    }

    public void mouseEntered(MouseEvent e) { 
        this.inFrame = true;
    }

    public void mouseExited(MouseEvent e) {
        this.inFrame = false;
    }

    /* GETTERS */

    public int[] getPos() {
        return this.mousePos;
    }

    public boolean[] getPressed() {
        return this.mouseButtons;
    }

    public boolean getDragging() {
        return this.isDragging;
    }

    public boolean getInWindow() {
        return this.inFrame;
    }

    /* SETTERS */

    public void setPos(int x, int y, MouseEvent e) {
        int xOffset = mousePos[X] - e.getX();
        int yOffset = mousePos[Y] - e.getY();
        e.translatePoint(xOffset, yOffset);
    }
}
