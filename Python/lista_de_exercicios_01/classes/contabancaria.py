class ContaBancaria:
    def __init__(self, saldo, titular):
        self.__saldo = saldo
        self.titular = titular

    def depositar(self, valor):
        self.__saldo += valor
        print(f"R$ {valor} depositado com sucesso.")

    def sacar(self, valor):
        if (self.__saldo - valor) <= 0:
            print("Erro na operação.")
        else:
            self.__saldo -= valor
            print(f"R$ {valor} sacado com sucesso.")
