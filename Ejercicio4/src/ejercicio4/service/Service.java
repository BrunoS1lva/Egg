package ejercicio4.service;

import ejercicio4.atributos.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Service implements Comparator<Pelicula> {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String menu = null;
    List<Pelicula> peliculas = new ArrayList<>();
    List<Integer> contadorDuracion = new ArrayList<>();
    String decision = "no";

    public void creadorPeliculas() {

        do
        {
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo_ = leer.next();

            System.out.println("Ingrese el nombre del Director de la pelicula");
            String director_ = leer.next();

            System.out.println("¿Cuantas horas dura la pelicula?");
            int duracion_ = leer.nextInt();
            contadorDuracion.add(duracion_);

            Pelicula p = new Pelicula(titulo_, director_, duracion_);
            peliculas.add(p);

            System.out.println("-----¿Desea agregar otra pelicula?-----");
            decision = leer.next().toUpperCase();
        } while (decision.equals("SI"));
    }

    public void menuInteractivo() {
        int var = 0;
        int auxxx = 1;
        do
        {
            System.out.println("***********************");
            System.out.println("Bienvenido al menu");
            System.out.println("***********************");

            System.out.println("Eliga una opcion:");
            System.out.println("Opcion 1 " + " Mostrar en pantalla todas las películas");
            System.out.println("Opcion 2 " + " Mostrar en pantalla todas las películas con una duración mayor a 1 hora");
            System.out.println("Opcion 3 " + " Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo"
                    + "en pantalla.");
            System.out.println("Opcion 4 " + " Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo"
                    + "en pantalla.");
            System.out.println("Opcion 5 " + " Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.");
            System.out.println("Opcion 6 " + " Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla");
            var = leer.nextInt();

            switch (var)
            {
                case 1: //mostrando los datos que contiene la lista de peliculas
                    System.out.println(" ");
                    System.out.println("Cartelera: ");
                    for (Pelicula aux : peliculas)
                    {
                        System.out.println(aux);
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Peliculas con una duracion mayor a 2hs");
                    System.out.println(" ");
                    //Cree un ArrayList solamente que contiene la duracion de cada pelicula y verifico que tenga mas de 1, como los arraylist estan acomodados puedo usar esta lista sin tener que enlazarla a la List de peliculas
                    for (int i = 0; i < peliculas.size(); i++)
                    {
                        if (contadorDuracion.get(i) > 1)
                        {
                            System.out.println(peliculas.get(i));
                        }
                    }
                    System.out.println("");
                    break;

                case 3: //Mostrando los datos por la duracion de mayor a menor
                    System.out.println(" ");
                    System.out.println("Cartelera ordenada por duracion mayor a menor: ");
                    Collections.sort(peliculas, new Comparator<Pelicula>() {
                        @Override
                        public int compare(Pelicula p2, Pelicula p1) {
                            return new Integer(p2.getDuracion()).compareTo(p1.getDuracion());
                        }
                    });
                    Collections.reverse(peliculas);
                    for (Pelicula auxiliar : peliculas)
                    {
                        System.out.println(auxiliar);
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    //Mostrando los datos por la duracion de menor a mayor
                    System.out.println(" ");
                    System.out.println("Cartelera ordenada por duracion menor  a mayor: ");
                    Collections.sort(peliculas, new Comparator<Pelicula>() {
                        @Override
                        public int compare(Pelicula p1, Pelicula p2) {
                            return new Integer(p1.getDuracion()).compareTo(p2.getDuracion());
                        }
                    });
                    for (Pelicula auxiliar : peliculas)
                    {
                        System.out.println(auxiliar);
                    }
                    System.out.println(" ");
                    break;
                case 5: //Mostrando los datos por titulo alfabeticamente
                    System.out.println(" ");
                    System.out.println("Cartelera ordenada por titulo alfabeticamente");
                    Collections.sort(peliculas, new Comparator<Pelicula>() {
                        @Override
                        public int compare(Pelicula p1, Pelicula p2) {
                            return p1.getTitulo().compareTo(p2.getTitulo());
                        }
                    });
                    for (Pelicula auxiliar : peliculas)
                    {
                        System.out.println(auxiliar);
                    }
                    System.out.println(" ");
                    break;
                case 6://Mostrando los datos por Director alfabeticamente
                    System.out.println(" ");
                    System.out.println("Cartelera ordenada por titulo alfabeticamente");
                    Collections.sort(peliculas, new Comparator<Pelicula>() {
                        @Override
                        public int compare(Pelicula p1, Pelicula p2) {
                            return p1.getDirector().compareTo(p2.getDirector());
                        }
                    });
                    for (Pelicula auxiliar : peliculas)
                    {
                        System.out.println(auxiliar);
                    }
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelva a intentarlo");
            }
            System.out.println("Desea volver al menu?");
            System.out.println("1 - Para volver al menu");
            System.out.println("0 - Para finalizar con el programa");
            auxxx = leer.nextInt();

        } while (auxxx == 1);
        System.out.println("Adios :)");
    }


    @Override
    public int compare(Pelicula t, Pelicula t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
