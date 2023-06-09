// Tester Program for JaGame Library

import jagame.Display;

public class TestingLibrary {
    public static void main(String[] args) {
        Display screenOne = new Display();
        Display screenTwo = new Display();
        screenOne.init("Test Application", 600, 600);
        screenTwo.init("Jethro's App", 600, 600);
    }
}
