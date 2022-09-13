/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.alumno;

import java.util.ArrayList;


/**
 *
 * @author Ventas Electrouno
 */
public class alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    public alumno() {
        this.notas = new ArrayList();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getLista() {
        return notas;
    }

    public void setLista(Integer nota) {
      notas.add(nota) ;
    }

  
    
    
}
