import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Add a button to the frame
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // Display the frame
        frame.setVisible(true);
    }
}
