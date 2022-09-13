/*
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.

Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ventas Electrouno
 */
public class ej6Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> tienda = new HashMap();
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la funncion que desea utilizar: ");
        System.out.println("1- Agregar un producto ");
        System.out.println("2- Modificar precio de un producto ");
        System.out.println("3- Eliminar un producto");
        System.out.println("4- Mostrar todos los productos ingresados");
        Integer menu = read.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Ingrese el nombre y precio del producto: ");
                System.out.print("Producto: ");
                String producto = read.next();
                System.out.println("Precio: ");
                Integer precio = read.nextInt();
                tienda.put(producto, precio);
            case 2:
                System.out.println("Ingrese el producto que desea modificar el precio: ");
        }

    }

}
