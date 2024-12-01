package C1;

/*
Escribir un programa que permita calcular el IMC (índice masa corporal)
de una persona y luego mostrar por pantalla.
La fórmula para el cálculo del IMC es: peso/(altura*altura).
*/

public class Ejercicio1 {
    public static void main(String[] args) {

        int peso = 60;
        double altura = 1.60;

        // Calcular el IMC usando la fórmula peso / (altura * altura)
        double imc = peso / (altura * altura);

        // Mostrar el resultado del IMC por pantalla
        System.out.println("Su IMC es: " + imc);
    }
}
