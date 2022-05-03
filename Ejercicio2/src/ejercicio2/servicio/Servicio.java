package ejercicio2.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    ArrayList<String> razaPerros = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void creadorPerros() {

        String v;

        do
        {
            System.out.println("-Ingrese una raza de perro");
            razaPerros.add(leer.next());
            System.out.println("--Desea ingresar otra raza?");
            v = leer.next();

        } while (v.equals("si"));

        System.out.println("Las razas de perros que ingreso son: ");
        for (String var : razaPerros)
        {
            System.out.print(" [" + var + "] ");
        }

        System.out.println(" ");

    }

    public void eliminadorPerros() {

        String deletedp;
        boolean v = true;

        //ingreso el nombre del perro a eliminar
        System.out.println("Ingrese el perro a eliminar");
        deletedp = leer.next();
        System.out.println("Se eliminará a " + deletedp);

        //creo el iterator
        Iterator<String> it = razaPerros.iterator();

        //comienzo el iterator en busca del deletedp
        while (it.hasNext())
        {
            String aux = it.next();

            if (aux.equals(deletedp))
            {
                //lo elimino
                it.remove();
            } else
            {
                v = false;
            }
        }
        
        //como no encontre el perro, muestro un mensaje
        if (v = false)
        {
            System.out.println("No se ha encontrado a " + deletedp);
        }

        //muestro la lista que me quedo
        System.out.println("Las razas de perros restantes son: ");
        for (String var : razaPerros)
        {
            System.out.print(" [" + var + "] ");
        }
        
    }

}
