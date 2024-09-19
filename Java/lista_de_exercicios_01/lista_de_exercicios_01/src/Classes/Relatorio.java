package Classes;

public class Relatorio implements Imprimivel {
    String nome;
    String autor;
    String conteudo;

    public Relatorio(String nome, String autor, String conteudo) {
        this.nome = nome;
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        System.out.println("Essa função tem assinatura na interface, mas usada em relatório.");
    }
}
