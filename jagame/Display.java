/* Display class
 * @description: Main window for applications.
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import javax.swing.JFrame;

public class Display {
    private JFrame window;

    public Display(String title, int width, int height) {
        this.window = new JFrame(title);
        this.window.setSize(width, height);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);
    }

    /* METHODS */

    public void quit() {
        this.window = null;
    }

    public void update() {
        this.window.repaint();
    }

    /* GETTERS */

    public JFrame getFrame() {
        return this.window;
    }
}
