package com.bellebooks.entities;

import com.bellebooks.contracts.Loanable;


// a ArrayList para a lista de emprestados
// java.util.ArrayList;
//import.java.util.List; //(descomentar???)

//representa o livro na biblioteca
public class Book {
    //atributos
    private String title;
    private String author;
    private String isbn;
    private boolean loaned;



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
        this.loaned = false; //livro começa não emprestado
    }

    //metodo exib detalhes do livro
    public void displayDetails() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("ISBN: " +isbn);
        System.out.println("Disponível: " + (!loaned ? "Sim" : "Não"));
    }

    //metodo emprestar
    public boolean loanBook() {
        if (!loaned) {
            loaned = true;
            return true; //muda status para disponível
        } else {
            System.out.println("O livro já está emprestado.");
            return false;
        }
    }
    //metodo devolver
    public void returnBook() {
        if (loaned) {
            loaned = false;
        } else {
            System.out.println("O livro foi devolvido.");
        }
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

    public boolean isLoaned() {
        return loaned;
    }
}
