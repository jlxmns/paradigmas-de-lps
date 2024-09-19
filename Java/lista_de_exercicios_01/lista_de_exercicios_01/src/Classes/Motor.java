package Classes;

public class Motor {
    int cavalos;
    String combustivel;


    public Motor(int cavalos, String combustivel) {
        this.cavalos = cavalos;
        this.combustivel = combustivel;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
