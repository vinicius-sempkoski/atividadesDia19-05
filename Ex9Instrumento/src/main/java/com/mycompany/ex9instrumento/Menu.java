package com.mycompany.ex9instrumento;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Violao violao = new Violao();
        Piano piano = new Piano();
        Bateria bateria = new Bateria();
        violao.tocar();
        piano.tocar();
        bateria.tocar();
    }
}
