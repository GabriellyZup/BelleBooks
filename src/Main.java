//classe principal onde o programa será executado
//menu de interação do user com o system


import com.bellebooks.entities.Book;
import com.bellebooks.entities.User;
import com.bellebooks.managers.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindos a BelleBooks, a biblioteca ");
    }

    Library library = new Library();

    Book book = new Book("Livro A", "Author A", "ISBN A");

    library.addBook(book);

    User user = new User("Jõao");

    library.loanBook("Livro A"  )
}


