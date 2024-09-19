package Classes;

public class Gato extends Animal {
    public Gato() {
        super("Gato");
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }
}
