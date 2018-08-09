/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest.Despues;

/**
 *
 * @author JuanJose FS
 */
public class Cable {                        //tecnica reemplazar herencia con delegacion
    private String medida;
    private float precio;
    private float grosor;
    private String uso;
    private String color;                   //aqui el color permita que un objeto pueda ser un cable azul
    
    //se elimino la herencia

    public Cable(String medida, float precio, float grosor, String uso, String color) {
        this.medida = medida;
        this.precio = precio;
        this.grosor = grosor;
        this.uso = uso;
        this.color = color;
    }
    
}
