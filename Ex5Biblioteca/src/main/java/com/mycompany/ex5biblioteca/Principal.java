package com.mycompany.ex5biblioteca;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Biblioteca livro = new Biblioteca();
        
        livro.adicionarLivro("Diário de um banana", "Jeff Kinney");
        livro.buscarLivro("Jeff Kinney");
        livro.informacoes();
    }
}
