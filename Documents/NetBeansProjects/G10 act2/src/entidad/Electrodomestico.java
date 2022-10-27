/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio;
    protected String color;
    protected char letra;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letra, double peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letra=" + letra + ", peso=" + peso ;
    }

    public char comprobarConsumoEnergetico(char letra) {

        Character le = toUpperCase(letra);

        if (le >= 65 && le <= 70) {

            this.letra = le;

        } else {
            this.letra = 'F';
        }
        return this.letra;
    }

    public String comprobarColor(String color) {

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris")) {

            this.color = color;

        } else {

            this.color = "blanco";
        }

        return this.color;
    }

    public void crearElectrodomestico() {

        System.out.println("ingrese el peso del electrodomestico: ");
        this.peso = leer.nextDouble();
        System.out.println("ingrese elcolor: ");
        String c = leer.next();
        comprobarColor(c);
        System.out.println("ingresar la letra del consumo energetico: ");
        char l = leer.next().charAt(0);
        comprobarConsumoEnergetico(l);
        this.precio = precioFina() + 1000;

    }

    public double precioFina() {

        switch (comprobarConsumoEnergetico(letra)) {
            case 'A':
                this.precio = this.precio + 1000;

                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio = this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;

        }

        if (this.peso >= 1 && this.peso <= 19) {

            this.precio = this.precio + 100;

        } else if (this.peso >= 20 && this.peso <= 49) {

            this.precio = this.precio + 500;
        } else if (this.peso >= 50 && this.peso <= 79) {

            this.precio = this.precio + 800;
        } else if (this.peso >= 80) {
            this.precio = this.precio + 1000;

        }
        
        return this.precio;
    }
}
