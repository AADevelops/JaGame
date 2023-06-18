/* Key class
 * @description: Allows programmers to monitor keyboard status and activity.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class Key implements KeyListener {
    private HashMap<Integer, Boolean> keyMap;

    public Key() {
        this.keyMap = new HashMap<Integer, Boolean>();
        K_.init(this);
    }

    /* METHODS */

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        this.keyMap.replace(key, true);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        this.keyMap.replace(key, false);
    }

    public void keyTyped(KeyEvent e) {}

    public boolean isPressed(int key) {
        if (this.keyMap.get(key) == null) {
            return false;
        } else {
            return this.keyMap.get(key);
        }
    }

    /* GETTERS */

    public HashMap<Integer, Boolean> getKeyMap() {
        return this.keyMap;
    }
}
