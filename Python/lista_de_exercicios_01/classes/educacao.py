class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def __str__(self):
        return f"Nome da Escola: {self.nome}\nCorpo Docente: {', '.join(professor.nome for professor in self.professores)}"

    def add_professor(self, professor):
        self.professores.append(professor)
        if self not in professor.escolas:
            professor.add_escola(self)


class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def __str__(self):
        return f"Nome do Professor: {self.nome}\nLeciona nas Escolas: {', '.join(escola.nome for escola in self.escolas)}"

    def add_escola(self, escola):
        self.escolas.append(escola)
        if self not in escola.professores:
            escola.add_professor(self)
