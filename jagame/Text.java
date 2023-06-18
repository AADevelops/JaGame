/* Text class
 * @description: Text object class.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/16/2023
 */

package jagame;

import java.awt.Color;
import java.awt.Font;

public class Text extends Shape {
    private int leftX;
    private int topY;
    private String text;
    private Color color;
    private Font font;

    public Text(Color color, int leftX, int topY, String text, Font font) {
        this.leftX = leftX;
        this.topY = topY;
        this.text = text;
        this.color = color;
        this.font = font;
    }

    /* GETTERS */

    public Color getColor() {
        return this.color;
    }

    public Font getFont() {
        return this.font;
    }

    @Override
    public int getX() {
        return this.leftX;
    }

    @Override
    public int getY() {
        return this.topY;
    }

    public String getString() {
        return this.text;
    }
}
