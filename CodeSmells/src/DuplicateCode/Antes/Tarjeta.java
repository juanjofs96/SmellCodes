/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Antes;

/**
 *
 * @author JuanJose FS
 */
public abstract class Tarjeta {
    protected int codigo;
    protected String cliente;
    protected float saldo;

    public Tarjeta(int codigo, String cliente, float saldo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    abstract void cobrar();         //metodo cobrar abstracto para que sea implementado en subclases
    
}
