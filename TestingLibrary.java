// Tester Program for JaGame Library

import jagame.Display;
import jagame.JaGame;
import jagame.Rect;
import jagame.Surface;
import jagame.Draw;
import java.awt.Color;

public class TestingLibrary {
    public static void main(String[] args) {
        // Display screenOne = new Display("Screen One", 600, 600);
        // Display screenTwo = new Display("Screen Two", 600, 600);

        // Surface firstPanel = new Surface(screenOne, Color.BLUE, 0, 0, 300, 300);
        // Surface secondPanel = new Surface(screenOne, Color.RED, 300, 0, 300, 300);
        // Surface thirdPanel = new Surface(screenOne, Color.GREEN, 0, 300, 300, 300);
        // Surface fourthPanel = new Surface(screenOne, Color.YELLOW, 300, 300, 300, 300);
        
        // Draw drawer = new Draw();
        // drawer.addText(secondPanel, "testing text", null, 100, 40, 10, 30);

        JaGame window = new JaGame();
        window.init("Testing Window", 600, 600);
        window.addShape(new Rect(Color.BLUE, 100, 100, 100, 50));
    }
}
