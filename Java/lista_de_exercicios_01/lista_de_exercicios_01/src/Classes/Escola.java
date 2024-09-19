package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Escola {
    String nome;
    List<Professor> professores = new ArrayList<>();

    public Escola(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessores() {
        return this.professores.stream()
                .map(Professor::getNome)
                .collect(Collectors.joining(", "));
    }

    public void addProfessor(Professor professor) {
        if(!this.professores.contains(professor)) {
            this.professores.add(professor);
            professor.addEscola(this);
        }
    }
}
