/* JaGame class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;

public class JaGame {
    public Display mainWindow;
    public Surface mainSurface;
    public Key key;
    public Mouse mouse;
    
//    public JaGame(String title, width, height){
//        
//    }

    public void init(String title, int width, int height) {
        this.mainWindow = new Display(title, width, height);
        this.mainSurface = new Surface(this.mainWindow, Color.BLACK, 0, 0, width, height);
//        Key.init(this.mainSurface);
//        Mouse.init(this.mainSurface);
        key = new Key();
        this.mainSurface.getGraphicsPanel().addKeyListener(key);
        mouse = new Mouse(this.mainSurface);
    }

    public void update() {
        this.mainSurface.getGraphicsPanel().repaint();
    }

    public Surface getSurface() {
        return this.mainSurface;
    }

    public void setBackground(Color newColor) {
        this.mainSurface.setBackground(newColor);
    }
}
