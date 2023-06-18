/* JaGame class
 * @description: Beginner-friendly module for initializing graphical display.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;

public class JaGame {
    private Display mainWindow;
    private GraphicsPanel mainSurface;
    private Key key;
    private Mouse mouse;

    public JaGame(String title, int width, int height) {
        this.mainWindow = new Display(title, width, height);
        this.mainSurface = new GraphicsPanel(this.mainWindow, Color.BLACK, 0, 0, width, height);
        this.key = new Key();
        this.mainSurface.addKeyListener(this.key);
        this.mouse = new Mouse(this.mainSurface);
    }

    /* METHODS */

    public void update(int sleepTime) {
        this.mainSurface.repaint();
        try { Thread.sleep(sleepTime); } catch (Exception e) {}
    }

    /* GETTERS */

    public GraphicsPanel getSurface() {
        return this.mainSurface;
    }

    public Key getKey() {
        return this.key;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    /* SETTERS */

    public void setBackground(Color newColor) {
        this.mainSurface.setBackground(newColor);
    }
}
