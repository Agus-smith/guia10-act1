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
public class act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese un numero");
        n=leer.nextInt();
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        int veces=0;
        for (int i=0 ; i<n; i++){
           vector[i]=(int)(Math.random()*10);
           //System.out.println(vector[i]);
         }
        System.out.println("elija el numero que desea buscar");
         int numElegido= leer.nextInt();
         for (int i=0 ; i<n; i++){
              vector2[i]=10000;
             if(vector[i]==numElegido){
            vector2[i]=i;
             
             veces=veces+1;
            }   
             //System.out.println(vector2[i]);
         }
         System.out.println("el numero elegido se repite "+ veces+" veces");
            System.out.println("y se encuentra en las posiciones ");
            for (int i=0 ; i<n; i++){
            if(vector2[i]!=10000){
            System.out.println(vector2[i]);
            }   
         }
    }
    
}
