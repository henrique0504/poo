package Aula03;

public class MainConta {
    public static void main(String[] args) {
        Conta c1=new Conta("Ana Livya", 2234, 50.00);
        var resposta=c1.getNomeTitular();
        System.out.println(resposta);
        var valorSaldo=c1.getSaldo();
        System.out.println(valorSaldo);
    }
}
