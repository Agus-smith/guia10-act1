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
public class act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese un valor limite");
        int lim= leer.nextInt();
        int sum=0;
        do {
            System.out.println("ingrese un valor");
        int nsum= leer.nextInt();
        sum= sum + nsum;
            
        } while(sum < lim);
        System.out.println("la suma de sus valores es : " + sum);
        
    }
    
}
