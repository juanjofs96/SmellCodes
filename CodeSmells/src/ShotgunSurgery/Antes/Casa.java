/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShotgunSurgery.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Casa {
    public void comprar(){
        if(Cuenta.getSaldo()<1000){         //si hay cambio en condicion de saldo, afecta a esta clase
            System.out.println("No se puede comprar la casa. Fondos insuficientes");
        }
        else{
            System.out.println("Compra realizada");
        }
    }
}
