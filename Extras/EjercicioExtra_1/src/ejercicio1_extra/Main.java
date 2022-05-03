package ejercicio1_extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author bru
 */
public class Main {

    public static void main(String[] args) {

//        1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//        los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//        introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//        programa mostrará por pantalla el número de valores que se han leído, su suma y su
//        media (promedio)
        ArrayList<Integer> listaNumeros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int var = 0;

        do {
            System.out.print("Ingrese un numero: "); //Ingresando el numero
            var = leer.nextInt();

            if (var == -99) {
                break;
            } else {
                listaNumeros.add(var); //Añadiendo el numero al ArrayList
            }

        } while (var != (-99)); //Si el numero ingresado es -99 se cierra el bucle

        System.out.println("La LISTA de numeros contiene: "); //Mostrando la lista con todos los numeros
        for (Integer aux : listaNumeros) {
            System.out.print("[" + aux + "]");
        }
        System.out.println("");

        int resultado = listaNumeros.get(0); //Guardo el primer valor de la lista para posteriormente sumarlo con el siguiente en el for
        for (int i = 1; i < listaNumeros.size(); i++) {

            resultado += listaNumeros.get(i);

        }
        System.out.println(" ");
        System.out.println("La SUMA de todos los numeros en la lista da como resultado: " + resultado); //Mostrando el resultado de la suma
        System.out.println("~~~~~~~~");
        
        int promedio=resultado/listaNumeros.size();
        System.out.println("El PROMEDIO entre todos los numeros equivale a: " +promedio);
        System.out.println("~~~~~~~~");

    }

}
