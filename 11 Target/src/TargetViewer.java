import javax.swing.*;

public class TargetViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(112, 112);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TargetComponent targetComponent = new TargetComponent();
        frame.add(targetComponent);
        frame.setVisible(true);
    }
}
