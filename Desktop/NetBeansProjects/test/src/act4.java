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
public class act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese grados C");
        float temp = leer.nextFloat();
        Float F = 32 + (9*temp/5);
        System.out.println("La temp ingresada en F es "+ F);
        
    }
    
}