/* JaGame class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JaGame {
    public static Display mainWindow;
    public static Surface mainSurface;

    public static void init(String title, int width, int height) {
        mainWindow = new Display(title, width, height);
        mainSurface = new Surface(mainWindow, Color.BLACK, 0, 0, width, height);
    }

    public static void update() {
        mainSurface.getSurface().repaint();
    }

    public void setBackground(Color newColor) {
        this.mainSurface.setBackground(newColor);
    }
}
