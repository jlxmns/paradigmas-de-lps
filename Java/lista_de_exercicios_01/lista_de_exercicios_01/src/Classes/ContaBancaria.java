package Classes;

public class ContaBancaria {
    private double saldo;
    String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("R$ " + valor + " depositado com sucesso.");
    }

    public void sacar(double valor) {
        if (getSaldo() - valor < 0) {
            System.out.println("Erro na operação.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("R$ " + valor + " sacado com sucesso.");
        }
    }
}
