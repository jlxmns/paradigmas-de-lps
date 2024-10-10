package numeros

type Calculadora struct {
	Num int
}

type Matematica struct {
}

func (calc Calculadora) SomarDois(a int, b int) int {
	return a + b
}

func (calc Calculadora) SomarTres(a int, b int, c int) int {
	return a + b + c
}

func (Matematica) CalcularFatorial(x int) int {
	fatorial := 1
	for i := 1; i < x+1; i++ {
		fatorial *= i
	}

	return fatorial
}
