/* Draw class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import javax.swing.JLabel;
import java.awt.Font;

public class Draw {
    private final Font DEFAULT_FONT = Font.getFont("Times New Roman");

    public void addText(Surface surface, String text, Font font, int xSize, int ySize, int x, int y) {
        JLabel textLabel;

        if (text == null) {
            textLabel = new JLabel();
        } else {
            textLabel = new JLabel(text);
        }

        if (font == null) {
            textLabel.setFont(this.DEFAULT_FONT);
        } else {
            textLabel.setFont(font);
        }

        textLabel.setBounds(x, y, xSize, ySize);

        surface.getSurface().add(textLabel);
    }
}
