import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class forma_uno {
    JPanel panel_principal;
    private JLabel titulo;
    private JTextField ingreso_correo;
    private JPasswordField ingreso_password;
    private JLabel texto_usuario;
    private JButton INICIARSESIONButton;
    private JLabel error_texto;


    public forma_uno() {
        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String  usuario= "admin" ;
                String clave = "password";
                String usuario_ingresado=ingreso_correo.getText();
                String password_ingresado=ingreso_password.getText();

                if (usuario_ingresado.equals(usuario) && password_ingresado.equals(clave)){
                    JFrame ventana_uno = new JFrame();
                    ventana_uno.setContentPane(new ventana_uno().panel_ventana);
                    ventana_uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ventana_uno.setVisible(true);
                    ventana_uno.setSize(600,400);
                    Main.frame.dispose();

                }else{
                    error_texto.setText("Usuario o contaseña erronesos");

                }


            }
        });
    }
}
