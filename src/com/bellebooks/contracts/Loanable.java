package com.bellebooks.contracts;

//interface para livors empretados
//define metodo padrao para emprestimo e devolução

public interface Loanable {




    boolean isLoaned();

    boolean loanBook (String loanedBy);

    boolean returnBook ();

}
