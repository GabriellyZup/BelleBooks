package com.bellebooks.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userID;
    private List<Book> loanedBooks;

    /**
     * contrutor user
     * @param userName Nome do usuário
     * @param userID Identificação do usuário
     */

    public User (String userName, String userID){
        this.userName = userName;
        this.userID = userID;
        this.loanedBooks = new ArrayList<>(); //inicializa a lista de livros
    }

    public void displayDetails(){
        System.out.println("Usuário: " + userName);
        System.out.println("ID: " + userID);
        System.out.println("Livros emprestados: ");
        if (loanedBooks.isEmpty()){
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Book book : loanedBooks){
                System.out.println("- " + book.getTitle());

            }
        }
    }

    /**
     * metodo para add a lista de livros emprestados
     *
     * @param book O livro a ser adicionado
     */

    public void loanBook(Book book){

        loanedBooks.add(book); //book e ?
    }

    /**
     * Metodo para remover um livro da lista de livros emprestado.
     * @param  book O livro a ser removido.
     */

    public void returnBook (Book book) {
        loanedBooks.remove(book);
    }

    //Getters and setters para atributos de da classe
    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<Book> getLoanedBooks(){
        return loanedBooks;
    }

    public void addLoanedBook(Book book) {
    }

    public boolean removeLoanedBook(Book book) {
        return true;

    }
}
