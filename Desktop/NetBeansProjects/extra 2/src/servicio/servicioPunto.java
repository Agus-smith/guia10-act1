/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.punto;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class servicioPunto {

    Scanner leer = new Scanner(System.in);

    public double crearPuntos(punto p1) {
        System.out.println("ingrese el eje x de una coordenada: ");
        p1.setX1(leer.nextDouble());
        System.out.println("ingrese el eje y de esa misma coordenada: ");
        p1.setY1(leer.nextDouble());

        System.out.println("ingrese el eje x de otra coordenada: ");
        p1.setX2(leer.nextDouble());
        System.out.println("ingrese el eje y de esa misma coordenada: ");
        p1.setY2(leer.nextDouble());

        return 0;

    }

    public double distancia(punto p1) {
        double distancia;
        distancia = ((p1.getX1() - p1.getX2()) * (p1.getX1() - p1.getX2())) + ((p1.getY1() - p1.getY2()) * (p1.getY1() - p1.getY2()));
        distancia = Math.sqrt(distancia);
        
        System.out.println("la distancia entre la primera coordenada ingresada y la segunda es de: "+ distancia);
        
        return 0;
    }
}
