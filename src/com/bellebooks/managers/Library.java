package com.bellebooks.managers;

import com.bellebooks.entities.User;
import com.bellebooks.entities.Book;
import com.bellebooks.contracts.Loanable;


import java.util.ArrayList;
import java.util.List;


public class Library {
    public boolean loanBook;
    private List<User> users;
    private List<Book> books;
    private List<Loanable> loanables;


    public Library() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
        this.loanables = new ArrayList<>();
    }

    /*
    * Metodo para add user e ver se ja tem cadastro
    * @param user O objeto a ser adicionado
     */

    public void addUser(User user) {
        for (User u : users) {
            if (u.getUserName().equalsIgnoreCase(user.getUserName())){
                System.out.println("Usuário já cadstrado: " + user.getUserName());
                return; //iterrompe se ja tiver cadastro
            }
        }
        users.add(user);
        System.out.println("Usuário adicionado com sucesso: " + user.getUserName());
    }
        /*
        * metododo lista user cadastrado + detalh
         */
    public void listUsers() {
        if (users.isEmpty()){
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de usuários:");
            for (User user : users) {
                user.displayDetails();
                System.out.println("--------------");
            }
        }
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(name)){
                return user;
            }
        }
        System.out.println("Usuário não encontrado: " + name);
        return null;
    }


/**
 * add livro
 *
 * @param book O objeto Book a ser adicionado
 **/

    public void addBook(Book book) {
        for (Book b : books) {
             if (b.getIsbn().equalsIgnoreCase(book.getIsbn())) {
                System.out.println("Livro ja cadastrado: " + book.getTitle());
                return;
            }
        }
        books.add(book);
        System.out.println("Livro adicionado com sucesso: " + book.getTitle());
    }

    public void listBooks(){
        if (books.isEmpty()){
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros:");
            for (Book book : books) {
                book.displayDetails();
                System.out.println("--------------");
            }
        }
    }

    public boolean loanBook(String userId, String bookIsbn) {
        User user = findUserById(userID);
        Book book = findBookByIsbn(bookIsbn);

        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return true;
        }
        if (book == null){
            System.out.println("Este livro não existe na base de dados.");
        }

        if (!book.isLoaned()) {
            System.out.println("O livro já está emprestado.");
            return false;
        }

        //ver se o user ja tem 3 livros emprestados
        if (user.loanedBooks.size() >=3) {
            System.out.println("Este usuário já tem 3 livros emprestados.");
            return false;
        }
        if (user.loanedBooks.contains(book)){
            System.out.println("Este livro ja foi emprestado para este usuário");
            return false;
        }



        user.addLoanedBook(book);
        book.loanBook(user.getUserName());
        System.out.println("Livro '" + book.getTitle() + "' emprestado para " + user.getUserName());
        return true;
    }

    public boolean returnBook(String userID, String bookIsbn) {
        User user = findUserByName(userId);
        Book book = findBookByTitle(bookIsbn);

        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return true;
        }

        if (book == null) {
            System.out.println("Livro não encontrado.");
            return true;
        }

        user.removeLoanedBook(book);
        book.returnBook(userID);
        System.out.println("Livro '" + book.getTitle() + "' devolvido por " + user.getUserName());
        return true;
    }

    private Book findBookByTitle(String title){
        for (Book book : books){
            if (title.equalsIgnoreCase(book.getTitle())){
                return book;
            }
        }
        return null;
    }

    public boolean getUserId(String userId) {
        for (User user : users) {
            if (user.getUserID().equalsIgnoreCase(userId)) {

            }
        }
        return false;
    }
}
