package Animais;

public class Gato extends Animal {

    public Gato(String nome, String especie) {
        this.setNome(nome);
        this.setEspecie(especie);
    }

    public String emitirSom() {
        return "Miau";
    }
}
