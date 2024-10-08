from abc import ABC, abstractmethod

class Empresa:
    def __init__(self, nome, cnpj, empregados):
        self.nome = nome
        self.cnpj = cnpj
        self.empregados = empregados

    def __str__(self):
        empregados_str = "\n".join(str(empregado) for empregado in self.empregados)
        return f"Nome: {self.nome}\nCNPJ: {self.cnpj}\n=============Empregados=============\n{empregados_str}"


class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def __str__(self):
        return f"Empregado: {self.nome}\nCargo: {self.cargo}\nSalário: {self.salario}"


class Funcionario(ABC):

    @abstractmethod
    def calcular_salario(self):
        pass


class FuncionarioHorista(Funcionario):
    def __init__(self, nome, valor_hora, horas_trabalhadas):
        self.nome = nome
        self.valor_hora = valor_hora
        self.horas_trabalhadas = horas_trabalhadas

    def calcular_salario(self):
        return self.valor_hora * self.horas_trabalhadas


class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    def calcular_salario(self):
        return self.salario
