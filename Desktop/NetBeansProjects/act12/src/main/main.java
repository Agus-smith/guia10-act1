/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.persona;

import java.util.Scanner;
import servicio.personaServicio;

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
        Scanner leer = new Scanner(System.in);
        persona p1 = new persona();
        personaServicio ps = new personaServicio();
        ps.nombre(p1);
        ps.diferencia(p1);
       boolean flag=  ps.edad2(p1);
        if(flag==false){
            System.out.println("la edad de la segunda persona es menor: "+flag);
        }else{
            System.out.println("la edad de la segunda persona es menor: "+flag);
        }
        System.out.println(p1.toString());
    }
    
}
