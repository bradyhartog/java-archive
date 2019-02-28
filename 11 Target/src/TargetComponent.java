import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class TargetComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double outerCircle = new Ellipse2D.Double(31,20,50,50);
        g2.fill(outerCircle);
        Ellipse2D.Double firstInnerCircle = new Ellipse2D.Double(40, 29, 32,32);
        g2.setColor(Color.WHITE);
        g2.fill(firstInnerCircle);
        Ellipse2D.Double secondInnerCircle = new Ellipse2D.Double(49, 38, 14,14);
        g2.setColor(Color.BLACK);
        g2.fill(secondInnerCircle);
    }
}