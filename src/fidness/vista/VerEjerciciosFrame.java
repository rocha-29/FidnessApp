package fidness.vista;

import fidness.modelo.Ejercicio;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VerEjerciciosFrame extends JFrame {
    private JList<Ejercicio> listaEjercicios;
    private JTextArea areaDetalle;

    public VerEjerciciosFrame() {
        setTitle("Ver Ejercicios");
        setSize(500, 400);
        setLocationRelativeTo(null);

        List<Ejercicio> ejercicios = obtenerEjerciciosEjemplo();
        listaEjercicios = new JList<>(ejercicios.toArray(new Ejercicio[0]));
        areaDetalle = new JTextArea();
        areaDetalle.setEditable(false);

        listaEjercicios.addListSelectionListener(e -> {
            Ejercicio seleccionado = listaEjercicios.getSelectedValue();
            if (seleccionado != null) {
                areaDetalle.setText(seleccionado.mostrarDetalle());
            }
        });

        add(new JScrollPane(listaEjercicios), "West");
        add(new JScrollPane(areaDetalle), "Center");
    }

    private List<Ejercicio> obtenerEjerciciosEjemplo() {
        List<Ejercicio> lista = new ArrayList<>();
        lista.add(new Ejercicio("Sentadilla", "Pierna", "Bajar con la espalda recta", "https://ejemplo.com/sentadilla"));
        lista.add(new Ejercicio("Curl Bíceps", "Brazo", "Flexionar el codo", "https://ejemplo.com/curl"));
        return lista;
    }
}
