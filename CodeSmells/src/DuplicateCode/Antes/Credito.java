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
public class Credito extends Tarjeta{

    public Credito(int codigo, String cliente, float saldo) {
        super(codigo, cliente, saldo);
    }
    
    @Override
    void cobrar() {             //codigo cobrar repetido en debito
        if(saldo!=0){
            saldo--;
            System.out.println("Se ha cobrado");
        }
        System.out.println("No hay saldo");
    }
}
