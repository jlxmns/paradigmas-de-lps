package Animais;

public class Morcego extends Animal implements Mamifero, Ave {

    public Morcego(String nome, String especie) {
        this.setNome(nome);
        this.setEspecie(especie);
    }

    public String emitirSom() {
        return "Scree";
    }

    @Override
    public String voar() {
        return this.getNome() + " está voando.";
    }

    @Override
    public String amamentar() {
        return this.getNome() + " está amamentado.";
    }
}
