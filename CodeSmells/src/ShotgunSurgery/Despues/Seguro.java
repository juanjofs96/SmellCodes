/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.Despues;


/**
 *
 * @author JuanJose FS
 */
public class Seguro {
    public void aprobarSeguro(){
        if(Cuenta.validarSaldo()){          //se llama al metodo creado y se evita cambios en esta clase
            System.out.println("Seguro aprobado");
        }
        else{
            System.out.println("No hay seguro");
        }
    }
}
