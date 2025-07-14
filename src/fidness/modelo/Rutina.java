package fidness.modelo;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private String nombreRutina;
    private List<Ejercicio> ejercicios;

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(String nombreEjercicio) {
        ejercicios.removeIf(e -> e.getNombre().equalsIgnoreCase(nombreEjercicio));
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public String exportar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rutina: ").append(nombreRutina).append("\n");
        for (Ejercicio e : ejercicios) {
            sb.append("- ").append(e.mostrarDetalle()).append("\n\n");
        }
        return sb.toString();
    }
}
