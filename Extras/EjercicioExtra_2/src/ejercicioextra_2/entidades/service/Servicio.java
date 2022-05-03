package ejercicioextra_2.entidades.service;

import ejercicioextra_2.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();

    public void creadorFamosos() {

        System.out.println("Ingrese el nombre del artista.");
        String nombre = leer.next();
        System.out.println("Ingrese el nombre del Disco con más ventas");
        String disco = leer.next();

        listaCantantes.add(new CantanteFamoso(nombre, disco));
        decisionMenu();
    }

    public void mostrarFamosos() {
        System.out.println("Lista de cantantes con su disco más vendido.");
        for (CantanteFamoso var : listaCantantes)
        {
            System.out.print("Artista: ");
            System.out.println(var.getNombre());
            System.out.print("Disco más vendido: ");
            System.out.println(var.getDiscoConMasVentas());
            System.out.println(" ");
        }
        decisionMenu();
    }

    public void killerFamosos() {

        System.out.print("Ingrese el nombre del artista a eliminar: ");
        String kill = leer.next();

        for (int i = 0; i < listaCantantes.size(); i++)
        {
            String x = listaCantantes.get(i).getNombre();
            if (x.equalsIgnoreCase(kill))
            {
                listaCantantes.remove(i);
                System.out.println("El cantante " + kill + " ha sido eliminado satisfactoriamente.");
                break;
            }

        }
        decisionMenu();
    }

    public void menuInteractivo() {
        System.out.println("Bienvenido al menu: ");
        System.out.print("~1~ Agregar un artista |");
        System.out.print("~2~ Mostrar la lista de artistas |");
        System.out.print("~3~ Eliminar a un artista de la lista |");
        System.out.println(" ");
        int aux = leer.nextInt();

        switch (aux)
        {

            case 1:
                creadorFamosos();
                break;
            case 2:
                mostrarFamosos();
                break;
            case 3:
                killerFamosos();
                break;
            default:
                System.out.println("Error, digite nuevamente.");
        }
    }

    public void decisionMenu() {

        System.out.println("~~~~~~~~~~");
        System.out.println("Digite ~0~ para finalizar con el programa.");
        System.out.println("Digite ~1~  para volver al Menú.");
        int var = leer.nextInt();

        if (var == 1)
        {
            menuInteractivo();
        } else
        {
            System.out.println("Adiós :)))");
            System.exit(0);
        }

    }

}
