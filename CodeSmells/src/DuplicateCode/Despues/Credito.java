/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Despues;


/**
 *
 * @author JuanJose FS
 */
public class Credito extends Tarjeta{
    private int credito;
    
    public Credito(int codigo, String cliente, float saldo) {
        super(codigo, cliente, saldo);
    }
    
}
