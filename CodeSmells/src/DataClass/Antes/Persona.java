/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Persona {          //clase que solo contiene atributos crudos y publicos para ser accedidos en otra clase
    public String nombre;
    public String cedula;
    public int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }
    
}
