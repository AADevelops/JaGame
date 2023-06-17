/* Key class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Set;

public class Key implements KeyListener{
    //
    static HashMap<Integer, Boolean> keyMap = new HashMap<Integer, Boolean>();
    
    public Key(){
        K_.init(this);
    }
    
//    public static void init(Surface surface){
//        //load from file to keyMap
//        Key key = new Key();
//        K_.init(key);
//        surface.getGraphicsPanel().addKeyListener(key);
//    }
    
//how to move at angles/smooth movement ?????????????????????????????????????????????????????????????????????
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        keyMap.replace(key, true);
        System.out.println(keyMap.get(key));
//        System.out.println(e.getKeyChar());
    }
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        keyMap.replace(key, false);
        System.out.println(keyMap.get(key));
//        System.out.println(e.getKeyChar());
    }
    
    public void keyTyped(KeyEvent e){
    }
    
//    public Set<Boolean> getPressed(){
//        return keyMap.entrySet();
//    }
    
    public static boolean isPressed(int key){
        if(keyMap.get(key) == null){
            return false;
        }
        else{
            return keyMap.get(key);
        }
    }
}
