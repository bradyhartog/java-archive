import javax.swing.*;
import java.awt.*;

/**
 * Draws a simple house with Swing.
 */
public class HouseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(64,64,64));
        g2.fillPolygon(new int[] {120,360,600}, new int[] {305,65,305}, 3);
        Rectangle body = new Rectangle(143,305,434,350);
        g2.setColor(new Color(160,160,160));
        g2.fill(body);
        Rectangle door = new Rectangle(209,393,131,262);
        g2.setColor(new Color(192,192,192));
        g2.fill(door);
        Rectangle window = new Rectangle(380,419,131,131);
        g2.setColor(new Color(224,224,224));
        g2.fill(window);
    }
}
