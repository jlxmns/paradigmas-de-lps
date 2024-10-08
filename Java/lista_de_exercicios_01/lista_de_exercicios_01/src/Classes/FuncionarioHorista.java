package Classes;

public class FuncionarioHorista extends Funcionario{
    String nome;
    float valor_hora;
    int horas_trabalhadas;

    public FuncionarioHorista(String nome, float valor_hora, int horas_trabalhadas) {
        this.nome = nome;
        this.valor_hora = valor_hora;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public float calcularSalario() {
        return getValor_hora() * getHoras_trabalhadas();
    }

    public String getNome() {
        return nome;
    }

    public float getValor_hora() {
        return valor_hora;
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }
}
