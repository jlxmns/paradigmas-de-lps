package animal

import "fmt"

type Barulho interface {
	EmitirBarulho()
}

type animal struct {
	especie string
	som     string
}

func (a animal) Comer() {
	fmt.Printf("Estou comendo!\n")
}

func (a animal) EmitirSom() {
	fmt.Printf("%s\n", a.som)
}

type cachorro struct {
	animal
}

func NewCachorro() cachorro {
	c := cachorro{
		animal{
			especie: "Cachorro",
			som:     "Au au!",
		},
	}
	return c
}

func (c cachorro) EmitirBarulho() {
	fmt.Printf("O cachorro faz au au!\n")
}

type gato struct {
	animal
}

func NewGato() gato {
	g := gato{
		animal{
			especie: "Gato",
			som:     "Miau!",
		},
	}
	return g
}

func (g gato) EmitirBarulho() {
	fmt.Printf("O gato faz miau!\n")
}
