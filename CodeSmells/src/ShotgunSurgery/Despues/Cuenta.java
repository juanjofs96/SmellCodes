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
public class Cuenta {                   //tecnica extraer metodo
    private static float saldo;
    
    public static boolean validarSaldo(){           //se creo este metodo que sera llamado en los metodos de las demas clases
        if(saldo < 1000){           //cambios futuros a condicion serian solo aqui
            return false;
        }
        return true;
    }
}
