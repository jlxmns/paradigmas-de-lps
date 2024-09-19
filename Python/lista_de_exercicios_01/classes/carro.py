class Carro:
    def __init__(self, marca, modelo, ano, cavalos=None, combustivel=None):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 50

        if cavalos and combustivel:
            self.motor = Motor(cavalos, combustivel)

    def __str__(self):
        return f"Marca: {self.marca}\nModelo: {self.modelo}\nAno: {self.ano}\n"

    def acelerar(self):
        self.velocidade += 10
        print("O carro acelerou.")

    def frear(self):
        self.velocidade -= 10
        print("O carro freou.")

    def exibir_velocidade(self):
        print(f"O carro está indo a {self.velocidade} km/h.")


class Motor:
    def __init__(self, cavalos, combustivel):
        self.cavalos = cavalos
        self.combustivel = combustivel
