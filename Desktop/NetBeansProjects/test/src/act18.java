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
public class act18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n = 4;
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println("");

        }
        System.out.println("------------------");
        int[][] matrizT = new int[n][n];
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                matrizT[i][j] = matriz[j][i];
                System.out.print("[" + matrizT[i][j] + "]");
                
            }
            System.out.println("");
        }

    }

}
