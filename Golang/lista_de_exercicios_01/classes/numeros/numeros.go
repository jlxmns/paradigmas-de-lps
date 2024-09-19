package numeros

type Calculadora struct {
	Num int
}

func (calc Calculadora) SomarDois(a int, b int) int {
	return a + b
}

func (calc Calculadora) SomarTres(a int, b int, c int) int {
	return a + b + c
}
