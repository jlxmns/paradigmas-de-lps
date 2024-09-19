package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Professor {
    String nome;
    List<Escola> escolas = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscolas() {
        return this.escolas.stream()
                .map(Escola::getNome)
                .collect(Collectors.joining(", "));
    }

    public void addEscola(Escola escola) {
        if(!this.escolas.contains(escola)) {
            this.escolas.add(escola);
            escola.addProfessor(this);
        }
    }
}
