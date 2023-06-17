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
    // private JFrame mainWindow;
    // private JPanel mainSurface;
    // private GraphicsPanel mainCanvas;
    private Display mainWindow;
    private Surface mainSurface;

    public void init(String title, int width, int height) {
        // this.mainWindow = new JFrame(title);
        // this.mainWindow.setSize(width, height);
        // this.mainWindow.setLayout(null);
        // this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this.mainSurface = new JPanel();
        // this.mainSurface.setLayout(null);
        // this.mainSurface.setBounds(0, 0, width, height);

        // this.mainCanvas = new GraphicsPanel();
        // this.mainSurface.add(this.mainCanvas);

        // this.mainWindow.add(this.mainSurface);
        // this.mainWindow.setVisible(true);

        this.mainWindow = new Display(title, width, height);
        this.mainSurface = new Surface(this.mainWindow, Color.BLACK, 0, 0, width, height);
    }

    public void update() {
        this.mainSurface.getSurface().repaint();
    }

    public void addShape(Shape newShape) {
        this.mainSurface.getCanvas().drawQueue.add(newShape);
    }

    public void setBackground(Color newColor) {
        this.mainSurface.setBackground(newColor);
    }
}
