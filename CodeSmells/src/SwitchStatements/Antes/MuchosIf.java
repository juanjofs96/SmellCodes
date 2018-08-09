/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Antes;

/**
 *
 * @author JuanJose FS
 */
public class MuchosIf {

    int a = 12;

    public void contar() {                  // metodo con demasiadas sentencias if (else if)
        if (a < 11) {
            System.out.println("Hola");
        } else if (a < 12) {
            System.out.println("Hola 2");
        } else if (a < 13) {
            System.out.println("Hola 3");
        } else if (a < 14) {
            System.out.println("Hola 4");
        } else if (a < 9) {
            System.out.println("Hola 5");
        } else if (a < 10) {
            System.out.println("Hola 6");
        } 
    }
}
