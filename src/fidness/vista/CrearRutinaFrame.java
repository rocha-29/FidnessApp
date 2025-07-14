package fidness.vista;

import fidness.modelo.Ejercicio;
import fidness.modelo.Rutina;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class CrearRutinaFrame extends JFrame {
    private List<Ejercicio> ejerciciosDisponibles = new ArrayList<>();
    private Rutina rutina;

    public CrearRutinaFrame() {
        setTitle("Crear Rutina");
        setSize(500, 400);
        setLocationRelativeTo(null);

        ejerciciosDisponibles.add(new Ejercicio("Sentadilla", "Pierna", "Bajar recto", "URL"));
        ejerciciosDisponibles.add(new Ejercicio("Curl Bíceps", "Brazo", "Flexionar", "URL"));

        JComboBox<Ejercicio> combo = new JComboBox<>(ejerciciosDisponibles.toArray(new Ejercicio[0]));
        JTextField nombreRutina = new JTextField(15);
        JTextArea areaRutina = new JTextArea();
        JButton btnAgregar = new JButton("Agregar");
        JButton btnExportar = new JButton("Exportar");

        rutina = new Rutina("Nueva Rutina");

        JPanel panelTop = new JPanel();
        panelTop.add(new JLabel("Nombre de rutina:"));
        panelTop.add(nombreRutina);
        panelTop.add(combo);
        panelTop.add(btnAgregar);
        panelTop.add(btnExportar);

        areaRutina.setEditable(false);

        add(panelTop, "North");
        add(new JScrollPane(areaRutina), "Center");

        btnAgregar.addActionListener((ActionEvent e) -> {
            Ejercicio seleccionado = (Ejercicio) combo.getSelectedItem();
            if (seleccionado != null) {
                rutina.agregarEjercicio(seleccionado);
                areaRutina.setText(rutina.exportar());
            }
        });

        btnExportar.addActionListener(e -> {
            new Thread(() -> {
                try {
                    SwingUtilities.invokeLater(() ->
                        JOptionPane.showMessageDialog(null, "Exportando rutina... por favor espera.")
                    );

                    Thread.sleep(2000); // Simula tiempo de exportación

                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Guardar rutina");

                    int userSelection = fileChooser.showSaveDialog(this);
                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        java.io.File archivo = fileChooser.getSelectedFile();
                        java.io.FileWriter writer = new java.io.FileWriter(archivo);
                        writer.write(rutina.exportar());
                        writer.close();

                        SwingUtilities.invokeLater(() ->
                            JOptionPane.showMessageDialog(null, "¡Rutina exportada exitosamente!\nArchivo: " + archivo.getAbsolutePath())
                        );
                    }

                } catch (Exception ex) {
                    SwingUtilities.invokeLater(() ->
                        JOptionPane.showMessageDialog(null, "Error al exportar rutina:\n" + ex.getMessage())
                    );
                }
            }).start();
        });
    }
}
