
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Gui2 extends JFrame{
   public Gui2(){
        setTitle("Title");//set title
        setResizable(false);//not resize your frame 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        setSize(420,420);//aet x,y dimension
        setVisible(true);//make frame visible

    ImageIcon image=new ImageIcon("./image/logo.png");//create an imageicon
    setIconImage(image.getImage());//change icon of frame
    // .getContentPane().setBackground(Color.green);//change background color
    getContentPane().setBackground(new Color(0,0,0));//change background color rgb
    }

    public static void main(String[] args){
        Gui2 jk=new Gui2();
        // jk.setTitle("hjuy");
    }
}


