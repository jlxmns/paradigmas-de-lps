package Classes;

public class FuncionarioAssalariado extends Funcionario {
    String nome;
    float salario;

    public FuncionarioAssalariado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public float calcularSalario() {
        return getSalario();
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
