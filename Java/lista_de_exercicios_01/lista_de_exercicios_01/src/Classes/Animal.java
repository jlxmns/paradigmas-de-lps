package Classes;

public abstract class Animal {
    String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String emitirSom() {
        return " ";
    }

    public String comer() {
        return "Estou comendo!";
    }
}

