package ar.edu.unju.edm.model;

import java.util.ArrayList;

public class Punto3 {
    private String NOMBRE,APELLIDO;
    private long LIBRETA;
    private ArrayList<Integer> nota =new ArrayList<Integer>() ;
    public String getNombre() {
        return NOMBRE;
    }
    public void setNombre(String nombre) {
        this.NOMBRE = nombre;
    }
    public String getApellido() {
        return APELLIDO;
    }
    public void setApellido(String apellido) {
        this.APELLIDO = apellido;
    }
    public long getLibreta() {
        return LIBRETA;
    }
    public void setLibreta(long libreta) {
        this.LIBRETA = libreta;
    }
    public ArrayList<Integer> getNota() {
        return nota;
    }
    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public int calcularPromedio() {
        nota.add(8);
        nota.add(5);
        nota.add(4);
        nota.add(9);
        nota.add(10);
        int suma=0;
        for(int i:nota) {
            suma=suma+i;
        }
        suma=suma/5;
    return suma;
    }
    public int obtenerNotaMaxima() {
        int mayor=0;
        for(int i:nota) {
            if(i>mayor) {
                mayor=i;
            }
        }
        return mayor;
    }
}