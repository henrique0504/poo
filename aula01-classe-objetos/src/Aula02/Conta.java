package Aula02;

public class Conta {
    private String nomeTitular;
    private Integer numerConta;
    private Double saldo;

    public Conta(String nomeTitular, Integer numerConta, Double saldo){
        this.nomeTitular=nomeTitular;
        this.numerConta=numerConta;
        this.saldo=saldo;
    }
    public void consultarSaldo(){
        System.out.printf("Saldo da conta: R$%.2f \n", this.saldo);
    }
    public void depositar(Double valor){
        this.saldo=this.saldo+valor;
    }
    public String sacar(Double valor){
        this.saldo=this.saldo-valor;
        return "Saque realizado com sucesso!!";
    }
}
