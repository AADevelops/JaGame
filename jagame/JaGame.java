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

    public void init(String title, int width, int height) {
        this.mainWindow = new Display(title, width, height);
        this.mainSurface = new Surface(this.mainWindow, Color.BLACK, 0, 0, width, height);
    }

    public void update() {
        this.mainSurface.getSurface().repaint();
    }

    public Surface getSurface() {
        return this.mainSurface;
    }

    public void setBackground(Color newColor) {
        this.mainSurface.setBackground(newColor);
    }
}
