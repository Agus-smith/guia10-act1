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
public class act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int n = leer.nextInt();
       
        if (n%2 ==0 ) {
              System.out.println(n+" es un numero par");
        } else {
             System.out.println(n+" es un numero impar");
        }
        
        
    }
    
}
