package Classes;

public class Carro {
    String marca;
    String modelo;
    String ano;
    int velocidade = 50;
    Motor motor;

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = null;
    }

    public Carro(String marca, String modelo, String ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void get_info() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\n");
    }

    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println("O carro acelerou.");
    }

    public void frear() {
        setVelocidade(getVelocidade() - 10);
        System.out.println("O carro freou.");
    }

    public void exibirVelocidade() {
        System.out.println("O carro está indo a " + getVelocidade() + " km/h.");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
