import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.addKeyListener(this);
        this.setVisible(true);

    }

    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-1,label.getY());
            break;

            case 'w':label.setLocation(label.getX(),label.getY()-1);
            break;

            case 's':label.setLocation(label.getX(),label.getY()+1);
            break;


            case 'd':label.setLocation(label.getX()+1,label.getY());
            break;

        }

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:label.setLocation(label.getX()-1,label.getY());
            break;

            case 38:label.setLocation(label.getX(),label.getY()-1);
            break;

            case 39:label.setLocation(label.getX(),label.getY()+1);
            break;

            case 40:label.setLocation(label.getX()+1,label.getY());
            break;

        }
// key press up,down left,right
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("released:"+e.getKeyChar());
        System.out.println("released:"+e.getKeyCode());
    }
}
