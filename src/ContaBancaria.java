import java.util.Scanner;

public class ContaBancaria {
    public String titular;
    public double saldo;

    Scanner sc = new Scanner(System.in);

    public void depositar(double valor) {
        //saldo = saldo + valor;
        saldo += valor; // pega o que tinha antes e soma;
    }

    public void sacar(double valor) {
        saldo -= valor; // pega o que tinha antes e subtrai;

    }
}
