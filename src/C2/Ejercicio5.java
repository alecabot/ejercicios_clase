package C2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    /*
    Ejercicio N.º 7 - Arreglos: Vectores
    Realizar lo mismo que en el ejercicio 4, pero utilizando un vector para guardar los números ingresados.
    Una vez almacenados los números,
    deberá recorrer el vector, realizar la suma y luego mostrar por pantalla.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("inserte el valor del numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            total += numeros[i];

        }

        // Mostrar el total y el promedio
        System.out.println("La suma total de los numeros es: "  + Arrays.toString(numeros) + " es: "  + total);

        // con ArrayList

//        int total = 0;
//        ArrayList<Integer> numeros = new ArrayList<>();
//
//        for (int i = 0; i < 8; i++) {
//            System.out.println("inserte el valor del numero " + (i + 1) + ": ");
//            numeros.add(scanner.nextInt());
//            total += numeros.get(i);
//        }
//
//
//        // Mostrar el total y el promedio
//        System.out.println("La suma total de los numeros es: " + numeros + " es: " + total);

    }

}
