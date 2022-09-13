/*
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
 */
package colecciones;

import colecciones.claseC.coleccionesC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ventas Electrouno
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coleccionesC a1=new coleccionesC();
     String razas;
     ArrayList<String> lista=new ArrayList();
     String respuesta;
     String elim;
     
     Scanner read=new Scanner(System.in);
     
    do{System.out.println("Ingrese la raza de un perro: "); 
    razas=read.next();
    lista.add(razas);
        System.out.println("Desea agregar otra? (si/no)");
    respuesta=read.next();
    
    }while(respuesta.equals("si"));     
        System.out.println("Razas ingresadas: ");
        lista.forEach((aux) -> {
            System.out.println(aux);
        });
    
    System.out.println("Ingrese una raza para eliminar de la lista: ");
    elim=read.next();
    Iterator contador = lista.iterator();
    
    while(contador.hasNext()){
        if(contador.next().equals(elim)){
        System.out.println("Su raza fue eliminada.");
    contador.remove();}
    }
    
    Collections.sort(lista);
        System.out.println("Lista ordenada: ");
     lista.forEach((aux) -> {
            System.out.println(aux);});
    
   
    
    }
    
   
    
}
