/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.

Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.
 */
package ej5;

import ej5.classej5.Paises;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Ventas Electrouno
 */
public class ej5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TreeSet<Paises> paises = new TreeSet();

        Scanner read = new Scanner(System.in);

        String rta;

        do {
            Paises a1 = new Paises();
            System.out.println("Ingrese paises para agregar a la lista: ");
            a1.setPaises(read.nextLine());

            System.out.println("¿Desea agregar otro pais? si/no");
            rta = read.nextLine();
            paises.add(a1);
        } while (rta.equalsIgnoreCase("si"));

        System.out.println("Paises ingresados por orden alfabetico: ");

        paises.forEach((aux) -> {
            System.out.println(aux);
        });

        System.out.println("Ingrese un pais que desee eliminar:");

        Iterator<Paises> orden = paises.iterator();

        String elim = read.next();

        while (orden.hasNext()) {
            if (orden.next().toString().equals(elim)) {
                orden.remove();
                System.out.println("Pais eliminado");
            }
        }

        System.out.println("Paises restantes: ");

        paises.forEach((p) -> {
            System.out.println(p);
        });

    }

}
