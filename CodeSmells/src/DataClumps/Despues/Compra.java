/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Despues;


/**
 *
 * @author JuanJose FS
 */
public class Compra {               //tecnica introducir objeto en parametro
    private float costo;
    private String detalles;
    
    //metodo solo recibe el objeto persona y luego accede a sus atributos
    public void agregar(Persona p){
        System.out.println("Se ha agregado a "+p.getNombre()+" con cedula: "+p.getCedula());
        System.out.println(p.getDescripcion());
        System.out.println(p.getEdad());
    }
}
