
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
    private int estoque;

    //3. Metodos
    //Mostra informacoes do produto;
    //Static >> SIGNIFICA QUE O METODO NAO USA POO

//    public Produto(String nome, double preco, String marca, Double tamanho) {
//        this.nome = nome;
//        this.preco = preco;
//        this.marca = marca;
//        this.tamanho = tamanho;
//    }
//
//    public void mostrarInformacoes() {
//        System.out.println("Nome: " + nome);
//        System.out.println("Preco: " + preco);
//        System.out.println("Marca: " + marca);
//        System.out.println("Tamanho: " + tamanho);

    //METODO CONSTRUTOR

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    //GETTER AND SETTER
    public double getPreco() {
        return preco;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: O preço deve ser um valor positivo.");
        }
    }

    }
