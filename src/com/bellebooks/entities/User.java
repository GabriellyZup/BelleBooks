package com.bellebooks.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String userID;
    private List<Book> borrowedBooks;

    /**
     * contrutor user
     * @param name Nome do usuário
     * @param userID Identificação do usuário
     */

    public User (String name, String userID){
        this.name = name;
        this.userID = userID;
        this.borrowedBooks = new ArrayList<>(); //inicializa a lista de livros
    }

    public void exibirDetalhes(){
        System.out.println("USuário: " + name);
        System.out.println("ID: " + userID);
        System.out.println("Livros emprestados: ");
        if (borrowedBooks.isEmpty()){
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Book book : borrowedBooks){
                System.out.println("- " + book.getTitle());

            }
        }
    }

    /**
     * metodo para add a lista de livros emprestados
     *
     * @param book O livro a ser adicionado
     */

    public void adicionarLivro(Book book){
        borrowedBooks.add(book); //book e ?
    }

    /**
     * Metodo para remover um livro da lista de livros emprestado.
     * @param  book O livro a ser removido.
     */

    public void removerLivro (Book book) {
        borrowedBooks.remove(book);
    }

    //Getters and setters para atributos de da classe
    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void addLoanedBook(Book book) {
    }
}
