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
public class act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new java.util.Scanner(System.in);
        System.out.println(" ingrese una frase");   
        String frase = leer.nextLine();
        String letra = frase.substring(0,1);
        letra= letra.toUpperCase();
        if ( letra.equals("A")) {
           System.out.println(" CORRECTO"); 
            
        } else {
            System.out.println("INCORRECTO"); 
        }
      //String letra = Substring(1,1);
        
    }
    
}
