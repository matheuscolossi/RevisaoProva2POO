package questao1;

import java.lang.String;
public class Livro extends Produto {
    private String autor;
    private String isbn;

    public Livro (String nome, double preco, String autor, String isbn) {
        super(nome, preco);
        this.autor = autor;
        this.isbn = isbn;

    }
    public String toString(){
        return super.toString() + ", Autor: " + autor + ", ISBN: " + isbn;
        }
    }

