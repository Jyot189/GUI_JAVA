import javax.swing.*;
import java.awt.*;

public class GuiLayeredpane {
    public static void main(String args[]){

        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);
    
        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.GREEN);
        label3.setBounds(150,150,200,200);


        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0,0,500,500);

        layeredpane.add(label1,Integer.valueOf(0));
        layeredpane.add(label2,Integer.valueOf(2));
        layeredpane.add(label3,Integer.valueOf(1));

        // layeredpane.add(label1,JLayeredPane.DEFAULT_LAYER);
        // layeredpane.add(label2,JLayeredPane.DEFAULT_LAYER);
        // layeredpane.add(label3,JLayeredPane.DRAG_LAYER);

        JFrame frame = new JFrame("JLayeredpane");
        frame.add(layeredpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
