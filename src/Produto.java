
// 1. Criando uma classe >>
public class Produto {

    //2. Atributos
    //public TIPO NOME;
    private String nome;
    private double tamanho;
    private double preco;
    private String cor;
    private int unidade;
    private String marca;

    //3. Metodos
    //Mostra informacoes do produto;
    //Static >> SIGNIFICA QUE O METODO NAO USA POO


    public Produto(String nome, double preco, String marca, Double tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho);


    }
}
