class Animal:
    def __init__(self, especie):
        self.especie = especie

    def emitir_som(self):
        return "Um som"

    def comer(self):
        return "Estou comendo!"


class Cachorro(Animal):
    def __init__(self):
        super().__init__(especie="Cachorro")

    def emitir_som(self):
        return "Au au"


class Gato(Animal):
    def __init__(self):
        super().__init__(especie="Gato")

    def emitir_som(self):
        return "Miau"
