package Aula02;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta=new Conta("Paulo Henrique", 55443, 0.0);
        minhaConta.consultarSaldo();
        minhaConta.depositar(120.00);
        minhaConta.consultarSaldo();
        minhaConta.sacar(15.00);

    }
}
