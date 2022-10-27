/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Television;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Electrodomestico a = new Electrodomestico();
        a.crearElectrodomestico();
        a.precioFina();
        System.out.println(a.toString());
         */
 /*
        Lavadora lav= new Lavadora();
        lav.crearLavadora();
        System.out.println(lav.toString());
         */
 
        Television t1 = new Television();
        t1.crearTelevision();
        
        System.out.println(t1.toString());
    }

}
