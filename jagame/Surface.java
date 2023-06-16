/* Surface class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Queue;
import java.util.LinkedList;

public class Surface {
    private GraphicsPanel surface;
    
    // color param is temp for testing
    public Surface(Display mainDisplay, Color color, int x, int y, int width, int height) {
        this.surface = new GraphicsPanel();
        this.surface.setLayout(null);
        this.surface.setBounds(x, y, width, height);
        this.surface.setBackground(color);
        mainDisplay.getDisplay().add(this.surface);
    }

    public void setBackground(Color color) {
        this.surface.setBackground(color);
    }
    
    public void addShape(Shape shape){
        surface.drawQueue.add(shape);
    }

    /* GETTERS */

    public JPanel getSurface() {
        return this.surface;
    }
}
