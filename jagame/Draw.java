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
    
    public void rect(Surface surface, Color color, int leftX, int topY, int width, int height){
        
    }
    
//    public void polygon(Surface surface, Color color, ){
//        
//    }
    
    public void circle(Surface surface, Color color, int centerX, int centerY, int radius){
        
    }
    
    public void ellipse(Surface surface, Color color, int leftX, int topY, int width, int height){
        
    }
    
    public void arc(Surface surface, Color color, int leftX, int topY, int width, int height, int startAngle, int stopAngle){
        
    }
    
    public void line(Surface surface, Color color, int startX, int startY, int endX, int endY){
        
    }
    
    public void image(Surface surface, int leftX, int topY, int width, int height, String fileName){ //its own surface??
        
    }
    
    public void text(Surface surface, Color color, int leftX, int topY, String text){
        
    }
}
