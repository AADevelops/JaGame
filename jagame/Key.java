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
    
    public void init(){
        //load from file to keyMap
        K_.init();
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        keyMap.replace(key, true);
    }
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        keyMap.replace(key, false);
    }
    
    public void keyTyped(KeyEvent e){
    }
    
//    public Set<Boolean> getPressed(){
//        return keyMap.entrySet();
//    }
    
    public boolean isPressed(int key){
        return keyMap.get(key);
    }
}
