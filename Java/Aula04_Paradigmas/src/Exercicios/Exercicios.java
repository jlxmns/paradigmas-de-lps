package Exercicios;
import Animais.*;

public class Exercicios {

    public static void exercicio1() {
        Cachorro cachorro = new Cachorro("Spark", "Corgi");
        Gato gato = new Gato("Zizú", "Sphinx");
        Morcego morcego = new Morcego("Bumba", "Frutifero");

        System.out.println("Nome: " + cachorro.getNome() + " Espécie: " + cachorro.getEspecie() + " Som: " + cachorro.emitirSom());
        System.out.println("Nome: " + gato.getNome() + " Espécie: " + gato.getEspecie() + " Som: " + gato.emitirSom());
        System.out.println("Nome: " + morcego.getNome() + " Espécie: " + morcego.getEspecie() + " Som: " + morcego.emitirSom());
        System.out.println(morcego.amamentar());
        System.out.println(morcego.voar());
    }

    public static void exercicio2() {

    }
}
