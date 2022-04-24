import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class newWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("jyot khant");

    newWindow() {

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
