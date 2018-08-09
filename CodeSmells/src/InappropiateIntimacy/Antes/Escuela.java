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
public class Escuela {
    private Estudiante est;

    public Escuela(Estudiante est) {
        this.est = est;
    }
    
    public void editarEstudiante(){
        int grado = est.grado;              //se accede directamente al grado del estudiante
    }
}
