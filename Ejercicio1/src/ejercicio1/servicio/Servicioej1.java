

package ejercicio1.servicio;

import java.util.ArrayList;
import java.util.Scanner;


public class Servicioej1 {
    
    ArrayList<String> razaPerros=new ArrayList();
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    

    
     public void creadorPerros(){
       
         String v;
         
            do
         {         

                System.out.println("-Ingrese una raza de perro");
                razaPerros.add(leer.next());
                System.out.println("--Desea ingresar otra raza?");
                v=leer.next();
                
         } while (v.equals("si"));

            
            
            System.out.println("Las razas de perros que ingreso son: ");
             for (String var : razaPerros)  {
                 System.out.print(" [" +var+ "] ");
         }
                
             
             
             
         }
            
            
            
            
            
            
            
            
        
        
    
    
    
    
    
    
    
    

}
