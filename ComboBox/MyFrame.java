import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animal={"dog", "cat", "bird"};

        comboBox = new JComboBox(animal);
        comboBox.addActionListener(this);

        comboBox.setEditable(true);
        comboBox.addItem("house");
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        // comboBox.removeAllItem();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
         }
    }
}
