package C4.Ejercicio3;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    /*

    Ejercicio Nº 2 - Herencia y Polimorfismo
    Crear una clase llamada Impresora con los atributos: modelo, tipo de conexión, fecha de fabricación, hojas disponibles y porcentaje tinta
    (con sus métodos y constructores correspondientes). También agregar el método:
    “Imprimir” para mostrar un mensaje en pantalla que diga "Imprimiendo en
    impresora genérica".

    a) Crear los siguientes métodos (en cada subclase correspondiente):

    ●       Impresora Cannon: Sobrescribir el
    método “Imprimir” para mostrar un mensaje en pantalla que diga "Imprimiendo
    en impresora Cannon".

    ●       Impresora Epson: Sobrescribir el
    método “Imprimir” para mostrar un mensaje en pantalla que diga " Imprimiendo
    en impresora Epson".

    b) Una vez creadas las clases, crear en el Main un vector de tipo Impresora y almacenar 3 impresoras cannon y 2 impresoras epson (crear un objeto con parámetros para cada uno de ellos).

    c) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.


     */
    public static void main(String[] args) {

        Impresora[] impresoras = new Impresora[5];

        impresoras[0] = new Cannon("CannonModel1", "USB", LocalDate.of(2022, 1, 1), 100, 80);
        impresoras[1] = new Cannon("CannonModel2", "WiFi", LocalDate.of(2022, 2, 1), 150, 70);
        impresoras[2] = new Cannon("CannonModel3", "Ethernet", LocalDate.of(2022, 3, 1), 200, 60);
        impresoras[3] = new Epson("EpsonModel1", "USB", LocalDate.of(2022, 4, 1), 120, 90);
        impresoras[4] = new Epson("EpsonModel2", "WiFi", LocalDate.of(2022, 5, 1), 130, 85);

        for (Impresora impresora : impresoras) {
            impresora.imprimir();
        }


        

    }

}
