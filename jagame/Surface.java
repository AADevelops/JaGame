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

    // color param is temp for testing
    public Surface(Display mainDisplay, Color color, int x, int y, int width, int height) {
        this.surface = new JPanel();
        this.surface.setBounds(x, y, width, height);
        this.surface.setBackground(color);
        mainDisplay.getDisplay().add(this.surface);
    }

    public void setBackground(Color color) {
        this.surface.setBackground(color);
    }

    /* GETTERS */

    public JPanel getSurface() {
        return this.surface;
    }
}
