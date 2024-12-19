package com.bellebooks.entities;

//importa a ArrayList para a lista de emprestados
import java.util.ArrayList;
//import.java.util.List; (descomentar???)

//representa o livro na biblioteca
public class Book {
    //atributos
    private String title;
    private String author;
    private String isbn;
    private boolean avaliable;

/*    //construtor
    @param title  Titulo do livro
    @param author Autor do livro
    @param isbn   ISBN do livro
 */

    public Book(String title, String author, String isbn){
        //inicializa as coisas
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.avaliable = true;
    }

    //metodo exib detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("ISBN: " +isbn);
        System.out.println("Disponível: " + (avaliable ? "Sim" : "Não"));
    }

    //metodo emprestar
    public void emprestar() {
        if (avaliable) {
            avaliable = false; //muda status para indisponível
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }
    //metodo devolver
    public void devolver() {
        avaliable = true; //muda status para disponível
    }
    //getter & setter para atributos da classe
    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable (boolean avaliable){
        this.avaliable = avaliable;
    }
}
