from classes.animais import Cachorro, Gato, Animal
from classes.carro import Carro, Motor
from classes.contabancaria import ContaBancaria
from classes.educacao import Escola, Professor
from classes.empresarial import Empresa, Empregado
from classes.imprimiveis import Relatorio, Contrato
from classes.numeros import Calculadora


def exercicio01():
    # Classes e Objetos Básicos: Crie uma classe Carro com atributos como marca, modelo, e
    # ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.
    carro1 = Carro("Suzuki", "Celerio", "2024")
    carro2 = Carro("Suzuki", "Alto", "2023")
    carro3 = Carro("Suzuki", "Swift", "2022")

    print(carro1)
    print(carro2)
    print(carro3)


def exercicio02():
    # Métodos: Adicione um método acelerar e frear à classe Carro que altere um atributo
    # velocidade. Crie um método para exibir a velocidade atual.
    carro = Carro("Suzuki", "Celerio", "2024")
    carro.acelerar()
    carro.exibir_velocidade()
    carro.frear()
    carro.exibir_velocidade()


def exercicio03():
    # Encapsulamento: Implemente uma classe ContaBancaria com atributos saldo, titular e
    # métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo.
    conta = ContaBancaria(500, "Júlio")
    conta.depositar(100)
    conta.sacar(800)
    conta.sacar(300)


def exercicio04():
    # Herança Crie uma classe base Animal com métodos como som. Derive classes como
    # Cachorro e Gato que implementam o método som de maneiras diferentes.

    cachorro = Cachorro()
    gato = Gato()

    print(cachorro.emitir_som())
    print(cachorro.comer())
    print(gato.emitir_som())
    print(gato.comer())


def exercicio05():
    # Polimorfismo: Utilize polimorfismo para criar uma função que receba uma lista de
    # objetos Animal e chame o método som de cada um, demonstrando comportamento
    # diferente para cada subclasse.

    animal = Animal("animal")
    cachorro = Cachorro()
    gato = Gato()

    lista_animal = [animal, cachorro, gato]

    for animal in lista_animal:
        print(f"O {animal.especie} faz {animal.emitir_som()}")


def exercicio06():
    # Composição: Implemente uma classe Motor e associe-a a uma classe Carro. A classe
    # Carro deve ter um objeto do tipo Motor como um de seus atributos.
    carro = Carro("Suzuki", "Vitara", "2024", 140, "Híbrido")

    print("cavalos:", carro.motor.cavalos, "combustível:", carro.motor.combustivel)


def exercicio07():
    # Associação: Crie uma classe Escola e uma classe Professor. A associação deve permitir
    # que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.
    prof1 = Professor("Isabela")
    prof2 = Professor("Ricardo")
    prof3 = Professor("Leonardo")
    escola1 = Escola("Pirâmide")
    escola2 = Escola("Milênio")
    escola3 = Escola("Pacífico")
    prof1.add_escola(escola1)
    prof1.add_escola(escola3)
    escola3.add_professor(prof3)
    print(prof1)
    print(escola3)


def exercicio08():
    # Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado.
    # Cada empregado deve ter atributos como nome, cargo, e salario.
    empregados = [
        Empregado("Júlio", "CEO", "30000.00"),
        Empregado("Eduardo", "Head of HR", "10000.00"),
        Empregado("Theodoro", "Assistant", "3000.00")
    ]
    empresa = Empresa("JLX Corp.", "83199813918389", empregados)
    print(empresa)


def exercicio09():
    # Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que
    # tenha um método imprimir. Implemente essa interface em classes como Relatório e
    # Contrato. Em Python, use a abordagem de protocolo ou classes abstratas.
    relatorio = Relatorio("relatorio", "texto")
    contrato = Contrato("contrato", "partes", "termos")
    relatorio.imprimir()
    contrato.imprimir()


def exercicio10():
    # Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go)
    # Implemente uma classe Calculadora com métodos somar que aceita diferentes números
    # de parâmetros (dois ou três números). Em Golang, use funções com nomes diferentes
    # para diferentes quantidades de parâmetros.
    calc = Calculadora()
    print(calc.somar_dois(3, 5))
    print(calc.somar_tres(3, 5, 18))
