/* Image class
 * @description: Image object class.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Image extends Shape {
    private BufferedImage picture;
    private int leftX;
    private int topY;
    private int width;
    private int height;

    public Image(int leftX, int topY, int width, int height, String fileName) {
        this.leftX = leftX;
        this.topY = topY;

        try {
            this.picture = ImageIO.read(new File(fileName));
        } catch (IOException error) {
            System.out.println("File not found. Error Message: \n" + error);
        }

        this.width = width;
        this.height = height;
    }

    public Image(int leftX, int topY, String fileName) {
        this.leftX = leftX;
        this.topY = topY;

        try {
            this.picture = ImageIO.read(new File(fileName));
            this.width = this.picture.getWidth();
            this.height = this.picture.getHeight();
        } catch (IOException error) {
            System.out.println("File not found. Error Message: \n" + error);
        }
    }

    /* GETTERS */

    public BufferedImage getImage() {
        return this.picture;
    }

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
}
