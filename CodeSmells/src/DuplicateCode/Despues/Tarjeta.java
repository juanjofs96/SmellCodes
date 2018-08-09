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
public abstract class Tarjeta {                 //tecnica extraer metodo + subir campo
    protected int codigo;
    protected String cliente;
    protected float saldo;

    public Tarjeta(int codigo, String cliente, float saldo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    public void cobrar(){               //se implementa el metodo en la super clase, no hay abstraccion
        if(saldo!=0){
            saldo--;
            System.out.println("Se ha cobrado");
        }
        System.out.println("No hay saldo");    
    } 
    
    
}
