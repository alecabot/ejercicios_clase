package C4.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Perro miPerro = new Perro("Rocco", 3);
        Gato miGato = new Gato("Pelusa", 2);

        miPerro.comer();
        miPerro.ladrar();
        miPerro.emitirSonido();

        miGato.comer();
        miGato.maullar();
        miGato.emitirSonido();

    }
}
