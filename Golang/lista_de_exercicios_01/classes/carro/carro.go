package carro

import "fmt"

type Motor struct {
	Cavalos     int
	Combustivel string
}

type carro struct {
	marca      string
	modelo     string
	ano        string
	velocidade int
	Motor      *Motor
}

func New(marca string, modelo string, ano string) carro {
	c := carro{marca: marca, modelo: modelo, ano: ano, velocidade: 50, Motor: nil}
	return c
}

func NewCarroComMotor(marca string, modelo string, ano string, motor *Motor) carro {
	c := carro{marca: marca, modelo: modelo, ano: ano, velocidade: 50, Motor: motor}
	return c
}

func (c carro) GetInfo() {
	fmt.Printf("\nMarca: %s\nModelo: %s\nAno: %s\n", c.marca, c.modelo, c.ano)
	if c.Motor != nil {
		fmt.Printf("Motor: %s\nCavalos: %d", c.Motor.Combustivel, c.Motor.Cavalos)
	}
}

func (c carro) Acelerar() {
	c.velocidade += 10
	fmt.Printf("O carro acelerou.\n")
}

func (c carro) Frear() {
	c.velocidade -= 10
	fmt.Printf("O carro freou.\n")
}

func (c carro) ExibirVelocidade() {
	fmt.Printf("O carro está indo a %d km/h.\n", c.velocidade)
}
