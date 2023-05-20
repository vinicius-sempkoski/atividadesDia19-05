package com.mycompany.ex6midia;

/**
 *
 * @author Vinicius
 */
public class Menu {

    public static void main(String[] args) {
        Cd cd = new Cd();
        Dvd dvd = new Dvd();
        Bluray bluray = new Bluray();
        
        cd.reproduzir();
        dvd.reproduzir();
        bluray.reproduzir();
    }
}
