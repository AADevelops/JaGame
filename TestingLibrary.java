// Tester Program for JaGame Library

import jagame.JaGame;
import jagame.Draw;
import jagame.Key;
import jagame.Mouse;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class TestingLibrary {
    public static void main(String[] args) {
        final int SCREEN_X = 600;
        final int SCREEN_Y = 600;
        final int RECT_WIDTH = 50;
        final int RECT_HEIGHT = 50;

        // Main Window Set Up
        JaGame window = new JaGame("Chicken Butt", SCREEN_X, SCREEN_Y);
        window.setBackground(Color.BLACK);

        // Keyboard Set Up
        Key key = window.getKey();

        // Mouse Set Up
        Mouse mouse = window.getMouse();
        int mouseX;
        int mouseY;

        // Rectangle Set Up
        int rectX = (SCREEN_X / 2) - 25;
        int rectY = 100;
        Color color;

        // Main Game Loop
        while (true) {
            mouseX = mouse.getPos()[0];
            mouseY = mouse.getPos()[1];

            // Drawing Text
            Draw.text(window.getSurface(), Color.RED, SCREEN_X / 2 - 75, 60, "Samir", null);

            // Circle Color Based on Mouse Status (Click & Drag vs. Click vs. No Click)
            if (mouse.getDragging()) {
                color = Color.GREEN;
            } else if (mouse.getPressed()[1]) {
                color = Color.BLUE;
            } else {
                color = Color.RED;
            }

            // Mouse in Window Check
            if (mouse.getInWindow()) {
                Draw.image(window.getSurface(), (SCREEN_X / 2) - 150, (SCREEN_Y / 2) - 225, 300, 400, "crossyroaddinosaur.png");
            }

            // Drawing Circle
            Draw.circle(window.getSurface(), color, mouseX - 10, mouseY - 10, 20);

            // WASD Movement
            if (key.isPressed(KeyEvent.VK_W)) {
                rectY -= 10;
            }
            if (key.isPressed(KeyEvent.VK_S)) {
                rectY += 10;
            }
            if (key.isPressed(KeyEvent.VK_D)) {
                rectX += 10;
            }
            if (key.isPressed(KeyEvent.VK_A)) {
                rectX -= 10;
            }

            // Window Collisions
            if (rectX <= 0) {
                rectX = SCREEN_X - RECT_WIDTH - 1;
            }
            if (rectX >= SCREEN_X - RECT_WIDTH) {
                rectX = 0;
            }
            if (rectY <= 0) {
                rectY = SCREEN_Y - RECT_HEIGHT - 1;
            }
            if (rectY >= SCREEN_Y - RECT_HEIGHT) {
                rectY = 0;
            }

            // Drawing Rectangle
            Draw.rect(window.getSurface(), Color.PINK, rectX, rectY, RECT_WIDTH, RECT_HEIGHT);

            // Window Update
            window.update(10);
        }
    }
}
