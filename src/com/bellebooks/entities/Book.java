package com.bellebooks.entities;

import com.bellebooks.contracts.Loanable;

import java.util.ArrayList;
import java.util.List;

//representa o livro na biblioteca
public class Book implements Loanable {
    //atributos
    private String title;
    private String author;
    private String isbn;
    private boolean loaned;
    private String loanedBy;

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
        this.loanedBy = " "; //nenhum user ainda
    }

    //metodo exib detalhes do livro
    public void displayDetails() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (!loaned ? "Sim" : "Não"));

        if (loaned) {
            System.out.println("Emprestado para: " + loanedBy);
        }
    }

    //metodo emprestar
    public boolean loanBook(String userName) {
        if (!loaned) {
            loaned = true;
            loanedBy = userName;
            return true; //muda status para disponível
        }
            System.out.println("O livro já está emprestado.");
            return false;

    }
    //metodo devolver
    public boolean returnBook(String userName) {
        if (loaned) {
            loaned = false;
            loanedBy = userName;
            System.out.println("Livro devolvido.");
            return loaned;
        } else {
            System.out.println("O livro está não está emprestado.");
            return loaned;
        }
    }
    //getter & setter para atributos da classe
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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

    public String getLoanedBy() {
        return loanedBy;
    }

    public void setLoaned(String loanedBy) {
        this.loaned = true;
        this.loanedBy = loanedBy;
    }
}
