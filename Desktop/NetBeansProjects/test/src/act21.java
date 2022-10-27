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
public class act21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int i;
        int j;
        int a = 1;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {

                matrizM[i][j] = a;
                //matrizM[i][j] = (int)(Math. random()*100+1);
                System.out.print("[" + matrizM[i][j] + "]");
                a = a + 1;
            }
            System.out.println("");
        }

        a = (int) (Math.random() * 92 + 1);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                matrizP[i][j] = a;
                System.out.print("[" + matrizP[i][j] + "]");
                a = a + 1;
            }
            System.out.println("");
        }
        do {
            
            for (i = 0; i < 10; i++) {
                for (j = 0; j < 10; j++) {

                    if (matrizM[i][j] == matrizP[i][i]) {
                        System.out.print("[" + matrizM[i][j] + "]");
                        System.out.print("[" + matrizP[0][0] + "]");
                        System.out.println("");

                    }

                    if (matrizM[i][j] == matrizP[i][1]) {
                        System.out.print("[" + matrizM[i][j] + "]");
                        System.out.print("[" + matrizP[0][1] + "]");
                        System.out.println("");

                    }
                    if (matrizM[i][j] == matrizP[i][2]) {
                        System.out.print("[" + matrizM[i][j] + "]");
                        System.out.print("[" + matrizP[0][2] + "]");
                        System.out.println("");

                    }

                }
               
              
            }

        } while (i <= 7);

    }
}
