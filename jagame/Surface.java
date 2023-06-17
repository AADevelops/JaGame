/* Surface class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;
import javax.swing.JPanel;

public class Surface {
    private JPanel surface;
    private GraphicsPanel canvas;
    
    // color param is temp for testing
    public Surface(Display mainDisplay, Color color, int x, int y, int width, int height) {
        this.surface = new JPanel();
        this.surface.setLayout(null);
        this.surface.setBounds(x, y, width, height);
        this.surface.setBackground(color);

        this.canvas = new GraphicsPanel();
        this.canvas.setLayout(null);
        this.canvas.setBounds(x, y, width, height);
        this.surface.add(this.canvas);

        mainDisplay.getDisplay().add(this.surface);
    }

    public void update() {
        this.canvas.repaint();
    }

    public void setBackground(Color color) {
        this.surface.setBackground(color);
    }
    
    public void addShape(Shape shape){
        this.canvas.drawQueue.add(shape);
    }

    /* GETTERS */

    public JPanel getSurface() {
        return this.surface;
    }

    public GraphicsPanel getCanvas() {
        return this.canvas;
    }
}
