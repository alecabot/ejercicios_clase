package C2;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    Ejercicio Nº 4 - Estructuras Repetitivas
    Crear un programa en Java que permita ingresar 8 números (valor entero).
    Utilizar la estructura repetitiva “while”. Luego debe mostrar la suma de los números ingresados.
    */

    public static void main(String[] args) {
        // Declaracion de variables
        Scanner scanner = new Scanner(System.in);
        int nota, total = 0, contador = 0;

        // Bucle hasta llegar a 8
        while (contador < 8) {
            // Pedir al usuario que ingrese una nota
            System.out.println("ingresa una nota:");

            // Leer la nota y actualizar el total y el contador
            nota = scanner.nextInt();
            total += nota;
            contador++;

            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        // Calcular y mostrar el promedio de las notas si se ingresaron notas
        System.out.println("el total de las notas es: " + total);

    }
}