import java.util.Arrays;
import jagame.Mouse;

public class MouseTesting {
    public static void main(String[] args) {
        while (true) {
            try {
                Mouse ms = new Mouse();
                System.out.println(Arrays.toString(ms.getPos()));
                Thread.sleep(25);
            } catch (Exception e) {
                System.out.println(e);
            };
        }
    }
}
