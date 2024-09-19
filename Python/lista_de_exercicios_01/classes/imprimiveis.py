from abc import ABC, abstractmethod


class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass


class Relatorio(Imprimivel):
    def __init__(self, nome, texto):
        self.nome = nome
        self.texto = texto

    def imprimir(self):
        print("Imprimindo relatório")


class Contrato(Imprimivel):
    def __init__(self, nome, partes, termos):
        self.nome = nome
        self.partes = partes
        self.termos = termos

    def imprimir(self):
        print("Imprimindo contrato")
