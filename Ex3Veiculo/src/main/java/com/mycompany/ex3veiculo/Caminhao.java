package com.mycompany.ex3veiculo;

/**
 *
 * @author Vinicius
 */
public class Caminhao extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O caminhão acelerou");
    }
    
    @Override
    public void frear() {
        System.out.println("O caminhão freou");
    }
}
