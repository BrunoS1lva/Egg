package ejercicio5.entidades.service;

import ejercicio5.entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Service {

    HashSet<Pais> hashPaises = new HashSet();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void creadorPaises() {
        String decision;
        do
        {
            System.out.println("Ingrese el nombre de un pais"); //Agregando paises
            String var = leer.next();
            Pais p = new Pais(var);
            hashPaises.add(p);

            System.out.println("¿Desea agregar otro País? / Digite Si o cualquier otra tecla para salir"); //Preguntando si quiere seguir agregando
            decision = leer.next();
       

        } while (decision.equalsIgnoreCase("SI"));
        
        decisionMenu();
    }

    public void mostrarPaises() {
        System.out.println("Paises en la lista");
        for (Pais var : hashPaises)
        {
            System.out.print("["+var.getNombresPaises()+"]");
        }
        decisionMenu();
    }

    public void eliminarPaises() {

        System.out.println("Ingrese el nombre del pais a eliminar"); //Ingresando el nombre del pais que quiero eliminar
        String var = leer.next();
        boolean v=false; //Creo un boolean para mostrar despues si encontre o no al pais

        Iterator<Pais> it = hashPaises.iterator(); //Creando el iterator
        while (it.hasNext())
        {
            if (it.next().getNombresPaises().equalsIgnoreCase(var)) //Recorriendo el HashSet de los paises
            { // Borramos si esta el pais 
                it.remove();
                System.out.println("Se ha eliminado al pais " + var);
                v = true;
            }
        }
        
        if (v=false) //Como no lo encontre en el for, declaro que no lo encontrre
            {
                System.out.println("No se ha encontrado al pais " + var);
            }
        decisionMenu();
    }

    public void menuInteractivo() {
        
        System.out.println("~M E N U~");
        System.out.println("1 ~ Agregar Paises");
        System.out.println("2 ~ Eliminar Paises");
        System.out.println("3 ~ Mostrar los Paises");
        System.out.println(" ");
        
        int aux = leer.nextInt();

        switch (aux)
        {
            case 1:
                creadorPaises();
                break;
            case 2:
                eliminarPaises();
                break;
            case 3:
                mostrarPaises();
                break;
            default:
                System.out.println("Error, vuelva a ingresar un numero");
        }
    }

    public void decisionMenu() {
        System.out.println(" ");
        System.out.println("Presiona 1 para volver al menu ~~ 0 para finalizar el programa");
        int var = leer.nextInt();

        if (var == 1)
        {
            menuInteractivo();
        } else
        {
            System.out.println("Adios :)");
            System.exit(0);
        }

    }

}
