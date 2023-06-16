package jagame;

import java.awt.Color;

public class Ellipse extends Shape{
    private int leftX;
    private int topY;
    private int width;
    private int height;
    private Color color;
    
    public Ellipse(Color color, int leftX, int topY, int width, int height){
        this.leftX = leftX;
        this.topY = topY;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    @Override
    public int getX(){
        return this.leftX;
    }
    
    @Override
    public int getY(){
        return this.topY;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
}