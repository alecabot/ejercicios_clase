package C4.Ejercicio1;

//ejemplo clase animal en código

public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void emitirSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

}


