
import javax.swing.*;
import java.awt.event.*;

public class mListener1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Eg1");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hover or click the mouse");
        frame.add(label);

        // Add MouseListener to the frame
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered the frame");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse exited the frame");
            }
        });

        frame.setVisible(true);
    }
}
