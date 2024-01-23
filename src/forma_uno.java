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


    public forma_uno() {
        INICIARSESIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String  usuario= "admin" ;
                String clave = "password";
                String usuario_ingresado=ingreso_correo.getText();
                String password_ingresado=ingreso_password.getText();

                if (usuario.equals(usuario_ingresado)&& password_ingresado.equals(password_ingresado)){
                    System.out.println("Hola");

                }else{
                    System.out.println("Error");
                }

            }
        });
    }
}
