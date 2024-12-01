package C1;/*
Ejercicio Nº 3 - Operaciones de Lectura, Variables y Operadores
Escribir un programa que pida al usuario que ingrese por teclado: 5 números enteros.
Luego mostrar por pantalla/consola lo siguiente:
La suma total de los números ingresados y el promedio de estos.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int num1, num2, num3, num4, num5;

        int total;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los numeros
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();

        System.out.println("Ingrese el cuarto numero: ");
        num4 = scanner.nextInt();

        System.out.println("Ingrese el quinto numero: ");
        num5 = scanner.nextInt();

        total = num1 + num2 + num3 + num4 + num5;

        double promedio = (double) total / 5;

        // Mostrar el total y el promedio
        System.out.println("La suma total de los numeros es: " + total + " y su promedio es: " + promedio);
    }
}