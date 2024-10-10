package main

import "Aula05_Paradigmas/classes/empresarial"

func main() {
	p := empresarial.NewPessoa("João")
	endereco := empresarial.NewEndereco("Belardo de Monaco", 165, "Fortaleza", "38383838")
	p.AdicionarEndereco(&endereco)
	p.MostrarEndereco()
}
