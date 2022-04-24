import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class GuiLabel {
    public static void main(String args[]) {
        // JLabel = a gui diaplay area for a string of text , an image or both;
        ImageIcon image=new ImageIcon("./image/ADIT.png");
        Border border= BorderFactory.createLineBorder(Color.green,3);


        JLabel label = new JLabel();
        label.setText("jyot khant");// settext label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//SET TEXT LEFT , CENTER , RIGHT OF IMAGEICON
        label.setVerticalTextPosition(JLabel.TOP);// SET TEXT TOP , CENTER , RIGHT OF IMAGEICON
        label.setForeground(Color.green);//set font color;
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font text
        label.setIconTextGap(-100);
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);//IF YOU TRUE THEN DISPLAY BACKGOUNDCOLOR
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//SET VERTICAL POSTION OF ICON+TEXT WTHIN LABEL
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0,0,266,66);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(420, 420);
        // frame.setLayout(null);//not display enything
        frame.setVisible(true);
        frame.add(label);frame.pack();
    }
}
