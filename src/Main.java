//classe principal onde o programa será executado
//menu de interação do user com o system


import com.bellebooks.entities.Book;
import com.bellebooks.entities.User;
import com.bellebooks.managers.Library;
import com.bellebooks.contracts.Loanable;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindos a BelleBooks! O sistema de gerenciamento da sua bibliotecas.");

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){

        System.out.println("\nEscolha uma opção: ");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Realizar emprestimo");
        System.out.println("4. Realizar devolução");
        System.out.println("5. Exibir livros disponíveis");
        System.out.println("6. Sair");
        System.out.print("Opção: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); //quebra de linha?

        switch (choice) {
            case 1:
                System.out.println("Digite o títuilo do livro: ");
                String title = scanner.nextLine();
                System.out.println("Digite o autor do livro: ");
                String author = scanner.nextLine();
                System.out.println("Digite o ISBN do livro: ");
                String isbn = scanner.nextLine();

                Book book = new Book(title, author, isbn);
                library.addBook(book);
                System.out.println("Livro cadastrado com sucesso!");
                break;

            case 2:
                System.out.println("Digite o nome do usuário: ");
                String userName = scanner.nextLine();
                System.out.println("Digite o ID de usuário: ");
                String userId = scanner.next();
                scanner.nextLine();

                if (library.getUserId(userId)) {
                    System.out.println("Esse Id de usuário já está sendo utilizado. Escolha outro ID.");
                } else {
                    User user = new User(userName, userId);
                    library.addUser(user);
                    System.out.println("Usuário cadastrado com sucesso!");
                }
                break;

            case 3: //emprestimo
                System.out.println("Digite nome do livro");
                String loanTitle = scanner.nextLine();
                System.out.println("Digite o ID do usuário: ");
                String loanUserId = scanner.nextLine();
                scanner.nextLine();


                boolean loanSuccess = library.loanBook;
                if (loanSuccess) {
                    System.out.println("Emprestimo realizado com sucesso!");
                } else {
                    System.out.println("Não foi possivel realizar o emprestimo. Verifique as informações");
                }
                break;

            case 4: //devolução
                System.out.println("Digite o título do livro: ");
                String returnTitle = scanner.nextLine();
                System.out.println("Digite o ID do usuário: ");
                String returnUserId = scanner.next();
                scanner.nextLine();

                boolean returnSuccess = library.returnBook(returnTitle, returnUserId);
                if (returnSuccess) {
                    System.out.println("Devolução realizada com sucesso!");
                } else {
                    System.out.println("Não foi possivel realizar a devolução, verifique as informações");
                }
                break;

                case 5:
                    System.out.println("\nLivros disponíveis:");
                    library.listBooks();
                    break;

                case 6:
                    running = false;
                    System.out.println("Obrigada por usar a BelleBooks! Até a próxima!");
                    break;

                default:
                    System.out.println("Opção Invalida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

