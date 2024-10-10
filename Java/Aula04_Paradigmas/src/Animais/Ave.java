package Animais;

public interface Ave {
    public default String voar() {
        return "";
    }
}
