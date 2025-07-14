package fidness.vista;

import javax.swing.*;

public class MenuPrincipalFrame extends JFrame {
    public MenuPrincipalFrame() {
        setTitle("Fidness - Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnEjercicios = new JButton("Ver Ejercicios");
        JButton btnRutinas = new JButton("Crear Rutina");
        JButton btnSalir = new JButton("Cerrar Sesión");

        JPanel panel = new JPanel();
        panel.add(btnEjercicios);
        panel.add(btnRutinas);
        panel.add(btnSalir);
        add(panel);

        btnEjercicios.addActionListener(e -> new VerEjerciciosFrame().setVisible(true));
        btnRutinas.addActionListener(e -> new CrearRutinaFrame().setVisible(true));
        btnSalir.addActionListener(e -> System.exit(0));
    }
}
