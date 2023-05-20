package com.mycompany.ex3veiculo;

/**
 *
 * @author Vinicius
 */
public class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto acelerou");
    }
    
    @Override
    public void frear() {
        System.out.println("A moto freou");
    }
}
