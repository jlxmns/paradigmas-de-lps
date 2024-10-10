package Animais;

public interface Mamifero {
    public default String amamentar() {
        return "";
    }
}
