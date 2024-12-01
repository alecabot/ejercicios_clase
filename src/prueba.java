import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        boolean condicion = true;
//
//        if (!condicion) {
//            System.out.println("papa");
//        }
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("seleccione una opcion: ");
//            int opcion = scanner.nextInt();
//            scanner.nextLine();
//
//
//            switch (opcion) {
//                case 1, 2:
//                    System.out.println("has seleccionado la opcion " + opcion);
//                    break;
//                default:
//                    System.out.println("no ha seleccionado ninguna o es incorrecta");
//                    break;
//            }
//
//            System.out.println("deseas seleccionar otra opcion S/N");
//            String salir = scanner.nextLine();
//            if (!salir.equalsIgnoreCase("S")) {
//                break;
//            }
//        }


//        int total = 0;
//        int[] numeros = new int[5];
//
//        for (int i = 0; i < numeros.length; i++) {
//
//            System.out.println("inserte el valor del numero " + (i + 1) + ": ");
//            numeros[i] = scanner.nextInt();
//            total += numeros[i];
//
//        }
//
//        double promedio = (double) total / numeros.length;
//
//        // Mostrar el total y el promedio
//        System.out.println("La suma total de los numeros es: " + total + " y su promedio es: " + promedio);
        int total = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.println("inserte el valor del numero " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
            total += numeros.get(i);
        }


        // Mostrar el total y el promedio
        System.out.println("La suma total de los numeros es: " + numeros + " es: " + total);
    }
}
