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
public class act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro numero entero: ");
        int num2 = leer.nextInt();
        int opcion;
        String confir;
        int opc1 = 0;

        do {
            System.out.println("MENU: ");
            System.out.println(" ");
            System.out.println("1. sumar ");
            System.out.println("2.restar");
            System.out.println("3.multiplicar ");
            System.out.println("4. dividir ");
            System.out.println("5. salir ");
            System.out.println(" ");
            System.out.println("seleccione una opcion");
            int opc = leer.nextInt();
             leer.nextLine();

            switch (opc) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("la suma entre ambos valores es: " + sum);
                    break;
                case 2:
                    int resta = num1 + num2;
                    System.out.println("la resta entre ambo valores es: " + resta);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("la multiplicacion entre ambos numeros es: " + mult);
                    break;
                case 4:
                    int division = num1 / num2;
                    System.out.println("la division entre ambos numeros es: " + division);
                    break;
                case 5:
                    System.out.println("esta seguro de que desea salir S/N");
                    confir = leer.nextLine();
                    confir = confir.toUpperCase();
                    if (confir.equals("S")) {
                        opc1 = 5;
                    } else {
                        opc1 = 4;
                    }
            }
        } while (opc1 != 5);
    }

}
