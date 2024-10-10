package contaBancaria

import "fmt"

type SaldoInsuficienteException struct {
	err string
}

func (e *SaldoInsuficienteException) Error() string {
	return fmt.Sprintf("%s", e.err)
}

type contaBancaria struct {
	valor   float64
	titular string
}

func New(valor float64, titular string) contaBancaria {
	cb := contaBancaria{valor: valor, titular: titular}
	return cb
}

func (cb contaBancaria) Depositar(valor float64) {
	cb.valor += valor
	fmt.Printf("R$ %.2f depositado com sucesso.\n", valor)
}

func (cb contaBancaria) Sacar(valor float64) {
	if cb.valor-valor < 0 {
		fmt.Printf("Erro na operação.\n")
	} else {
		cb.valor -= valor
		fmt.Printf("R$ %.2f sacado com sucesso.\n", valor)
	}
}

func (cb contaBancaria) SacarComException(valor float64) (string, error) {
	if cb.valor-valor < 0 {
		return "", &SaldoInsuficienteException{err: "Saldo Insuficiente."}
	} else {
		cb.valor -= valor
		return fmt.Sprintf("R$ %.2f sacado com sucesso.\n", valor), nil
	}
}
