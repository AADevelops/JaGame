/* Arc class
 * @description: Arc shape object.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/16/2023
 */

package jagame;

import java.awt.Color;

public class Arc extends Shape {
    private int leftX;
    private int topY;
    private int width;
    private int height;
    private int startAngle;
    private int stopAngle;
    private Color color;

    public Arc(Color color, int leftX, int topY, int width, int height, int startAngle, int stopAngle) {
        this.leftX = leftX;
        this.topY = topY;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.stopAngle = stopAngle;
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

    public int getStartAngle() {
        return this.startAngle;
    }

    public int getStopAngle() {
        return this.stopAngle;
    }

    public Color getColor() {
        return this.color;
    }
}
