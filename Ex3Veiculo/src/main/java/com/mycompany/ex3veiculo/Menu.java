package com.mycompany.ex3veiculo;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();
        
        carro.acelerar();
        carro.frear();
        
        moto.acelerar();
        moto.frear();
        
        caminhao.acelerar();
        caminhao.frear();
    }
}
