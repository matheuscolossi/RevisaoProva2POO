
public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String toString(){
        return "Produto: " + nome + ", Preço: " + preco;
    }
}
