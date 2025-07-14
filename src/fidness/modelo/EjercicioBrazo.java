package fidness.modelo;

public class EjercicioBrazo extends Ejercicio {
    public EjercicioBrazo(String nombre, String descripcion, String url) {
        super(nombre, "Brazo", descripcion, url);
    }

    @Override
    public String mostrarDetalle() {
        return "[Ejercicio de Brazo]\n" + super.mostrarDetalle();
    }
}
