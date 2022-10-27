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
public class Television extends Electrodomestico {

    private int pulgadas;
    private boolean TDT;

    public Television() {
    }

    public Television(int pulgadas, boolean TDT, double precio, String color, char letra, double peso) {
        super(precio, color, letra, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    //METODOS
    public void crearTelevision() {
        crearElectrodomestico();
        System.out.println("ingrese las pulgadas del televisor: ");
        pulgadas = leer.nextInt();

        System.out.println("tiene el sintonizador TDT: s/n");
        String opc = leer.next();

        if (opc.equalsIgnoreCase("S")) {
            TDT = true;
        } else {
            TDT = false;
        }
        
        this.precio = precioFina();

        Television t1 = new Television(pulgadas, TDT, precio, color, letra, peso);

    }

    @Override
    public double precioFina() {

        //System.out.println(super.precioFina()+"super");
        //System.out.println(this.precio+"precio");

        if (pulgadas > 40) {
            this.precio =super.precioFina() + (this.precio  * 30) / 100;

        }
     ;

        if (TDT == true) {
            this.precio = this.precio + 500;
        }

          
        return this.precio; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + ", pulgadas: " + pulgadas + ", tiene TDT: " + TDT; //To change body of generated methods, choose Tools | Templates.
    }

}
