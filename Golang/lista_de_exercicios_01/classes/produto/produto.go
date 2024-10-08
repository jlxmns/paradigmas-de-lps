package produto

import "math"

type Produto struct {
	Nome  string
	Preco float64
}

func (p Produto) SomarProduto(p2 Produto) float64 {
	return roundFloat(p.Preco+p2.Preco, 2)
}

func roundFloat(val float64, precision uint) float64 {
	ratio := math.Pow(10, float64(precision))
	return math.Round(val*ratio) / ratio
}
