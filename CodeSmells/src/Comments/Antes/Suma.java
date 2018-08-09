/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Suma {
    private int a;
    private int b;
    
    public Suma(int a,int b) {
        this.a = a;
        this.b = b;
    }
    
    public void moduloMax(int c,int d){             //metodo que tiene una variable dificil de entender
        double moduloMax=0;
        moduloMax = Math.max(Math.pow(Math.pow(a, 2)+Math.pow(b, 2),0.5),(Math.pow(Math.pow(c, 2)+Math.pow(d, 2),0.5)));
        //se saca el modulo entre a y b
        //a al cuadrado + b al cuadrado
        //raiz cuadrada de ese resultado
        //mismo procedimiento para c y d
        //al final se usa la funcion max
    }
    
}
