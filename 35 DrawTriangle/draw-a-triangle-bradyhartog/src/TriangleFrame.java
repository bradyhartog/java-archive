import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TriangleFrame extends JFrame {
    private TriangleComponent component;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    public TriangleFrame() {
        component = new TriangleComponent();

        class MouseClickedListener implements MouseListener {
            private int clicks = 0;
            public static final int MAX_CLICKS = 3;

            @Override
            public void mouseClicked(MouseEvent e) {
                if (clicks > MAX_CLICKS) {
                    component.clear();
                    clicks = 0;
                }

                int xpos = e.getX();
                int ypos = e.getY();

                if (clicks == 0) {
                    component.setFirstPoint(xpos, ypos);
                } else if (clicks == 1) {
                    component.setSecondPoint(xpos, ypos);
                } else if (clicks == 2) {
                    component.setThirdPoint(xpos, ypos);
                }
                repaint();
                clicks++;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Not used
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Not used
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Not used
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Not used
            }
        }

        MouseClickedListener listener = new MouseClickedListener();
        component.addMouseListener(listener);

        setSize(WIDTH, HEIGHT);
        setTitle("DrawTriangle");
        add(component);
    }
}