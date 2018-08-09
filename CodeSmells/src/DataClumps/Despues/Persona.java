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
public class Persona {              //se crea clase para asi formar objetos con esos parametros
    private String nombre;
    private String cedula;
    private String descripcion;
    private int edad;

    public Persona(String nombre, String cedula, String descripcion, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.descripcion = descripcion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
