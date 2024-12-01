package C3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Alejandro", 50.4);
        System.out.println("Cliente{" +
                "numeroCliente=" + cliente1.getNumeroCliente() +
                ", nombre='" + cliente1.getNombre() + '\'' +
                ", deuda=" + cliente1.getDeuda() +
                '}');

        Cliente cliente2 = new Cliente(2, "Paco", 32.3);
        System.out.println("Cliente{" +
                "numeroCliente=" + cliente2.getNumeroCliente() +
                ", nombre='" + cliente2.getNombre() + '\'' +
                ", deuda=" + cliente2.getDeuda() +
                '}');

        Cliente cliente3 = new Cliente(3, "Antonio", 62.3);
        System.out.println("Cliente{" +
                "numeroCliente=" + cliente3.getNumeroCliente() +
                ", nombre='" + cliente3.getNombre() + '\'' +
                ", deuda=" + cliente3.getDeuda() +
                '}');

        Cliente cliente4 = new Cliente();
        cliente4.setNumeroCliente(4);
        cliente4.setNombre("Manuel");
        cliente4.setDeuda(29.5);
        System.out.println("Cliente{" +
                "numeroCliente=" + cliente4.getNumeroCliente() +
                ", nombre='" + cliente4.getNombre() + '\'' +
                ", deuda=" + cliente4.getDeuda() +
                '}');
    }
}