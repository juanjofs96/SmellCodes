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
public class Escuela {
    private Estudiante est;

    public Escuela(Estudiante est) {
        this.est = est;
    }
    
    public void editarEstudiante(){
        est.setGrado(8);                        //se accede mediante los getters y setters creados
        int grado = est.getGrado();              
    }
}
