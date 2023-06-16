package jagame;

import java.awt.Color;

public class Circle extends Shape{
    private int leftX;
    private int topY;
    private int radius;
    private int width;
    private Color color;
    
    public Circle(Color color, int leftX, int topY, int radius, int width){
        this.leftX = leftX;
        this.topY = topY;
        this.width = width;
        this.radius = radius;
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
    
    public int getRadius(){
        return this.radius;
    }
}