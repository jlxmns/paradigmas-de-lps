package imprimiveis

import "fmt"

type Imprimivel interface {
	Imprimir()
}

type Contrato struct {
	Nome   string
	Partes string
	Termos string
}

type Relatorio struct {
	Nome  string
	Texto string
}

func NewContrato(nome string, partes string, termos string) Contrato {
	c := Contrato{Nome: nome, Partes: partes, Termos: termos}
	return c
}

func NewRelatorio(nome string, texto string) Relatorio {
	r := Relatorio{Nome: nome, Texto: texto}
	return r
}

func (c Contrato) Imprimir() {
	fmt.Println("Função de imprimir da interface Imprimível em Contrato")
}

func (r Relatorio) Imprimir() {
	fmt.Println("Função de imprimir da interface Imprimível em Relatório")
}
