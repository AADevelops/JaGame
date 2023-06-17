/* Draw class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Draw {
//    private final Font DEFAULT_FONT = Font.getFont("Times New Roman");
    private static final Font DEFAULT_FONT = new Font("Times New Roman", Font.BOLD, 100);
//    public void addText(String text, Font font, int xSize, int ySize, int x, int y) {
//        JLabel textLabel;
//
//        if (text == null) {
//            textLabel = new JLabel();
//        } else {
//            textLabel = new JLabel(text);
//        }
//
//        if (font == null) {
//            textLabel.setFont(this.DEFAULT_FONT);
//        } else {
//            textLabel.setFont(font);
//        }
//
//        textLabel.setBounds(x, y, xSize, ySize);
//
//        surface.getSurface().add(textLabel);
//    }
    
    public static void rect(Color color, int leftX, int topY, int width, int height){
        JaGame.mainSurface.getSurface().drawQueue.add(new Rect(color, leftX, topY, width, height));
    }
    
//    public void polygon(Surface surface, Color color, int[][] points){
//        
//    }
    
    public static void circle(Color color, int leftX, int topY, int width){
        JaGame.mainSurface.getSurface().drawQueue.add(new Ellipse(color, leftX, topY, width, width));
    }
    
    public static void ellipse(Color color, int leftX, int topY, int width, int height){
        JaGame.mainSurface.getSurface().drawQueue.add(new Ellipse(color, leftX, topY, width, height));
    }
    
    public static void arc(Color color, int leftX, int topY, int width, int height, int startAngle, int stopAngle){
        JaGame.mainSurface.getSurface().drawQueue.add(new Arc(color, leftX, topY, width, height, startAngle, stopAngle));
    }
    
    public static void line(Color color, int startX, int startY, int endX, int endY){
        JaGame.mainSurface.getSurface().drawQueue.add(new Line(color, startX, startY, endX, endY));
    }
    
    public static void image(int leftX, int topY, int width, int height, String fileName){ //its own surface??
        JaGame.mainSurface.getSurface().drawQueue.add(new Image(leftX, topY, width, height, fileName));
    }
    
    public static void text(Color color, int leftX, int topY, String text, Font font){
        if(font == null){
            font = DEFAULT_FONT;
        }
        JaGame.mainSurface.getSurface().drawQueue.add(new Text(color, leftX, topY, text, font));
    }
}
