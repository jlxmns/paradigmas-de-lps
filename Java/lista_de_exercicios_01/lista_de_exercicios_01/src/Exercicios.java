import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {
    public static void exercicio01 () {
        /* Classes e Objetos Básicos: Crie uma classe Carro com atributos como marca, modelo, e
        ano. Instancie três objetos dessa classe e exiba os detalhes de cada um. */
        Carro carro1 = new Carro("Suzuki", "Celerio", "2024");
        Carro carro2 = new Carro("Suzuki", "Alto", "2023");
        Carro carro3 = new Carro("Suzuki", "Swift", "2022");

        carro1.get_info();
        carro2.get_info();
        carro3.get_info();
    }

    public static void exercicio02 () {
        /* Métodos: Adicione um método acelerar e frear à classe Carro que altere um atributo
        velocidade. Crie um método para exibir a velocidade atual. */
        Carro carro = new Carro("Suzuki", "Celerio", "2024");
        carro.acelerar();
        carro.exibirVelocidade();
        carro.frear();
        carro.exibirVelocidade();
    }

    public static void exercicio03() {
        /* # Encapsulamento: Implemente uma classe ContaBancaria com atributos saldo, titular e
        métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo. */
        ContaBancaria conta = new ContaBancaria(500, "Júlio");
        conta.depositar(100);
        conta.sacar(800);
        conta.sacar(300);
    }

    public static void exercicio04() {
        /* Herança Crie uma classe base Animal com métodos como som. Derive classes como
        Cachorro e Gato que implementam o método som de maneiras diferentes. */
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comer());
        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());
    }

    public static void exercicio05() {
        /* Polimorfismo: Utilize polimorfismo para criar uma função que receba uma lista de
        objetos Animal e chame o método som de cada um, demonstrando comportamento
        diferente para cada subclasse. */

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        for(Animal animal : animais ) {
            System.out.println(animal.getEspecie() + " faz " + animal.emitirSom());
        }
    }

    public static void exercicio06() {
        /* Composição: Implemente uma classe Motor e associe-a a uma classe Carro. A classe
        Carro deve ter um objeto do tipo Motor como um de seus atributos. */
        Motor motor = new Motor(140, "Híbrido");
        Carro carro = new Carro("Suzuki", "Vitara", "2024", motor);

        System.out.printf("O carro %s %s tem um motor %s de %d cavalos.", carro.getMarca(), carro.getModelo(),
                carro.getMotor().getCombustivel(), carro.getMotor().getCavalos());
    }

    public static void exercicio07() {
        /* Associação: Crie uma classe Escola e uma classe Professor. A associação deve permitir
        que uma escola tenha vários professores, e um professor possa lecionar em várias escolas. */
        Professor prof1 = new Professor("Isabela");
        Professor prof2 = new Professor("Ricardo");
        Professor prof3 = new Professor("Leonardo");
        Escola escola1 = new Escola("Pirâmide");
        Escola escola2 = new Escola("Milênio");
        Escola escola3 = new Escola("Pacífico");
        prof1.addEscola(escola1);
        prof1.addEscola(escola3);
        escola3.addProfessor(prof3);
        System.out.println("Nome do Professor: " + prof1.getNome() + "\nEscolas: " + prof1.getEscolas());
        System.out.println("Nome da Escola: " + escola3.getNome() + "\nCorpo Docente: " + escola3.getProfessores());
    }

    public static void exercicio08() {
        /* Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado.
        Cada empregado deve ter atributos como nome, cargo, e salario. */
        Empresa empresa = new Empresa("JLX Corp.", "83199813918389");
        Empregado empregado1 = new Empregado("Júlio", "CEO", "30000.00");
        Empregado empregado2 = new Empregado("Eduardo", "Head of HR", "10000.00");
        Empregado empregado3 = new Empregado("Theodoro", "Assistant", "3000.00");
        empresa.addEmpregado(empregado1);
        empresa.addEmpregado(empregado2);
        empresa.addEmpregado(empregado3);
        System.out.println("Nome da Empresa: " + empresa.getNome() + "\nCNPJ: " + empresa.getCnpj());
        System.out.println("---------- Empregados ---------");
        for(Empregado empregado : empresa.getEmpregados()) {
            System.out.println(empregado.getNome() + "\n" + empregado.getCargo() + "\n" + empregado.getSalario() );
        }
    }

    public static void exercicio09() {
        /* Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que
        tenha um método imprimir. Implemente essa interface em classes como Relatório e
        Contrato. Em Python, use a abordagem de protocolo ou classes abstratas. */
        Contrato c = new Contrato("contrato", "josé", "isso e aquilo", "pagar tudo no prazo");
        Relatorio r = new Relatorio("relatorio", "maria", "relatório sobre a vida");
        c.imprimir();
        r.imprimir();
    }

    public static void exercicio10() {
        /* Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go)
        Implemente uma classe Calculadora com métodos somar que aceita diferentes números
        de parâmetros (dois ou três números). Em Golang, use funções com nomes diferentes
        para diferentes quantidades de parâmetros. */
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(3, 5));
        System.out.println(calc.somar(3, 5, 10));
    }

    public static void exercicio11() {
        /* Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato
        calcularSalario. Derive classes como FuncionarioHorista e FuncionarioAssalariado que
        implementam calcularSalario de formas distintas */
        FuncionarioAssalariado assalariado = new FuncionarioAssalariado("João", 3000);
        FuncionarioHorista horista = new FuncionarioHorista("Maria", 50, 50);
        System.out.println(assalariado.getNome() + ": " + assalariado.calcularSalario());
        System.out.println(horista.getNome() + ": " + horista.calcularSalario());
    }

    public static void exercicio12() {
        /* Sobrecarga de Operadores (Python) / Métodos de Conveniência (Java, Go) Em Python,
        sobrecarregue o operador + para somar dois objetos Produto baseados no preço. Em Java
        e Golang, crie métodos que permitam essa funcionalidade. */
        Produto macarrao = new Produto("Macarrão", 5.87f);
        Produto molhoDeTomate = new Produto("Molho de Tomate", 4.32f);

        System.out.println(macarrao.somarProdutos(molhoDeTomate));
    }

    public static void exercicio13() {
        /* Métodos Estáticos Adicione um método estático à classe Matematica que calcula o
        fatorial de um número. Em Python, utilize @staticmethod, em Java static, e em Golang crie
        uma função regular na struct. */
        System.out.println(Matematica.calcularFatorial(10));
    }

    public static void exercicio14() {
        /* Singleton Implemente o padrão de projeto Singleton para garantir que apenas uma
        instância de uma classe Configuracao seja criada. */
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode x: " + x.hashCode());
        System.out.println("Hashcode y: " + y.hashCode());
        System.out.println("Hashcode z: " + z.hashCode());
    }

    public static void exercicio15() throws SaldoInsuficienteException {
        /* Exceções/Erros Personalizados Crie uma classe de exceção personalizada
        SaldoInsuficienteException em Java e Python, ou error em Golang, que seja lançada
        quando houver uma tentativa de saque superior ao saldo disponível na classe
        ContaBancaria. */
        ContaBancaria conta = new ContaBancaria(500, "Júlio");
        conta.depositar(100);
        conta.sacarComException(800);
    }
}
