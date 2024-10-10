package Classes;

public class Singleton {
    private static Singleton instancia_unica = null;

    public String s;

    private Singleton() {
        s = "Sou uma String parte da Classe Singleton";
    }

    public static synchronized Singleton getInstance() {
        if (instancia_unica == null)
            instancia_unica = new Singleton();

        return instancia_unica;
    }
}
