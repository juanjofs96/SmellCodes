/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Compra {           
    private float costo;
    private String detalles;
    
    //metodo que pasa como parametros todos los atributos de una persona
    public void agregar(String nombre, String cedula, String descripcion, int edad){
        System.out.println("Se ha agregado a "+nombre+" con cedula: "+cedula);
        System.out.println(descripcion);
        System.out.println(edad);
    }
}
