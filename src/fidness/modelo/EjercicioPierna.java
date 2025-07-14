package fidness.modelo;

public class EjercicioPierna extends Ejercicio {
    public EjercicioPierna(String nombre, String descripcion, String url) {
        super(nombre, "Pierna", descripcion, url);
    }

    @Override
    public String mostrarDetalle() {
        return "[Ejercicio de Pierna]\n" + super.mostrarDetalle();
    }
}
