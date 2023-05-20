package com.mycompany.ex1shape;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Área do círculo: " + circulo.calcularArea(4.3));
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro(4.3));
        
        System.out.println("Área do retângulo: " + retangulo.calcularArea(4, 5));
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro(4, 5));
        
        System.out.println("Área do triângulo: " + triangulo.calcularArea(7, 6));
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro(4, 7, 3));
    }
    
}
