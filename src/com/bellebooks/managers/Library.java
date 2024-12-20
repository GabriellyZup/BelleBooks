package com.bellebooks.managers;

import com.bellebooks.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Library é a administração da biblioteca, com gerencimanto de livros e users
 */

public class Library {
    private List<User> users;

    /*
    Construtor da class Library, Inicializa a lista de user com ArrayList
     */

    public Library() {
        this.users = new ArrayList<>();
    }

    /*
    * Metodo para add user e ver se ja tem cadastro
    * @param user O objeto a ser adicionado
     */

    public void addUser (User user) {
        //ver se ja tem cadastro
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(user.getName())){
                System.out.println("Usuário já cadstrado: " + user.getName());
                return; //iterrompe se ja tiver cadastro
            }
        }
        users.add(user);
        System.out.println("Usuário adicionado com sucesso: " + user.getName());
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
                user.exibirDetalhes();
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
            if (user.getName().equalsIgnoreCase(name)){
                return user;
            }
        }
        System.out.println("Usuário não encontrado: " + name);
        return null;
    }
}
