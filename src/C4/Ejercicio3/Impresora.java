package C4.Ejercicio3;

import java.time.LocalDate;
import java.util.Date;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private LocalDate fechaFabricacion;
    private int hojasDisponible;
    private int porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, LocalDate fechaFabricacion, int hojasDisponible, int porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponible = hojasDisponible;
        this.porcentajeTinta = porcentajeTinta;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void imprimir(){
        System.out.println("Imprimiendo en impresora generica");
    }

}
