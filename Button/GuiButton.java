import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// public class GuiButton extends JFrame  implements ActionListener  {
//     JButton button;
//    GuiButton() {
//          button = new JButton();
//         button.setBounds(200,100,100,50);
//         button.addActionListener(this);

//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(null);
//         this.setSize(420,420);
//         this.setVisible(true);
//         this.add(button);

//     }
//     public void actionPerformed(ActionEvent e) {
//          if(e.getSource()==button){
//              System.out.println("hi");
//          }
//     }
// }

public class GuiButton extends JFrame {
    JButton button;
    JLabel label;
    
    GuiButton() {
        ImageIcon icon = new ImageIcon("./image/ADIT.png");
        ImageIcon icon2 = new ImageIcon("./image/logo.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setVisible(false);
        
        button = new JButton();
        button.setBounds(200, 100, 600, 950);
        button.addActionListener(e -> {
            System.out.println("hi");
            label.setVisible(true);
    });
        // button.setEnabled(false);
        button.setText("button");
        button.setFocusable(false);// this wthin box is cancelled
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setBorder(BorderFactory.createEtchedBorder());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(420, 420);
        this.setVisible(true);
        this.add(button);
        this.add(label);
        
    }
    
}
