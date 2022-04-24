import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements MouseListener{

    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0, 0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setLayout(null);   
        this.setVisible(true);

    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseclicked");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
        label.setBackground(Color.blue);
        
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
        label.setBackground(Color.green);
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
        label.setBackground(Color.orange);
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
        label.setBackground(Color.yellow);
    }
}