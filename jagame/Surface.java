/* Surface class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;
import java.util.Queue;

public class Surface {
    private GraphicsPanel surface;
    
    // color param is temp for testing change x, y, width, height
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
        getDrawQueue().add(shape);
    }

    /* GETTERS */

    public GraphicsPanel getGraphicsPanel() {
        return this.surface;
    }
    
    public Queue<Shape> getDrawQueue() {
        return this.surface.getDrawQueue();
    }
}
