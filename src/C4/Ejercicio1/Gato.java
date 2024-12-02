package C4.Ejercicio1;

// Clase "Gato" que hereda de "Animal"
class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miauuuuuu");
    }

}

