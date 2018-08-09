/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Despues;

/**
 *
 * @author JuanJose FS
 */
public class Banco {
    public void crearCuenta(Persona p){         //se acceden a los datos de la persona mediante getters y setters
        System.out.println(p.getCedula());
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
    }
}
