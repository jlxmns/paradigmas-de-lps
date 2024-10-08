package Classes;

public class Produto {
    String nome;
    float preco;


    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float somarProdutos(Produto a) {
        return Math.round((getPreco() + a.getPreco()) * 100.0f) / 100.0f;
    }
}
