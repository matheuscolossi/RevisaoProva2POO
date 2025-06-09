package questao1;

public class DVD extends Produto {
    private String tipo;
    private int duracao;

    public DVD(String nome, double preco, String tipo, int duracao){
        super(nome, preco);
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public String toString(){
        return super.toString() + ", Tipo: " + tipo + ", Duração: " + duracao;
    }

}
