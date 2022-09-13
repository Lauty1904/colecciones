/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.claseC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ventas Electrouno
 */
public class coleccionesC {
    private String nombre;
    private String apellido;
    private ArrayList<String> lista;

    public coleccionesC() {
        this.lista = new ArrayList();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    Scanner read=new Scanner(System.in);
    public void generar(){
        System.out.println("Ingrese el nombre de la persona: ");
     this.nombre=read.next();
        System.out.println("Ingrese el apellido de la persona: ");
     this.apellido=read.next();
     
      String datos=(nombre+" "+apellido);
      lista.add(datos);
    }
  
   public void mostrarmascota(){
        System.out.println("Nombres introducidos: ");
       for (String aux : lista) {
           
           System.out.println(aux);
       }
   }
    
}
