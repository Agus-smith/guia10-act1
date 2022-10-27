/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaJavaExtra;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una cantidad de minutos");
        int minutos = leer.nextInt();
        double horas = minutos / 60;
        double dias = horas / 24;
        System.out.println("minutos: " + minutos);
        System.out.println("horas: " + horas);
        System.out.println("dias: " + dias);
    }

}
