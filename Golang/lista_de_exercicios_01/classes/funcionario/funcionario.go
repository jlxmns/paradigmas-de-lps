package funcionario

type Funcionario interface {
	CalcularSalario() float64
}

type Horista struct {
	HorasTrabalhadas float64
	ValorHora        float64
}

func (fh Horista) CalcularSalario() float64 {
	return fh.HorasTrabalhadas * fh.ValorHora
}

type Assalariado struct {
	SalarioMensal float64
}

func (fa Assalariado) CalcularSalario() float64 {
	return fa.SalarioMensal
}
