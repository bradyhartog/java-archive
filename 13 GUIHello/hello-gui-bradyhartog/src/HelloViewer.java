/**
 * Constructs the word "HELLO" from the accompanying Letter classes.
 */

import javax.swing.*;
import java.awt.*;

public class HelloViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1200,600);
        frame.setTitle("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);

        LetterH letterH = new LetterH(100,100);
        frame.add(letterH);
        frame.setVisible(true);
        LetterE letterE = new LetterE(271,100);
        frame.add(letterE);
        frame.setVisible(true);
        LetterL letterL1 = new LetterL(442,100);
        frame.add(letterL1);
        frame.setVisible(true);
        LetterL letterL2 = new LetterL(613,100);
        frame.add(letterL2);
        frame.setVisible(true);
        LetterO letterO = new LetterO(784,100);
        frame.add(letterO);
        frame.setVisible(true);
    }
}