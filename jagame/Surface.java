/* Surface class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;
import javax.swing.JPanel;

public class Surface {
    private GraphicsPanel surface;
//    public GraphicsPanel canvas;
    
    // color param is temp for testing
    public Surface(Display display, Color color, int x, int y, int width, int height) {
        this.surface = new GraphicsPanel();
        display.getFrame().add(this.surface);
    }

    public void update() {
        this.surface.repaint();
    }

    public void setBackground(Color color) {
        this.surface.setBackground(color);
    }
    
    public void addShape(Shape shape){
        this.surface.drawQueue.add(shape);
    }

    /* GETTERS */

    public GraphicsPanel getSurface() {
        return this.surface;
    }
}
