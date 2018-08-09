/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Antes;

/**
 *
 * @author JuanJose FS
 */
public class Banco {
    public void crearCuenta(Persona p){         //se acceden a los datos de la persona de manera directa sin getters y setters
        System.out.println(p.cedula);
        System.out.println(p.nombre);
        System.out.println(p.edad);
    }
}
