/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Admin
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char letra, double peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //METODOS
    public void crearLavadora() {

        crearElectrodomestico();
        System.out.println("ingrese la carga que tendra el lavaropa: ");
        this.carga = leer.nextInt();
        this.precio = precioFina();
        Lavadora lav = new Lavadora(carga, precio, color, letra, peso);

    }

    @Override
    public double precioFina() {

        if (this.carga > 30) {
            this.precio = super.precioFina() + 500;
        }
        return this.precio;
    }

    @Override
    public String toString() {
        return super.toString()+",carga:"+ this.carga +"}";//To change body of generated methods, choose Tools | Templates.
    }

}
