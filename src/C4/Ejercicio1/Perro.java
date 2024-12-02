package C4.Ejercicio1;

// Clase "Perro" que hereda de "Animal"
class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guauu Guauu");
    }


    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
}
