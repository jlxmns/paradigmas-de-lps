class Calculadora:
    def somar_dois(self, num1: int, num2: int):
        return num1 + num2

    def somar_tres(self, num1: int, num2: int, num3: int):
        return num1 + num2 + num3


class Matematica:
    @staticmethod
    def calcular_fatorial(x):
        fatorial = 1
        for i in range(1, x+1):
            fatorial *= i

        return fatorial
