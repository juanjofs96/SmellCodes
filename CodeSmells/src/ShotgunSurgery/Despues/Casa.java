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
public class Casa {
    public void comprar(){
        if(Cuenta.validarSaldo()){      //se llama el metodo creado y se evita cambios en esta clase
            System.out.println("Compra realizada");
        }
        else{
            System.out.println("No se pudo realizar la cuenta. Fondos insuficientes");
        }
    }
}
