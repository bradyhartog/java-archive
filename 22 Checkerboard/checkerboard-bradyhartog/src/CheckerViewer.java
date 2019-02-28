import javax.swing.*;

/**
 * Views the checkerboard drawn by the CheckerComponent class.
 */
public class CheckerViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(720,720);
        frame.setTitle("Checkerboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CheckerComponent checkerComponent = new CheckerComponent();
        frame.add(checkerComponent);
        frame.setVisible(true);
    }
}