import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Gui1{
    public static void main(String[] args){
    JFrame frame=new JFrame();//create a frame
    frame.setTitle("Title");//set title
    frame.setResizable(false);//not resize your frame 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
    frame.setSize(420,420);//aet x,y dimension
    frame.setVisible(true);//make frame visible

    ImageIcon image=new ImageIcon("./image/logo.png");//create an imageicon
    frame.setIconImage(image.getImage());//change icon of frame
    // frame.getContentPane().setBackground(Color.green);//change background color
    frame.getContentPane().setBackground(new Color(0,0,0));//change background color rgb
    

    }
}