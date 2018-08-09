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
public class Telefono extends Dispositivo{          //se aplica herencia
    private String huella;
    private String inteligencia;
    private String chip;
    private String telefonica;                  //se pusieron los demas atributos

    public Telefono(String huella, String inteligencia, String chip, String telefonica, int num, int medida, String descripcion) {
        super(num, medida, descripcion);       
        this.huella = huella;
        this.inteligencia = inteligencia;
        this.chip = chip;
        this.telefonica = telefonica;
    }

}
