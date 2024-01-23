import javax.swing.*;

public class Main {
    static JFrame frame = new JFrame("LOGIN");
    public static void main(String[] args) {

        frame.setContentPane(new forma_uno().panel_principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);

    }
}