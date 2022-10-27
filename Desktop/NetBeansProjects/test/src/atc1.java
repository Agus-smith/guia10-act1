
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class atc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num1 = leer.nextInt();
         System.out.println("ingrese un numero: ");
        int num2 = leer.nextInt();
        int sum = num1 + num2;
        System.out.println("la sumatoria de los numeros es: " + sum);
        
                
    }
    
}
