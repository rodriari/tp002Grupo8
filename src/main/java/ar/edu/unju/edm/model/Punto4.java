package ar.edu.unju.edm.model;


import java.util.ArrayList;
import java.util.List;

public class Punto4{
    private List<Integer> num = new ArrayList<>() ;
    int POSICION;


    public int getPosicion() {
        return POSICION;
    }
    public void setPosicion(int posicion) {
        this.POSICION = posicion;
    }

    public String parimpar() {
        this.num.add(12);
        this.num.add(298);
        this.num.add(30000000);
        this.num.add(42);
        this.num.add(5);
        this.num.add(6434);
        this.num.add(77);
        this.num.add(84);

            if (num.get(POSICION)% 2 == 0) {
                return "par";
            } else {
                return "impar";
            }

    }
        }