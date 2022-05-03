package ejercicio3.entidades.service;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> alumnosList = new ArrayList();

    public void creadorAlumnos() {
        String aux;

        do
        {
            System.out.print("Ingrese el nombre del alumno "); //Ingresando el nombre del alumno
            String nombr3 = leer.next();

            System.out.println(" ");

            ArrayList<Integer> notass = new ArrayList();
            for (int i = 1; i < 4; i++) //Ingresando las 3 notas
            {
                System.out.print("Ingrese la nota n°" + i + ": ");
                notass.add(leer.nextInt());
            }

            System.out.println(" ");

            alumnosList.add(new Alumno(nombr3, notass)); //Agregando los datos a el objeto alumno y al alumnoList 

            System.out.println("¿Desea agregar otro alumno? - Digite Si o No"); //Preguntando si quiere seguir con el bucle
            aux = leer.next().toUpperCase();

        } while (aux.equals("SI"));
        decisionMenu();
    }

    public void mostrarAlumnos() {

        System.out.println("Alumnos en la lista:");

        for (int i = 0; i < alumnosList.size(); i++)
        {
            System.out.print("Nombre: ");
            System.out.println(alumnosList.get(i).getNombre());
            System.out.print("Notas= ");
            System.out.println(alumnosList.get(i).getNotas());
            System.out.println("--------------------");
        }
        decisionMenu();
    }

    public void calcularPromedio() {

        System.out.print("Escriba el nombre del alumno a promediar: ");
        String aux = leer.next();

        for (int i = 0; i < alumnosList.size(); i++)
        {
            if (alumnosList.get(i).getNombre().equalsIgnoreCase(aux))
            {
                System.out.print("Nombre: ");
                System.out.println(alumnosList.get(i).getNombre());
                System.out.print("Promedio= ");
                float promedio = promedio = (alumnosList.get(i).getNotas().get(0) + alumnosList.get(i).getNotas().get(1)
                        + alumnosList.get(i).getNotas().get(2)) / 3;
                System.out.println("[" + promedio + "]");
                System.out.println("--------------------");

            }

        }
        decisionMenu();
    }

    public void menuInteractivo() {
        System.out.println("<-------------------->");
        System.out.println("Bienvenido al menu");
        System.out.println("1 - Agregar Alumnos");
        System.out.println("2 - Mostrar la lista de alumnos");
        System.out.println("3 - Calcular el promedio de un alumno");
        int var = leer.nextInt();

        switch (var)
        {
            case 1:
                creadorAlumnos();
                break;
            case 2:
                mostrarAlumnos();
                break;
            case 3:
                calcularPromedio();
                break;
            default:
                System.out.println("Opcion incorrecta, vuelva a escribir la opción");
        }

    }

    public void decisionMenu() {
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
