package C1;/*
Escribir un programa que permita calcular el IMC (índice masa corporal),
pidiendo los datos por teclado
de una persona y luego mostrar por pantalla.
La fórmula para el cálculo del IMC es: peso/(altura*altura).
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduzca el peso: ");
        double peso = scanner.nextInt();

        System.out.println("introduzca la altura: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC usando la fórmula peso / (altura * altura)
        double imc = peso / (altura * altura);

        // Mostrar el resultado del IMC por pantalla
        System.out.println("opcion 1 Su IMC es: " + imc);

        // Redondear el IMC a dos decimales usando DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        String imcRedondeado = df.format(imc);

        System.out.println("opcion 2 Su IMC es: " + imcRedondeado);

        System.out.printf("opcion 3 Su IMC es: %s ", imcRedondeado);


    }
}