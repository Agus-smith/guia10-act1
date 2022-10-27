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
public class act20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int j;
        int i;
        int[][] matriz = new int[3][3];
        boolean si = true;
        int sumaInicial = 0;
        int sumaLinea = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;
        int suma2Diagonal = 0;
        int suma;

        while (si == true) {
            //  LLENAR MATRIZ 
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.println("ingrese un numero entre 1-9");
                    int num = leer.nextInt();
                    if (num < 10 && num > 0) {
                        matriz[i][j] = num;
                        // System.out.print("[" + matriz[i][j] + "]");

                    } else {
                        System.out.print("no es posible ingresar es numero ");
                        j = j - 1;
                        System.out.print("");
                    }

                }
                System.out.println("");
            }
            // MATRIZ ESCRITA
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {

                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("-------------------------------------");

            //SUMA LINEAS
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {

                    suma = matriz[i][j];
                    sumaLinea = sumaLinea + suma;

                }

                if (i == 0) {
                    sumaInicial = sumaLinea;
                }

                if (sumaInicial == sumaLinea) {
                    si = true;
                } else {
                    si = false;
                     System.out.print("Los numeros ingresados no forman un cubo magico");
                     System.out.print("1");
                    break;
                }

                sumaLinea = 0;
            }

            if (si == false) {
               
                break;
            }

            //SUMA COLUMNAS
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {

                    suma = matriz[j][i];
                    sumaColumna = sumaColumna + suma;

                }

                if (sumaInicial == sumaColumna) {
             
                } else {
                    si = false;
                     System.out.print("Los numeros ingresados no forman un cubo magico");
                        System.out.print("2");
                    break;
                }


               
                sumaColumna = 0;
            }
            if (si == false) {
               
                break;
            }

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {

                    suma = matriz[i][j];
                    sumaLinea = sumaLinea + suma;

                }

                if (i == 0) {
                    sumaInicial = sumaLinea;
                }

                if (sumaInicial == sumaLinea) {
                    si = true;
                } else {
                    si = false;
                     System.out.print("Los numeros ingresados no forman un cubo magico");
                        System.out.print("3");
                    break;
                }

                sumaLinea = 0;
            }

            if (si == false) {
                 
                break;
            }

            //SUMA 1 DIAGONAL
            int n = 0;
            for (i = 0; i < 3; i++) {
                for (j = n; j < 3; j += 3) {

                    suma = matriz[i][j];
                    sumaDiagonal = sumaDiagonal + suma;
                    n = n + 1;
                }

            }
            if (sumaInicial == sumaDiagonal) {
                si = true;
            } else {
                si = false;
               
                 System.out.print("Los numeros ingresados no forman un cubo magico");
                    System.out.print("4");
                break;
            }

            //SUMA 2 DIAGONAL
            n = 2;

            for (i = 0; i < 3; i++) {

                for (j = n; j > -1; j -= 3) {
                    suma = matriz[i][j];
                    suma2Diagonal = suma2Diagonal + suma;
                }
                n = n - 1;
            }
            if (sumaInicial == suma2Diagonal) {
                si = true;
            } else {
                si = false;
                System.out.println(si);
                System.out.print("Los numeros ingresados no forman un cubo magico");
                   System.out.print("5");
                break;
            }

            if (si == true) {
                System.out.print("Los numeros ingresados forman un cubo magico");
                System.out.print("");
                  break;

            }

        }

    }
    
}
