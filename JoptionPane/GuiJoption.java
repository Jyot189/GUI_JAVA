import javax.swing.*;

public class GuiJoption {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null,"PLAIN is
        // ","title",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"INFO is
        // ","title",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"question is
        // ","title",JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"warning is
        // ","title",JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null,"error is
        // ","title",JOptionPane.ERROR_MESSAGE);

        // int ANSWER= JOptionPane.showConfirmDialog(null, "jyot
        // khant","title",JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(ANSWER);

        // String name = JOptionPane.showInputDialog("what is your name?");
        // System.out.println(name);

        String[] response = { "no", "thank", "blash" };

        ImageIcon icon = new ImageIcon("./image/ADIT.png");

        JOptionPane.showOptionDialog(null, "code", "secret", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, response, 0);
    }

}