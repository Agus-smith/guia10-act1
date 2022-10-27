/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.cancion;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class servicioCancion {

    public String llenar(cancion c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el titulo de la cancion: ");
        c1.setTitulo(leer.nextLine());
        System.out.println("ingrese el autor de la cancion: ");
        c1.setAutor(leer.nextLine());
        
        return null;
    }

}
