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
public class act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //CONTADORES DE DIGITOS
        int contador1Digito = 0;
        int contador2Digito = 0;
        int contador3Digito = 0;
        int contador4Digito = 0;
        int contador5Digito = 0;
        //-----------------------

        int n = (int) (Math.random() * 100);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999);
            System.out.println( vector[i] );
            if (vector[i] < 10) {

                contador1Digito = contador1Digito + 1;
            } else {
                if (vector[i] >= 10 && vector[i] < 100) {
                    contador2Digito = contador2Digito + 1;
                } else {
                    if (vector[i] >= 100 && vector[i] < 1000) {
                        contador3Digito = contador3Digito + 1;
                    } else {
                        if (vector[i] >= 1000 && vector[i] < 10000) {
                            contador4Digito = contador4Digito + 1;
                        } else {
                            if (vector[i] >= 10000) {
                                contador5Digito = contador5Digito + 1;
                            }

                        }
                    }

                }

            }

        }
        
       System.out.println("entre los " + n +" numeros alazar, se encuentran de:");
System.out.println(" 1 digito: " + contador1Digito);
System.out.println(" 2 digito: " + contador2Digito);
System.out.println(" 3 digito: " + contador3Digito);
System.out.println(" 4 digito: " + contador4Digito);
System.out.println(" 5 digito: " + contador5Digito);
    }

}
