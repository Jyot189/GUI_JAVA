import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBar(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.blue);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int  count=0;

        while(count<=100){
            bar.setValue(count);
            try {
            Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            count+=10;
        }
        bar.setString("jyot");
    }
}
