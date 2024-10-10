package empresarial

import "fmt"

type Pessoa struct {
	nome     string
	endereco *Endereco
}

type Endereco struct {
	rua    string
	numero int
	cidade string
	cep    string
}

func NewPessoa(nome string) Pessoa {
	return Pessoa{nome: nome, endereco: nil}
}

func NewEndereco(rua string, numero int, cidade string, cep string) Endereco {
	return Endereco{rua: rua, numero: numero, cidade: cidade, cep: cep}
}

func (p *Pessoa) AdicionarEndereco(endereco *Endereco) {
	p.endereco = endereco
}

func (p Pessoa) MostrarEndereco() {
	fmt.Printf("%s, %d, %s, %s\n", p.endereco.rua, p.endereco.numero, p.endereco.cidade, p.endereco.cep)
}
