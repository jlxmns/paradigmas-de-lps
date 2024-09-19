package empresarial

type Empregado struct {
	Nome    string
	Cargo   string
	Salario string
}

type Empresa struct {
	Nome       string
	Cnpj       string
	Empregados []*Empregado
}

func NewEmpregado(nome string, cargo string, salario string) *Empregado {
	return &Empregado{Nome: nome, Cargo: cargo, Salario: salario}
}

func NewEmpresa(nome string, cnpj string, empregados []*Empregado) Empresa {
	return Empresa{Nome: nome, Cnpj: cnpj, Empregados: empregados}
}
