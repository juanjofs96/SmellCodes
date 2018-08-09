/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass.Despues;

/**
 *
 * @author JuanJose FS
 */
public class Dispositivo{                               //tecnica extraer subclase
    protected int num;
    protected int medida;
    protected String descripcion;
                                                        //se quitaron atributos que se no son necesarios
    public Dispositivo(int num, int medida, String descripcion) {
        this.num = num;
        this.medida = medida;
        this.descripcion = descripcion;
    }

    
}
