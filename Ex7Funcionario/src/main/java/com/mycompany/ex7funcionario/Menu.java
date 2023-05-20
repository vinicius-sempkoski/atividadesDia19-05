package com.mycompany.ex7funcionario;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Analista analista = new Analista();
        Programador programador = new Programador();
        
        gerente.setSalario(6000);
        gerente.setSetor("Tecnologia");
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Setor: " + gerente.getSetor());
        
        analista.setNome("Mario");
        System.out.println("Nome do Analista: " + analista.getNome());
        
        programador.setProjeto("Software");
        System.out.println("Nome do Projeto: " + programador.getProjeto());
    }
}
