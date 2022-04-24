import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame implements ActionListener {

    JMenuItem loadItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("edit");
        JMenu helpMenu = new JMenu("help");

        loadItem = new JMenuItem("load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);//Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);//Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);//Alt + h for exit
        loadItem.setMnemonic(KeyEvent.VK_L);//l for load
        saveItem.setMnemonic(KeyEvent.VK_S);//s for load
        exitItem.setMnemonic(KeyEvent.VK_E);//e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("load");
        }
        if(e.getSource()==saveItem){
            System.out.println("save");
        }
        if(e.getSource()==exitItem){
            System.out.println("exit");
        }
    }
}
