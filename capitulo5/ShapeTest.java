package capitulo5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter 1 to draw Rectangles \n" +
                "Enter 2 to draw Ovals");

        int choice = Integer.parseInt(input);

        Shape panel = new Shape(choice);
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300);
        app.setVisible(true);
    }
}
