import javax.swing.*;
import java.awt.*;

/**
 * Draws an 8 x 8 checkerboard with Swing.
 */
public class CheckerComponent extends JComponent {
    int row = 0;

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle((90 * j), (90 * i), 90,90);
                if (row == 0) {
                    if (j % 2 == 0) {
                        g2.setColor(Color.BLACK);
                        g2.fill(rectangle);
                    } else {
                        g2.setColor(Color.WHITE);
                        g2.fill(rectangle);
                    }
                } else {
                    if (j % 2 == 0) {
                        g2.setColor(Color.WHITE);
                        g2.fill(rectangle);
                    } else {
                        g2.setColor(Color.BLACK);
                        g2.fill(rectangle);
                    }
                }
            }
            if (i % 2 == 0) {
                row = 1;
            } else {
                row = 0;
            }
        }
    }
}