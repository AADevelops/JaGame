package jagame;

import java.awt.Color;
import java.awt.Font;

public class Text extends Shape{
    private int x;
    private int y;
    private String text;
    private Color color;
    private Font font;
    
    public Text(Color color, int x, int y, String text, Font font){
        this.x = x;
        this.y = y;
        this.text = text;
        this.color = color;
        this.font = font;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    public Font getFont(){
        return this.font;
    }
    
    @Override
    public int getX(){
        return this.x;
    }
    
    @Override
    public int getY(){
        return this.y;
    }
    
    public String getString(){
        return this.text;
    }
}