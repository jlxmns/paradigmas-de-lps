package Animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, String especie) {
        this.setNome(nome);
        this.setEspecie(especie);
    }

    public String emitirSom() {
        return "Au Au";
    }
}
