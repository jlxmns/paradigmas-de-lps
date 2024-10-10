package Classes;

public class Matematica {

    public static int calcularFatorial(int x) {
        int fatorial = 1;
        for(int i = 1; i < x + 1; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

}
