package C4.Ejercicio2;

public class Socio {
    private int numeroSocio;
    private String nombre;
    private double cuotaMensual;
    private String actividad;

    public Socio(int numeroSocio, String nombre, double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public double costoMensual(){
        return this.cuotaMensual;
    }
}
