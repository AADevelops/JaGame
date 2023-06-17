/* Draw class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

// import javax.swing.JLabel;
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
    
    public static void rect(Surface window, Color color, int leftX, int topY, int width, int height){
        window.getDrawQueue().add(new Rect(color, leftX, topY, width, height));
    }
    
//    public void polygon(Surface surface, Color color, int[][] points){
//        
//    }
    
    public static void circle(Surface window, Color color, int leftX, int topY, int width){
        window.getDrawQueue().add(new Ellipse(color, leftX, topY, width, width));
    }
    
    public static void ellipse(Surface window, Color color, int leftX, int topY, int width, int height){
        window.getDrawQueue().add(new Ellipse(color, leftX, topY, width, height));
    }
    
    public static void arc(Surface window, Color color, int leftX, int topY, int width, int height, int startAngle, int stopAngle){
        window.getDrawQueue().add(new Arc(color, leftX, topY, width, height, startAngle, stopAngle));
    }
    
    public static void line(Surface window, Color color, int startX, int startY, int endX, int endY){
        window.getDrawQueue().add(new Line(color, startX, startY, endX, endY));
    }
    
    public static void image(Surface window, int leftX, int topY, int width, int height, String fileName){ //its own surface??
        window.getDrawQueue().add(new Image(leftX, topY, width, height, fileName));
    }
    
    public static void image(Surface window, int leftX, int topY, String fileName){
        window.getDrawQueue().add(new Image(leftX, topY, fileName));
    }
    
    public static void text(Surface window, Color color, int leftX, int topY, String text, Font font){
        if(font == null){
            font = DEFAULT_FONT;
        }
        window.getDrawQueue().add(new Text(color, leftX, topY, text, font));
    }
}
