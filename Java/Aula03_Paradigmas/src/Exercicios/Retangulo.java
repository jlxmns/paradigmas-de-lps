package Exercicios;

public class Retangulo {
    private float comprimento, largura;

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getArea() {
        return comprimento * largura;
    }

    public float getPerimetro() {
        return 2 * (comprimento + largura);
    }
}
