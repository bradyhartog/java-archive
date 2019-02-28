import javax.swing.*;

/**
 * Views the house drawn by HouseComponent class.
 */
public class HouseViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(720,720);
        frame.setTitle("House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HouseComponent houseComponent = new HouseComponent();
        frame.add(houseComponent);
        frame.setVisible(true);
    }
}
