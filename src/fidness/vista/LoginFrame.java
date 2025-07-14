package fidness.vista;

import fidness.modelo.Usuario;
import fidness.modelo.CredencialesInvalidasException;
import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private JButton botonLogin;

    private Usuario usuarioRegistrado = new Usuario("cliente1", "1234");

    public LoginFrame() {
        setTitle("Fidness - Iniciar sesión");
        setSize(300, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        campoUsuario = new JTextField();
        campoContrasena = new JPasswordField();
        botonLogin = new JButton("Ingresar");

        add(new JLabel("Usuario:"));
        add(campoUsuario);
        add(new JLabel("Contraseña:"));
        add(campoContrasena);
        add(new JLabel());  // Espacio vacío
        add(botonLogin);

        botonLogin.addActionListener(e -> {
            try {
                String user = campoUsuario.getText();
                String pass = new String(campoContrasena.getPassword());

                if (!usuarioRegistrado.validarLogin(user, pass)) {
                    throw new CredencialesInvalidasException("Credenciales incorrectas");
                }

                JOptionPane.showMessageDialog(null, "Bienvenido a Fidness");
                dispose();
                new MenuPrincipalFrame().setVisible(true);

            } catch (CredencialesInvalidasException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        });
    }
}
