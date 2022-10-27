/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.punto;
import servicio.servicioPunto;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        punto p1=new punto();
        servicioPunto ps=new servicioPunto();
        ps.crearPuntos(p1);
        ps.distancia(p1);
    }
    
}
