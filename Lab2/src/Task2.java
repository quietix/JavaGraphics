import Figure.GuitarFigure;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task2 extends JPanel {
    private static int maxWidth;
    private static int maxHeight;

    public void paint(Graphics g) {
        GuitarFigure guitar = new GuitarFigure(g, maxWidth, maxHeight);
        guitar.paintSelf();
    }

    public static void setupFrame() {
        JFrame frame = new JFrame("Lab2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Task2());
        frame.setVisible(true);

        frame.setVisible(true);
        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right;
        maxHeight = size.height - insets.top - insets.bottom;
    }

    public static void main(String[] args) {
        setupFrame();
    }
}