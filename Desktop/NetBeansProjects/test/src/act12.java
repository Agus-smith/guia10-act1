/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new java.util.Scanner(System.in);
        String carac;
        int cont5 = 0;
        int cont = 0;
        boolean salir = false;
        do {
            System.out.println(" ingrese un conjunto de caracteres(para salir ingrese &&&&&)");
            carac = leer.nextLine();
            
            String o = carac.substring(4, 5);
            String x = carac.substring(0, 1);
             
            if (carac.length() != 5) {
                cont = cont + 1;

            } else {
                if (x.equals("x") && o.equals("o")) {
                    cont5 = cont5 + 1;
                } else {
                    cont = cont + 1;
                }
            }

            if (carac.equals("&&&&&")) {
                salir = true;
                 cont = cont - 1;
            }

        } while (salir == false);

        System.out.println("cantidad de lecturas correctas: " + cont5);
        System.out.println("cantidad de lecturas incorrectas: " + cont);

    }
}
