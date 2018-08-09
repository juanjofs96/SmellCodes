/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Despues;

/**
 *
 * @author JuanJose FS
 */
public class PocosIf {                          //tecnica extraer metodo

    int a = 12;

    private void adelantar() {                  //se extrae el metodo contar 
        if (a < 12) {
            System.out.println("Hola 2");
        } else if (a < 13) {
            System.out.println("Hola 3");
        } else if (a < 14) {
            System.out.println("Hola 4");
        }
    }

    public void contar() {                  
        if (a < 11) {
            System.out.println("Hola");
        }
        adelantar();                        // se hace la llamada al metodo creado
        if (a < 9) {
            System.out.println("Hola 5");
        } else if (a < 10) {
            System.out.println("Hola 6");
        }
    }               // no se ven tantas sentencias if en el mismo metodo

}
