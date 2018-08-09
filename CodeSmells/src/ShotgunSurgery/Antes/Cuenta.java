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
public class Cuenta {
    private static float saldo;             //atributo que provocara los futuros cambios

    public static float getSaldo() {
        return saldo;
    }

    public static void setSaldo(float saldo) {
        Cuenta.saldo = saldo;
    }
    
}
