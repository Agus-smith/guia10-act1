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
public class act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase de 8 caracteres");
        String frase = leer.nextLine();
        int num;
       int lon = frase.length();
        if (lon==8) {
            
              System.out.println("correcto");
        } else {
               System.out.println("incorrecto");
        }
               
    }
    
}
