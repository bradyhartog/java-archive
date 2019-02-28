/**
 * Paints a Swing letter "O", with parameters for x and y position.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class LetterO extends JComponent {
    private int xPos;
    private int yPos;

    public LetterO(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle stroke1 = new Rectangle(xPos, (yPos + 78),155,96);
        g2.setColor(new Color(52, 52, 52));
        g2.fill(stroke1);
        Ellipse2D.Double stroke2 = new Ellipse2D.Double(xPos,yPos,155,155);
        g2.fill(stroke2);
        Ellipse2D.Double stroke3 = new Ellipse2D.Double(xPos,(yPos + 97),155,155);
        g2.fill(stroke3);
        Rectangle mask1 = new Rectangle((xPos + 48),(yPos + 74),59,96);
        g2.setColor(Color.WHITE);
        g2.fill(mask1);
        Ellipse2D.Double mask2 = new Ellipse2D.Double((xPos + 48),(yPos + 44.5),59,59);
        g2.fill(mask2);
        Ellipse2D.Double mask3 = new Ellipse2D.Double((xPos + 48),(yPos + 144.5),59,59);
        g2.fill(mask3);
    }
}