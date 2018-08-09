/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimacy.Despues;

/**
 *
 * @author JuanJose FS
 */
public class Estudiante {           //tecnica mover metodo
    private String nombre;   
    private String matricula;
    private int grado;
    private float promedio;         //atributos privados

    public Estudiante(){
        
    }
    
    public Estudiante(String nombre, String matricula, int grado, float promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grado = grado;
        this.promedio = promedio;
    }
    
    //se crean los getters y setters respectivos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
}
