package Classes;

public class Contrato implements Imprimivel {
    String nome;
    String partes;
    String objeto;
    String condicoes;

    public Contrato(String nome, String partes, String objeto, String condicoes) {
        this.nome = nome;
        this.partes = partes;
        this.objeto = objeto;
        this.condicoes = condicoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartes() {
        return partes;
    }

    public void setPartes(String partes) {
        this.partes = partes;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
    }

    public void imprimir() {
        System.out.println("Essa função tem assinatura na interface, mas usada em contrato.");
    }
}
