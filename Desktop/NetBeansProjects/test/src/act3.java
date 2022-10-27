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
public class act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese una frase en MAYUSCULAS");
         String frase1= leer.nextLine();
         System.out.println("ingrese una frase en minusculas ");
         String frase2= leer.nextLine();
         System.out.println("la frase quedo como "+ frase1.toLowerCase()+ frase2.toUpperCase());
    }
    
}
