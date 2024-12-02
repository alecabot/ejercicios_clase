package C4.Ejercicio2;

public class SocioHabilitado extends Socio{

    private int costoPileta;
    private boolean estaHabilitado;

    public SocioHabilitado(int numeroSocio, String nombre, int cuotaMensual, String actividad, int costoPileta, boolean estaHabilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    @Override
    public int costoMensual() {
        return this.costoPileta;
    }
}
