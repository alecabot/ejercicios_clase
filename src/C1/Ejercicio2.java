package C1;/*
Ejercicio Nº 2 - Operaciones de Lectura
Escribir un programa que pida al usuario que ingrese por teclado:
nombre, apellido y edad.
Luego mostrar por pantalla/consola en un SOLO mensaje, de la siguiente forma:

Su nombre y apellido es: XXXXX  XXXXX y tiene XX años.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese su apellido
        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que ingrese su altura
        System.out.println("Ingrese altura: ");
        double altura = scanner.nextDouble();

        // Mostrar el nombre, apellido y edad del usuario en un solo mensaje
        System.out.println("Su nombre y apellido es : " + nombre + " " + apellido + " y tienes " + edad + " años");
        System.out.printf("El nombre es %s %s, su edad es %d y su altura %.2f", nombre, apellido, edad, altura);
    }
}