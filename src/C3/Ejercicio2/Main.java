package C3.Ejercicio2;

public class Main {

    /*
    Ejercicio N.º 2 - POO
    Crear una clase Impresora, que tenga los siguientes atributos: modelo, tipo de conexión, fecha de fabricación y hojas disponibles (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

    a)     En el metodo main: Crear un vector de tipo Impresora de tres posiciones. Crear tres impresoras y guardarlas en él.
    b)     En el metodo main: Recorrer el vector creado y mostrar por pantalla el modelo y tipo de conexión de cada impresora almacenada.
     */

    public static void main(String[] args) {

        Impresora impresora1 = new Impresora("Modelo1", "USB", "2023-01-01", 100);
        Impresora impresora2 = new Impresora("Modelo2", "WiFi", "2022-05-15", 200);
        Impresora impresora3 = new Impresora("Modelo3", "Ethernet", "2021-11-30", 150);

        Impresora[] impresoras = {impresora1, impresora2, impresora3};

        //con for
        for (int j = 0; j < impresoras.length; j++) {
            System.out.println("Impresora " + (j + 1) + ": modelo=" + impresoras[j].getModelo() + ", tipo de conexion=" +
                    impresoras[j].getTipoConexion() + ", fecha de fabricacion=" +
                    impresoras[j].getFechaFabricacion() + ", hojas disponibles=" +
                    impresoras[j].getHojasDisponible() + "\n");

        }

        // con foreach
//        int i = 1;
//        for (Impresora impresora : impresoras) {
//            System.out.println("Impresora " + i + ": modelo=" + impresora.getModelo() + ", tipo de conexion=" +
//                    impresora.getTipoConexion() + ", fecha de fabricacion=" +
//                    impresora.getFechaFabricacion() + ", hojas disponibles=" +
//                    impresora.getHojasDisponible() + "\n");
//            i++;
//        }



    }
}
