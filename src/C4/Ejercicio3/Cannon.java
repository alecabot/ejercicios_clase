package C4.Ejercicio3;

import java.time.LocalDate;
import java.util.Date;

public class Cannon extends Impresora{

    public Cannon(String modelo, String tipoConexion, LocalDate fechaFabricacion, int hojasDisponible, int porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponible, porcentajeTinta);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo en impresora Cannon");
    }
}
