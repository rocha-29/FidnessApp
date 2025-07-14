package fidness.modelo;

public class Ejercicio {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String url;

    public Ejercicio(String nombre, String tipo, String descripcion, String url) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrl() {
        return url;
    }

    public String mostrarDetalle() {
        return nombre + "\nTipo: " + tipo + "\nDescripción: " + descripcion + "\nURL: " + url;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}
