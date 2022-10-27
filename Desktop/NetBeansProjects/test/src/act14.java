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
public class act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese la cantidad de euros a convertir: "); 
        double euro =leer.nextDouble();
        leer.nextLine();
        System.out.println(" ingrese a que moneda quiere convertir los euros"); 
        String moneda = leer.nextLine();
        moneda = moneda.toLowerCase();
        cambio(euro,moneda);
        
    }
    public static void cambio (double euro, String moneda){
        switch(moneda){
            case "dolar":
                double camb = euro* 1.28611;
                System.out.println(" el cambio de " + euro + "a dolar es"+ camb);
                break;
            case "libra":
                double cambi = euro*0.86;
                System.out.println(" el cambio de " + euro + "a Libra es"+ cambi);
                break;
            case "yen":
                double cambio = euro*129.852;
                System.out.println(" el cambio de " + euro + "a Yen es"+ cambio);
                 break;
            default:
                
                System.out.println("ninguna de las opciones es correcta");
                break;
                     
        }
                
    }
}
