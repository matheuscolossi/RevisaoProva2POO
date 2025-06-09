package questao1;

public class CD extends Produto {
    private String artista;
    private int numerofaixas;

    public CD (String nome, double preco, String artista, int numerofaixas){
        super(nome, preco);
        this.artista = artista;
        this.numerofaixas = numerofaixas;
    }

    public String toString(){
        return super.toString() + ", Artista:" + artista + ", Numerofaixas:" + numerofaixas;
    }

}
