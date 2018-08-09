/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Despues;

/**
 *
 * @author JuanJose FS
 */
public class Suma {             //tecnica extraer variable
    private int a;
    private int b;
    
    public Suma(int a,int b) {
        this.a = a;
        this.b = b;
    }
    
    public void moduloMax(int c,int d){             //se separa la variable para que se explique por si sola
        double moduloMax1,moduloMax2;
        moduloMax1 = Math.pow(a, 2)+Math.pow(b, 2);
        moduloMax2 = Math.pow(c, 2)+Math.pow(d, 2);
        moduloMax1 = Math.pow(moduloMax1,0.5);
        moduloMax2 = Math.pow(moduloMax2,0.5);
        moduloMax1 = Math.max(moduloMax1,moduloMax2);
    }
}
