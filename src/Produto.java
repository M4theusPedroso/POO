
// 1. Criando uma classe >>
public class Produto {

    //2. Atributos
    //public TIPO NOME;
    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;

    //3. Metodos
    //Mostra informacoes do produto;
    //Static >> SIGNIFICA QUE O METODO NAO USA POO

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
}
