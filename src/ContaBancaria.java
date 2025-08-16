import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // METODOS
    public void depositar(double valor) {
        //saldo = saldo + valor;
        saldo += valor; // pega o que tinha antes e soma;
    }

    public void sacar(double valor) {
        saldo -= valor; // pega o que tinha antes e subtrai;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }


    //SETTER AND GETTER
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
