/* Ellipse class
 * @description: Ellipse shape class.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/16/2023
 */

package jagame;

import java.awt.Color;

public class Ellipse extends Shape {
    private int leftX;
    private int topY;
    private int width;
    private int height;
    private Color color;

    public Ellipse(Color color, int leftX, int topY, int width, int height) {
        this.leftX = leftX;
        this.topY = topY;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /* GETTERS */

    @Override
    public int getX() {
        return this.leftX;
    }

    @Override
    public int getY() {
        return this.topY;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Color getColor() {
        return this.color;
    }
}
