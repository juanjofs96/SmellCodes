/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimacy.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Estudiante {           //estudiante con todos sus atributos publicos
    public String nombre;   
    public String matricula;
    public int grado;
    public float promedio;

    public Estudiante(){
        
    }
    public Estudiante(String nombre, String matricula, int grado, float promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grado = grado;
        this.promedio = promedio;
    }
    
    
}
