package com.mycompany.ex4animal;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Passarinho passaro = new Passarinho();
        Gato gato = new Gato();
        
        cachorro.emitirSom();
        cachorro.mover();
        
        gato.emitirSom();
        gato.mover();
        
        passaro.emitirSom();
        passaro.mover();
    }
}
