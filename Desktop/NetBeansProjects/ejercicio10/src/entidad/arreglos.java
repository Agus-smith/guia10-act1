/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class arreglos {
    
     private double[] vectorA = new double[50];
    private double[] vectorB = new double[20];

    public arreglos() {
    }

    public arreglos(double vectorA[], double vectorB[]) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    //SET

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }
   //GET

    public double[] getVectorA() {
        return vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }
    
      
    
   
   

}
