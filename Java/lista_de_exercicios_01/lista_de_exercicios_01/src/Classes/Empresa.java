package Classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String nome;
    String cnpj;
    List<Empregado> empregados = new ArrayList<Empregado>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }

    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }
}
