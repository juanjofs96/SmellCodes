/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongMethod.Antes;

/**
 *
 * @author JuanJose FS
 */
public class LongAntes {
    int a=0;
    int b = 5;
    
    public void saltar(){
        for(a=0; a< 25;a++){
            System.out.println("hola");
        }
        while(a!=50){
            System.out.println("HOLA");
            System.out.println("El es el estudiante "+ a);
            System.out.println("Este es ejemplo");
            
            a++;
        }
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
