/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Despues;

import FeatureEnvy.Antes.*;

/**
 *
 * @author JuanJose FS
 */
public class DVD {              //tecnica mover metodo
    private String marca;
    private float costo;
    private String descripcion;

    public DVD(String marca, float costo, String descripcion) {
        this.marca = marca;
        this.costo = costo;
        this.descripcion = descripcion;
    }
    
    public void conectar(){         //no servia de nada que metodo estuviera en clase Televisor, por lo tanto se lo cambia a clase DVD
        this.setCosto(40.0f);
        this.setDescripcion("Problema con el boton pausa");
        this.setMarca("LG");
        System.out.println("Se sabe que el costo del dvd es de "+this.getCosto());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
