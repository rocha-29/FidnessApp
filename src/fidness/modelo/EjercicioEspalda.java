package fidness.modelo;

public class EjercicioEspalda extends Ejercicio {
    public EjercicioEspalda(String nombre, String descripcion, String url) {
        super(nombre, "Espalda", descripcion, url);
    }

    @Override
    public String mostrarDetalle() {
        return "[Ejercicio de Espalda]\n" + super.mostrarDetalle();
    }
}
