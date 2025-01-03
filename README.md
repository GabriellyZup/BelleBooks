# Sistema de gerenciamento de Bibliotecas *BelleBooks*

## Descrição do projeto

Este é um sistema simples de gerenciamento de bibliotecas, desenvolvido para estudos práticos e teoricos, de **"Programação Orientada a Objeto (POO)"**
Ele permite:
- Cadastrar livros, 
- Cadastrar usuários,
- Realizar emprestomos e devoluções;
- Exibição de livros disponíveis.

O projeto está em progresso, com funcionalidades basicas implementadas e alguns pontos pendentes de melhorias e expansão;

## Status do Projeto

*Parcialmente concluído*

**Proximos passos:**
1. Adicionar funcionalidade para salvar dados localmente,
2. Permitir a inclusão de multiplas cópias do mesmo livro,
3. Adicionar funcionalidade de exclusão de dados,
4. Melhorar mensagens de retorno para o usuário. 

## Requisitos para Rodar o projeto

- **Java JDK** (versão miníma 11)
- **IntelliJ IDEA** ou outro IDE para Java
- **Terminal** para execução (o projeto roda no terminal)
- **GitHub** pra clonar o projeto

## Funcionalidades Implementadas 
## Funcionalidades Implementadas

### Classe **Main**

- Exibe um menu de opções para o usuário interagir com o sistema.
- Funções implementadas:
    - Cadastro de livros e usuários.
    - Realização de empréstimos e devoluções.
    - Listagem de livros disponíveis.

### Classe **Book**

- Representa os livros da biblioteca.
- Atributos:
    - `title` (Título do livro)
    - `author` (Autor)
    - `isbn` (Código único)
    - `loaned` (Indica disponibilidade)
- Métodos principais:
    - `displayDetails()`
    - `loanBook()`
    - `returnBook()`

### Classe **User**

- Representa os usuários cadastrados.
- Atributos:
    - `userName` (Nome do usuário)
    - `userID` (Identificação única)
    - `loanedBooks` (Lista de livros emprestados pelo usuário)
- Métodos principais:
    - `addLoanedBook()`
    - `removeLoanedBook()`

### Classe **Library**

- Gerencia os livros, usuários e suas interações.
- Métodos principais:
    - `addBook()`
    - `addUser()`
    - `loanBook()`
    - `returnBook()`
## Interface **Loanable**

- Define o comportamento padrao para objetos que podem ser emprestadps e devolvidos no sistema.
- métodos principais:
  - `boolean isLoaned()`
  - `boolean loanBook()`
  - `boolean returnBook()`

---

## Pontos Pendentes

1. **Armazenamento de Dados:**
    - Implementar uma solução para salvar e carregar informações de livros e usuários (ex.: arquivos de texto ou banco de dados simples).
2. **Regras de Negócio:**
    - Permitir a adição de múltiplas cópias de um mesmo livro.
    - Implementar exclusão de dados de livros e usuários.
    - Listar quem está com qual livro e o status de devolução.
3. **Melhorias nas Mensagens:**
    - Corrigir mensagens de feedback para o usuário em funções como empréstimo e devolução.

---

## Exemplos de Dados para Teste

Recomenda-se utilizar os seguintes dados para teste durante a execução do projeto:

### Livros

1. Título: "O Senhor dos Anéis", Autor: "J.R.R. Tolkien", ISBN: "123456789"
2. Título: "1984", Autor: "George Orwell", ISBN: "987654321"
3. Título: "O Pequeno Príncipe", Autor: "Antoine de Saint-Exupéry", ISBN: "567891234"

### Usuários

1. Nome: "João Silva", ID: 1
2. Nome: "Maria Oliveira", ID: 2
3. Nome: "Carlos Souza", ID: 3

---

## Como Rodar o Projeto

1. Clone o repositório ou copie os arquivos para o seu computador.
2. Abra o projeto em seu IDE preferido (ex.: IntelliJ IDEA).
3. Compile e execute a classe `Main`.
4. Utilize o menu exibido no console para interagir com o sistema.

---

## Referências e Materiais de Estudo

 Programação Orientada a Objetos

- [Documentação oficial do Java](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Artigo sobre POO em Java - DevMedia](https://www.devmedia.com.br/)
- [Vídeo introdutório sobre POO - YouTube](https://www.youtube.com/)

 Estrutura de Projetos em Java

- [Boas práticas para organização de classes](https://www.baeldung.com/java-clean-code)
- [Introdução a Interfaces e Encapsulamento](https://www.javatpoint.com/)

Armazenamento de Dados

- [Como usar arquivos de texto em Java](https://www.w3schools.com/java/java_files.asp)
- [Persistência básica com arquivos - GeeksforGeeks](https://www.geeksforgeeks.org/file-handling-in-java/)

---

**Nota:** Este projeto está em desenvolvimento e pretende ser revisado e expandido assim que possivel. 
