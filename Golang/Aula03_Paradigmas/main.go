package main

import "fmt"

type Retangulo struct {
	comprimento, largura float64
}

func (r Retangulo) calcular_area() float64 {
	return r.comprimento * r.largura
}

func (r Retangulo) calcular_perimetro() float64 {
	return 2 * (r.comprimento + r.largura)
}

func main() {
	//exercicio1()
	//exercicio2()
	exercicio3()
}

func exercicio1() {
	// Faça um programa em Go que receba do usuario
	// um vetor com 10 posições. Em seguida devera ser
	// impresso o maior e o menor elemento do vetor.

	// O operador := pode ser usado dentro do escopo de funções e é equivalente a var [nome] [tipo] = [conteudo]
	// O Go infere o tipo da variável
	vetor := []int{5, 12, 7, 20, 15, 8, 3, 11, 6, 9}

	soma := 0
	maiorValor := vetor[0]
	menorValor := vetor[0]

	for _, valor := range vetor {
		soma += valor
		if valor > maiorValor {
			maiorValor = valor
		}
		if valor < menorValor {
			menorValor = valor
		}
	}

	media := float64(soma) / float64(len(vetor))

	// Exibe os resultados
	fmt.Printf("Média: %.2f\n", media)
	fmt.Printf("Maior valor: %d\n", maiorValor)
	fmt.Printf("Menor valor: %d\n", menorValor)
}

func exercicio2() {
	//Faça um programa em Go que receba 6 números inteiros e mostre:
	//Os números pares digitados
	//A soma dos números pares digitados
	//Os números ímpares digitados
	//A quantidade de números ímpares

	var numbers [6]int
	var somaPar int
	var qtdeImpar int
	var separador string

	fmt.Printf("Digite 6 números inteiros: ")
	for i := 0; i < 6; i++ {
		fmt.Scan(&numbers[i])
	}

	fmt.Printf("Números pares digitados: ")
	for i, num := range numbers {
		if i == len(numbers)-1 {
			separador = ""
		} else {
			separador = ", "
		}
		if num%2 == 0 {
			fmt.Printf("%d%s", num, separador)
			somaPar += num
		}
	}
	fmt.Printf("\nA soma dos números pares é: %d\n", somaPar)

	fmt.Printf("Números ímpares digitados: ")
	for i, num := range numbers {
		if i == len(numbers)-1 {
			separador = ""
		} else {
			separador = ", "
		}
		if num%2 != 0 {
			fmt.Printf("%d%s", num, separador)
			qtdeImpar++
		}
	}

	fmt.Printf("\nQuantidade de números ímpares digitados: %d", qtdeImpar)
}

func exercicio3() {
	ret := Retangulo{comprimento: 2, largura: 3}
	fmt.Printf("Area: %.2f\n", ret.calcular_area())
	fmt.Printf("Perímetro: %.2f\n", ret.calcular_perimetro())
}
