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
public class act13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese lado del cuadrado");
        int n =leer.nextInt();
         for (int i = 1; i<=n; i++){
            for (int j = 1 ; j <= n; j ++){
                if (i > 1 && i < n   && j > 1 && j <n) {
                    System.out.print("   ");
                } else {
                        System.out.print(" * ");
                }
                
             }
          System.out.println(" ");
        }
    
     }
}