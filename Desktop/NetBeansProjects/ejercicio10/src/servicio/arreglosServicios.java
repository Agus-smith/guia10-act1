/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.arreglos;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class arreglosServicios {

    double[] vecA = new double[50];

    public void llenar(arreglos a) {

        for (int i = 0; i < 50; i++) {

            Arrays.fill(vecA, i, i + 1, Math.random() * 10 + 1);

        }

        Arrays.sort(vecA);
        a.setVectorA(vecA);
        System.out.println(Arrays.toString(a.getVectorA()));
        double[] vecB = new double[20];
        for (int i = 0; i < 20; i++) {

            Arrays.fill(vecB, i, i + 1, vecA[i]);
        }
        Arrays.fill(vecB, 10, 20, 0.5);

        a.setVectorB(vecB);
        System.out.println(Arrays.toString(a.getVectorB()));

    }

    
}
