package Aula03;

public class Conta {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;
    private boolean status;

    public Conta(String nomeTitular, int numeroConta, double saldo){
        this.nomeTitular=nomeTitular;
        this.numeroConta=numeroConta;
        this.saldo=saldo;
        this.status=true;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double valor){
        this.saldo=valor;
    }
    public String depositar(double valor){
        this.saldo=this.saldo+valor;
        return "Saque realizar com sucesso.";
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(int novoStatus){
        this.numeroConta=novoStatus;
    }

    public void exibir(){
        System.out.println("======== Dados Bancário ========");
        System.out.println("Cliente: " + getNomeTitular());
        System.out.println("Número da conta: " + getNomeTitular());
        System.out.println("Conta está ativa?" + getStatus());
        System.out.println("=============================");
    }
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public String setNomeTitular(String nome){
        this.nomeTitular=nome;
        return "Nome alterado com sucesso.";
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public String setnumeroConta(int novoNumero){
        this.numeroConta=novoNumero;
        return "Numero da conta atualizado. ";
    }
    public boolean getStatus(){
        return this.status;
    }
    public String setStatus(boolean novoStatus){
        this.status=novoStatus;
        var resultado=getStatus() ? "Conta ativada" : "Conta cancelada";
    }
    public double getStatus(){
        return this.saldo;
    }
    public void setSaldo(double valor){
        this.saldo=valor;
    }
    public String depositar(double valor){
        setSaldo(getSaldo() + valor);
        return "Deposito realizado!";
    }

    public String sacar(double valor){
        setSaldo(getSaldo()-valor);
        return "Saque realizado com sucesso. ";
    }
}
