/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.Despues;

/**
 *
 * @author JuanJose FS
 */
public class LongDespues {                          //tecnica extraer metodo
    int a=0;
    int b = 5;
    
    private void prepararse(){                      //se toma una parte del metodo saltar y se crea el metodo prepararse
        for(a=0; a< 25;a++){
            System.out.println("hola");
        }
        while(a!=50){
            System.out.println("HOLA");
            System.out.println("El es el estudiante "+ a);
            System.out.println("Este es ejemplo");
            
            a++;
        }
    }
    
    public void saltar(){
        prepararse();                               //se hace la llamada al metodo creado
        if(a==b){
            System.out.println("Hello");
        }else if(a>b){
            System.out.println("Hello2");
        }
        else{
            System.out.println("Adios");
        }
    }
}
