package com.mycompany.ex10produto;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Livro livro = new Livro();
        Eletronico eletronico = new Eletronico();
        Roupa roupa = new Roupa();
        
        livro.setNome("Diario de um banana");
        livro.setPreco(20);
        livro.setAutor("Jeff Kinney");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Autor: " + livro.getAutor());
        
        eletronico.setCor("Cinza");
        System.out.println("Cor do eletrônico: " + eletronico.getCor());
        
        roupa.setTamanho("Grande");
        System.out.println("Tamanho da roupa: " + roupa.getTamanho());
    }
}
