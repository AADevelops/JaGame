/* Image class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Image extends Shape{
    //
    private static BufferedImage picture;
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Image(int x, int y, int width, int height, String fileName){
//        load(fileName);
        this.x = x;
        this.y = y;
        try{
            this.picture = ImageIO.read(new File(fileName));
        }
        catch (IOException ex){System.out.println("File not found.");}
        this.width = width;
        this.height = height;
    }
    
    public Image(int x, int y, String fileName){
        this.x = x;
        this.y = y;
        try{
            this.picture = ImageIO.read(new File(fileName));
            this.width = this.picture.getWidth();
            this.height = this.picture.getHeight();
        }
        catch (IOException ex){System.out.println("File not found.");}
    }
       
//    public void load(String name){
//        try{
//            this.picture = ImageIO.read(new File(name));
//        }
//        catch (IOException ex){System.out.println("File not found.");}
//        this.width = this.picture.getWidth();
//        this.height = this.picture.getHeight();
//    }
    
    public BufferedImage getImage(){
        return this.picture;
    }
    
    @Override
    public int getX(){
        return this.x;
    }
    
    @Override
    public int getY(){
        return this.y;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
}
