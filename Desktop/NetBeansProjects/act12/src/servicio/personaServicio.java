/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;
import entidad.persona;

/**
 *
 * @author Admin
 */
public class personaServicio {
int edad;
    Scanner leer = new Scanner(System.in);

    public void nombre(persona p1) {

        System.out.println("ingrese su nombre: ");
        p1.setNombre(leer.nextLine());
        System.out.println("ingrese su apellido: ");
        p1.setApellido(leer.nextLine());
        System.out.println("ingrese el año en el que nacio: ");
        int anio = leer.nextInt();
        System.out.println("ingrese el mes en el que nacio: ");
        int mes = leer.nextInt();
        System.out.println("ingrese el dia en el que nacio: ");
        int dia = leer.nextInt();
        Date fechaDeNacimiento = new Date(anio - 1900, mes - 1, dia);
        p1.setFechaDeNacimiento(fechaDeNacimiento);

    }

    public void diferencia(persona p1) {
     
        Date fechaActual = new Date();

        edad = fechaActual.getYear() - p1.getfechaDeNacimiento().getYear();

   

      if (p1.getfechaDeNacimiento().getMonth() <= fechaActual.getMonth()
                && p1.getfechaDeNacimiento().getDay() < fechaActual.getDay()
                || p1.getfechaDeNacimiento().getMonth() > fechaActual.getMonth()) {
            edad--;
        }
        System.out.println(edad);

        
    }

    public boolean edad2(persona p1) {
        System.out.println("ingrese la segunda edad: ");
          int edad2 = leer.nextInt();
          
          if (edad2<edad){
          return true;
          }else{
          return false;
          }

    }

}
