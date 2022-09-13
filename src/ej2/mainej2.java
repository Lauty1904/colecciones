/*
 *Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.

En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package ej2;

import ej2.alumno.alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ventas Electrouno
 */
public class mainej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<alumno> alumno = new ArrayList();

        String nombre;
        int nota;
        String rta;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Ingrese el nombre del alumno");
            alumno a1 = new alumno();
            nombre = read.next();

            a1.setNombre(nombre);
            System.out.println("Ingrese las notas del alumno: ");
            for (int i = 0; i < 3; i++) {
                nota = read.nextInt();
                a1.setLista(nota);
            }
            alumno.add(a1);
            System.out.println("Desea agregar otro alumno?.");
            rta = read.next();

        } while (rta.equals("si"));

        Iterator<alumno> obj= alumno.iterator();
        
        System.out.println("Ingrese un alumno a buscar en la lista: ");
        
        
        rta=read.next();
        
         //metodo para mostrar promedio de notas: 
        while(obj.hasNext()){
            alumno a1 = obj.next();
            
        if(a1.getNombre().equalsIgnoreCase(rta)){
            ArrayList<Integer> aux= new ArrayList();
            aux = a1.getLista();
            int suma=0;
            for (Integer notas : aux) {
                suma=notas+suma;
                
            }
            
            float notafinal=suma/3;
            System.out.println("Nota final: "+notafinal);
        }
    }
        for (alumno object : alumno) {
            System.out.println(object.getNombre()+" "+object.getLista());
        }
        
        
    }

}
