/**
 * Paints a Swing letter "L", with parameters for x and y position.
 */

import javax.swing.*;
        import java.awt.*;

public class LetterL extends JComponent {
    private int xPos;
    private int yPos;

    public LetterL(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle stroke = new Rectangle(xPos, yPos,155,250);
        g2.setColor(new Color(52, 52, 52));
        g2.fill(stroke);
        Rectangle mask1 = new Rectangle((xPos + 48),yPos,107,206);
        g2.setColor(Color.WHITE);
        g2.fill(mask1);
    }
}