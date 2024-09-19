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
