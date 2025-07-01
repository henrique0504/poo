package Aula02;

public class Livro {
    String TituloLivro;
    String NomeAutor;
    Integer AnoPublicacao;
    Integer QuantidadeTotal;
    Integer QuantidadeDisponiveis;

    public Livro(String TituloLivro, String NomeAutor, Integer AnoPublicacao, Integer QuantidadeTotal,
                 Integer QuantidadeDisponiveis){
        this.TituloLivro=TituloLivro;
        this.NomeAutor=NomeAutor;
        this.AnoPublicacao=AnoPublicacao;
        this.QuantidadeTotal=QuantidadeTotal;
        this.QuantidadeDisponiveis=QuantidadeDisponiveis;
    }
    public void exibir(){
        System.out.println("");
    }
}
