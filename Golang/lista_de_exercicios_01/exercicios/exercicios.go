package exercicios

import (
	"fmt"
	"lista_de_exercicios_01/classes/animal"
	"lista_de_exercicios_01/classes/carro"
	"lista_de_exercicios_01/classes/contaBancaria"
	"lista_de_exercicios_01/classes/educacao"
	"lista_de_exercicios_01/classes/empresarial"
	"lista_de_exercicios_01/classes/imprimiveis"
	"lista_de_exercicios_01/classes/numeros"
)

func Exercicio1() {
	/* Classes e Objetos Básicos: Crie uma classe Carro com atributos como marca, modelo, e
	   ano. Instancie três objetos dessa classe e exiba os detalhes de cada um. */
	carro1 := carro.New("Suzuki", "Celerio", "2024")
	carro2 := carro.New("Suzuki", "Alto", "2023")
	carro3 := carro.New("Suzuki", "Swift", "2022")

	carro1.GetInfo()
	carro2.GetInfo()
	carro3.GetInfo()
}

func Exercicio2() {
	/* Métodos: Adicione um método acelerar e frear à classe Carro que altere um atributo
	   velocidade. Crie um método para exibir a velocidade atual. */
	carro := carro.New("Suzuki", "Celerio", "2024")
	carro.Acelerar()
	carro.ExibirVelocidade()
	carro.Frear()
	carro.ExibirVelocidade()
}

func Exercicio3() {
	/* # Encapsulamento: Implemente uma classe ContaBancaria com atributos saldo, titular e
	   métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo. */
	conta := contaBancaria.New(500, "Júlio")
	conta.Depositar(100)
	conta.Sacar(800)
	conta.Sacar(300)
}

func Exercicio4() {
	/* Herança Crie uma classe base Animal com métodos como som. Derive classes como
	   Cachorro e Gato que implementam o método som de maneiras diferentes. */
	cachorro := animal.NewCachorro()
	cachorro.Comer()
	cachorro.EmitirSom()
	gato := animal.NewGato()
	gato.Comer()
	gato.EmitirSom()
}

func Exercicio5() {
	/* Polimorfismo: Utilize polimorfismo para criar uma função que receba uma lista de
	   objetos Animal e chame o método som de cada um, demonstrando comportamento
	   diferente para cada subclasse. */
	var cachorro animal.Barulho = animal.NewCachorro()
	var gato animal.Barulho = animal.NewGato()

	animais := []animal.Barulho{cachorro, gato}

	for _, a := range animais {
		a.EmitirBarulho()
	}
}

func Exercicio6() {
	/* Composição: Implemente uma classe Motor e associe-a a uma classe Carro. A classe
	   Carro deve ter um objeto do tipo Motor como um de seus atributos. */
	motor := &carro.Motor{Cavalos: 140, Combustivel: "Híbrido"}
	carro := carro.NewCarroComMotor("Suzuki", "Swift", "2022", motor)
	carro.GetInfo()
}

func Exercicio7() {
	/* Associação: Crie uma classe Escola e uma classe Professor. A associação deve permitir
	   que uma escola tenha vários professores, e um professor possa lecionar em várias escolas. */
	prof1 := educacao.NewProfessor("Isabela")
	prof2 := educacao.NewProfessor("Ricardo")
	prof3 := educacao.NewProfessor("Leonardo")
	escola1 := educacao.NewEscola("Pirâmide")
	escola2 := educacao.NewEscola("Milênio")
	escola3 := educacao.NewEscola("Pacífico")
	prof1.AddEscola(escola1)
	prof1.AddEscola(escola3)
	prof2.AddEscola(escola2)
	escola3.AddProfessor(prof3)
	fmt.Printf("Nome do Professor: %s\nEscolas: %s\n", prof1.Nome, prof1.GetEscolas())
	fmt.Printf("Nome da Escola: %s\nCorpo Docente: %s\n", escola3.Nome, escola3.GetProfessores())
}

func Exercicio8() {
	/* Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado.
	   Cada empregado deve ter atributos como nome, cargo, e salario. */
	empregado1 := empresarial.NewEmpregado("Júlio", "CEO", "30000.00")
	empregado2 := empresarial.NewEmpregado("Eduardo", "Head of HR", "20000.00")
	empregado3 := empresarial.NewEmpregado("Theodoro", "Assistant", "3000.00")
	empregados := []*empresarial.Empregado{empregado1, empregado2, empregado3}
	empresa := empresarial.Empresa{"JLX Corp.", "83199813918389", empregados}
	fmt.Printf("Nome da Empresa: %s\nCNPJ:%s\n----------Empregados----------\n", empresa.Nome, empresa.Cnpj)
	for _, empregado := range empresa.Empregados {
		fmt.Printf("Nome: %s\nCargo: %s\nSalário: %s\n", empregado.Nome, empregado.Cargo, empregado.Salario)
	}
}

func Exercicio9() {
	/* Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que
	   tenha um método imprimir. Implemente essa interface em classes como Relatório e
	   Contrato. Em Python, use a abordagem de protocolo ou classes abstratas. */
	contrato := imprimiveis.NewContrato("contrato", "partes", "termos")
	relatorio := imprimiveis.NewRelatorio("relatorio", "texto")
	contrato.Imprimir()
	relatorio.Imprimir()
}

func Exercicio10() {
	/* Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go)
	   Implemente uma classe Calculadora com métodos somar que aceita diferentes números
	   de parâmetros (dois ou três números). Em Golang, use funções com nomes diferentes
	   para diferentes quantidades de parâmetros. */
	calculadora := numeros.Calculadora{Num: 1}
	fmt.Println(calculadora.SomarDois(1, 5))
	fmt.Println(calculadora.SomarTres(1, 5, 30))
}
