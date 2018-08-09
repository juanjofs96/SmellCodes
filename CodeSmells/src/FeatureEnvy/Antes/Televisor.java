/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Televisor {
    private int pulgadas;
    private float costo;
    private String descripcion;

    public Televisor(int pulgadas, float costo, String descripcion) { 
        this.pulgadas = pulgadas;
        this.costo = costo;
        this.descripcion = descripcion;
    }
    
    public void conectar(){                 //metodo usa solamente data de otra clase no de su propia clase.
        DVD dvd = new DVD("LG", 50.0f, "Cualquier tipo de disco");
        dvd.setCosto(40.0f);
        dvd.setDescripcion("Problema con el boton pausa");
        dvd.setMarca("LG");
        System.out.println("Se sabe que el costo del dvd es de "+dvd.getCosto());
    }
    
    
    
    
}
