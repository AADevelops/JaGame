/* GraphicsPanel class
 * @description: Graphics canvas for main windows.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/16/2023
 */

package jagame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
    private Queue<Shape> drawQueue = new LinkedList<Shape>();

    public GraphicsPanel(Display display, Color color, int x, int y, int width, int height) {
        display.getFrame().add(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    /* METHODS */

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        while (this.drawQueue.peek() != null) {
            Shape object = this.drawQueue.remove();
            int x = object.getX();
            int y = object.getY();

            if (object instanceof Rect) {
                int width = ((Rect) object).getWidth();
                int height = ((Rect) object).getHeight();

                g.setColor(((Rect) object).getColor());
                g.fillRect(x, y, width, height);
            } else if (object instanceof Ellipse) {
                int width = ((Ellipse) object).getWidth();
                int height = ((Ellipse) object).getHeight();

                g.setColor(((Ellipse) object).getColor());
                g.fillOval(x, y, width, height);
            } else if (object instanceof Arc) {
                int width = ((Arc) object).getWidth();
                int height = ((Arc) object).getHeight();
                int startAngle = ((Arc) object).getStartAngle();
                int stopAngle = ((Arc) object).getStopAngle();

                g.setColor(((Arc) object).getColor());
                g.drawArc(x, y, width, height, startAngle, stopAngle);
            } else if (object instanceof Line) {
                int endX = ((Line) object).getEndX();
                int endY = ((Line) object).getEndY();

                g.setColor(((Line) object).getColor());
                g.drawLine(x, endX, y, endY);
            } else if (object instanceof Image) {
                BufferedImage image = ((Image) object).getImage();
                int width = ((Image) object).getWidth();
                int height = ((Image) object).getHeight();

                g.drawImage(image, x, y, width, height, null);
            } else if (object instanceof Text) {
                String string = ((Text) object).getString();

                g.setFont(((Text) object).getFont());
                g.setColor(((Text) object).getColor());
                g.drawString(string, x, y);
            }
        }
    }

    /* GETTERS */

    public Queue<Shape> getDrawQueue() {
        return drawQueue;
    }
}
