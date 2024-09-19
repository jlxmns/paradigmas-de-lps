package Classes;

public class Cachorro extends Animal {
    public Cachorro() {
        super("Cachorro");
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }
}
