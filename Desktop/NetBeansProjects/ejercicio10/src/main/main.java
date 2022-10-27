/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import entidad.arreglos;
import servicio.arreglosServicios;

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
        arreglos a =new arreglos();
        arreglosServicios s = new  arreglosServicios();
        s.llenar(a);
    }
    
}
