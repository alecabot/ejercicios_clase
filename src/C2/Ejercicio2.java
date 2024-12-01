package C2;

import java.util.Scanner;

public class Ejercicio2 {

    /*
    Ejercicio Nº 2 - Estructuras Condicionales
    Crear un programa en Java que permita ingresar un valor numérico correspondiente al código de un tipo de comprobante
    y devuelva la denominación correspondiente,
    de acuerdo con la siguiente tabla (utilizar una estructura condicional múltiple):
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero del comprobante: ");
        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("FACTURAS A");
                break;
            case 3:
                System.out.println("NOTAS DE DEBITO A");
                break;
            case 4:
                System.out.println("RECIBOS A");
                break;
            case 5:
                System.out.println("NOTAS DE VENTA AL CONTADO A");
                break;
            case 6:
                System.out.println("FACTURAS B");
                break;
            case 7:
                System.out.println("NOTAS DE DEBITO B");
                break;
            case 8:
                System.out.println("NOTAS DE CREDITO B");
                break;
            case 9:
                System.out.println("RECIBOS B");
                break;
            case 10:
                System.out.println("NOTAS DE VENTA AL CONTADO B");
                break;
            default:
                System.out.println("OtroIndefinido");
                break;
        }


    }


}
