package C4.Ejercicio2;

public class Socio {
    private int numeroSocio;
    private String nombre;
    private int cuotaMensual;
    private String actividad;

    public Socio(int numeroSocio, String nombre, int cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public int costoMensual(){
        return this.cuotaMensual;
    }
}
