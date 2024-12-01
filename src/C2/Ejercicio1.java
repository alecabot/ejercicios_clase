package C2;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    Ejercicio Nº 1 - Estructuras Condicionale
    Crear un programa en Java que permita ingresar dos números enteros,
    determine y muestre por pantalla cuál de los dos es mayor o si son iguales.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingresa el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingresa el primer numero: ");
        num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("el numero " + num1 + " es mayor que el " + num2);
        }else if (num1 < num2){
            System.out.println("el numero " + num2 + " es mayor que el " + num1);
        }else {
            System.out.println("el numero " + num1 + " y " + num2 + " son iguales");
        }
    }


}
