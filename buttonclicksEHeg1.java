
import javax.swing.*;
import java.awt.event.*;

public class buttonclicksEHeg1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);
        frame.setVisible(true);
    }
}
