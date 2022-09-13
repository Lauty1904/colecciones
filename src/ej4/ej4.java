/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

19
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ej4;

import ej4.peliculas.peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Ventas Electrouno
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String rta;

        ArrayList<peliculas> peli = new ArrayList();

        Comparator<peliculas> compN = new Comparator<peliculas>() {
            @Override
            public int compare(peliculas t, peliculas t1) {
                return t.getNombre().compareTo(t1.getNombre());
            }
        };

        Comparator<peliculas> compD = new Comparator<peliculas>() {
            @Override
            public int compare(peliculas t, peliculas t1) {
                return t1.getDirector().compareTo(t.getDirector());
            }
        };
        Comparator<peliculas> compDd = new Comparator<peliculas>() {
            @Override
            public int compare(peliculas t, peliculas t1) {
                return t.getDuracion().compareTo(t1.getDuracion());
            }
        };
        Comparator<peliculas> compDm = new Comparator<peliculas>() {
            @Override
            public int compare(peliculas t, peliculas t1) {
                return t1.getDuracion().compareTo(t.getDuracion());
            }
        };

        Scanner read = new Scanner(System.in);
        //pedimos los datos al usuario
        do {
            peliculas a1 = new peliculas();
            System.out.println("Ingrese el titulo de la pelicula: ");

            String nombre;
            nombre = read.nextLine();
            a1.setNombre(nombre);
            System.out.println("Ingresa el director de la pelicula: ");

            String director = read.nextLine();
            a1.setDirector(director);
            System.out.println("Ingrese la duracion en hs de la pelucula: ");

            float duracion = read.nextFloat();
            a1.setDuracion(duracion);
            System.out.println("Desea ingresar otra pelicula? (si/no)");
            rta = read.next();
            peli.add(a1);
        } while (rta.equalsIgnoreCase("si"));

        System.out.println("");

        //Mostramos las peliculas ingresadas: 
        System.out.println("Peliculas ingresadas : ");
        for (peliculas aux : peli) {
            System.out.println("Nombre de la pelicula: " + aux.getNombre());
            System.out.println("Nombre del director: " + aux.getDirector());
            System.out.println("Duracion: " + aux.getDuracion() + "Hs");
        }
        //Mostramos las pelis que duran mas de una hora: 
        System.out.println("");
        System.out.println("Peliculas ingresadas mayor de una hora: ");
        for (peliculas aux : peli) {
            if (aux.getDuracion() > 1) {
                System.out.println("Nombre de la pelicula: " + aux.getNombre());
                System.out.println("Nombre del director: " + aux.getDirector());
                System.out.println("Duracion: " + aux.getDuracion() + "Hs");
            }
        }

        System.out.println("");
        System.out.println("Orden por duracion de mayor a menor: ");
        Collections.sort(peli, compDm);
        for (peliculas aux : peli) {

            System.out.println("Nombre de la pelicula: " + aux.getNombre());
            System.out.println("Nombre del director: " + aux.getDirector());
            System.out.println("Duracion: " + aux.getDuracion() + "Hs");
        }
        System.out.println("");
        System.out.println("Orden por duracion de menor a mayor ");
        Collections.sort(peli, compDd);
        for (peliculas aux : peli) {

            System.out.println("Nombre de la pelicula: " + aux.getNombre());
            System.out.println("Nombre del director: " + aux.getDirector());
            System.out.println("Duracion: " + aux.getDuracion() + "Hs");
        }
        System.out.println("");
        System.out.println("Orden por titulo alfabeticamente: ");
        Collections.sort(peli, compN);
        for (peliculas aux : peli) {

            System.out.println("Nombre de la pelicula: " + aux.getNombre());
            System.out.println("Nombre del director: " + aux.getDirector());
            System.out.println("Duracion: " + aux.getDuracion() + "Hs");
        }
        System.out.println("");
        System.out.println("Orden por Director de alfabeticamente: ");
        Collections.sort(peli, compD);
        for (peliculas aux : peli) {

            System.out.println("Nombre la pelicula: " + aux.getNombre());
            System.out.println("Nombre del director: " + aux.getDirector());
            System.out.println("Duracion: " + aux.getDuracion() + "Hs");
        }

    }

}
