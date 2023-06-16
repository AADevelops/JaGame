package jagame;

import java.awt.Color;

public class Line extends Shape{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    
    public Line(Color color, int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }
    
    public Color getColor(){
        return this.color;
    }
    
    @Override
    public int getX(){
        return this.x1;
    }
    
    @Override
    public int getY(){
        return this.y1;
    }
    
    public int getEndX(){
        return this.x2;
    }
    
    public int getEndY(){
        return this.y2;
    }
}