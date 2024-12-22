package com.bellebooks.contracts;

//interface para livors empretados
//define metodo padrao para emprestimo e devolução

public interface Loanable {

    /**
     * Define os dados do emprestavel
     *
     * @param title O título a ser emprestado
     * @param userName O nome do usuário que esta emprestando
     * @return true se o emprestimo terminar com a devolução, false se for diferente disso.
     */

    //boolean loanBook (String title, String userName);

    //boolean returnBook (String title, String userName);

    boolean isLoaned();

    void loanBook (String userName);

    void returnBook (String userName);

}
