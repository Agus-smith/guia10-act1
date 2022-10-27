//Ejercicio 21: Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.

import java.util.Scanner;

public class ayuda21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz10x10 = new int[10][10];
        int[][] matriz3x3 = new int[3][3];
        int[] resultado = new int[2];

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                matriz10x10[i][j] = (int) (Math.random() * 2);
                if (i < 3 && j < 3) {
                    matriz3x3[i][j] = (int) (Math.random() * 2);
                }
            }
        }
        resultado = buscar(matriz10x10, matriz3x3);
        if (resultado[0] != 0) {
            System.out.println("La matriz 3x3 es una submatriz de la matriz 10x10, Se encontro en las posiciones:");
            System.out.println("Fila " + resultado[0] + " a " + (resultado[0] + 2) + " ,columna " + resultado[1] + " a " + (resultado[1] + 2));
        } else {
            System.out.println("La matriz 3x3 no es una submatriz de la matriz 10x10");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz10x10[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz3x3[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[] buscar(int[][] matriz10x10, int[][] matriz3x3) {
        int fila = 0;
        int columna = 0;
        boolean control;
        int[] resultado = {0, 0};
        do {
            control = true;

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    if (matriz10x10[i + fila][j + columna] != matriz3x3[i][j]) {
                        control = false;
                    }
                }
            }
            if (control) {
                resultado[0] = fila + 1;
                resultado[1] = columna + 1;
                return resultado;
            }
            if (columna == 7) {
                columna = 0;
                fila++;
            } else {
                columna++;
            }
        } while (fila <= 7);
        return resultado;
    }
}
