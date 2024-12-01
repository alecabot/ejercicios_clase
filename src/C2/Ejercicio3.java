package C2;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    Ejercicio Nº 3 - Estructuras Repetitivas
    Crear un programa en Java que permita ingresar una serie de notas de un alumno (valor entero).
    Utiliza una estructura repetitiva para continuar pidiendo notas hasta que el usuario decida finalizar.
    Luego, muestra el promedio de las notas ingresadas.
     */

    public static void main(String[] args) {
        // Declaracion de variables
        Scanner scanner = new Scanner(System.in);
        int nota, total = 0, contador = 0;
        String salir;

        // Bucle infinito para seguir pidiendo notas hasta que el usuario decida salir
        while (true) {
            // Pedir al usuario que ingrese una nota o 'N' para salir
            System.out.println("ingresa una nota (o escribe 'S' para salir): ");
            // Verificar si la entrada es un número entero
            if (scanner.hasNextInt()) {
                // Leer la nota y actualizar el total y el contador
                nota = scanner.nextInt();
                total += nota;
                contador++;
            } else {
                // Leer la entrada del usuario como una cadena
                salir = scanner.next();
                // Verificar si el usuario desea salir
                if (salir.equalsIgnoreCase("S")) {
                    break;
                } else {
                    // Mostrar un mensaje de error si la entrada no es válida
                    System.out.println("Entrada no válida. Por favor, ingresa una nota o 'N' para salir.");
                }
            }
            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        // Calcular y mostrar el promedio de las notas si se ingresaron notas
        if (contador > 0) {
            int promedio = total / contador;
            System.out.println("el promedio de las notas es: " + promedio);
        } else {
            // Mostrar un mensaje si no se ingresaron notas
            System.out.println("No se ingresaron notas.");
        }
    }
}