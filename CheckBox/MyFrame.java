import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    JButton button ;
    JCheckBox checkBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("sunmit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("i'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,22));

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==button){
             System.out.println(checkBox.isSelected()) ;
         }
    }
}