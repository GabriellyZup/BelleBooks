package com.bellebooks.managers;

import com.bellebooks.entities.User;
import com.bellebooks.entities.Book;
import com.bellebooks.contracts.Loanable;


import java.util.ArrayList;
import java.util.List;

/**
 * Classe Library é a administração da biblioteca, com gerencimanto de livros e users
 */

public class Library {
    public boolean loanBook;
    private List<User> users;
    private List<Book> books;
    private List<Loanable> loanables;
    /*
    Construtor da class Library, Inicializa a lista de user com ArrayList
     */

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
        //ver se ja tem cadastro
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
/*
* Metodo para buscar user pelo nome
*
*   @param name O nome do usuário que está buscando
*   @return O objeto User correspondente, ou null se não encontrado.
 */
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
             if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                System.out.println("Livro ja cadastrado: " + book.getTitle());
                return;
            }
        }
        books.add(book); //?
        System.out.println("Livro adicionado com sucesso: " + book.getTitle());
    }


    /*
    *
     */

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

    public boolean loanBook(String userName, String bookTitle) {
        User user = findUserByName(userName);
        Book book = findBookByTitle(bookTitle);

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

        user.addLoanedBook(book); //talvez se resolva quando fizer o leonable
        book.loanBook(userName);
        System.out.println("Livro '" + book.getTitle() + "' emprestado para " + user.getUserName());
        return true;
    }

    public boolean returnBook(String userName, String bookTitle) {
        User user = findUserByName(userName);
        Book book = findBookByTitle(bookTitle);

        if (user == null) {
            System.out.println("Usuário não encontrado.");
            return false;
        }

        if (book == null) {
            System.out.println("Livro não encontrado.");
            return false;
        }

        user.removeLoanedBook(book);
        book.returnBook(userName);
        System.out.println("Livro '" + book.getTitle() + "' devolvido por " + user.getUserName());
        return true;
    }

    /*
    *Encontra o livro pelo titulo
    *
    * @param title Título do livro.
    * @retur O objeto correspondente, ou null se não encotrado.
     */

    private Book findBookByTitle(String title){
        for (Book book : books){
            if (title.equalsIgnoreCase(book.getTitle())){  //ver isso aqui
                return book;
            }
        }
        return null;
    }

    public boolean getUserId(String userId) {
        return true;
    }
}
