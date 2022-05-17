package ar.edu.unju.edm.model;

import java.util.ArrayList;

public class Punto6 {
  ArrayList<Integer> NUMEROS = new ArrayList<Integer>();
  int aux;
  public void setAux(int aux) {
    this.aux = aux;
  }
  public int getAux() {
    return aux;
  }
  public ArrayList<Integer> Reverso(){
    ArrayList<Integer> inv = new ArrayList<Integer>();
    NUMEROS.add(14);
    NUMEROS.add(29);
    NUMEROS.add(33);
    NUMEROS.add(40);
    NUMEROS.add(58);
    NUMEROS.add(61);
    NUMEROS.add(75);
    NUMEROS.add(82);
    NUMEROS.add(97);
    NUMEROS.add(110);
    for(int i=NUMEROS.size()-1;i>=0;i--){
      inv.add(NUMEROS.get(i));
    }
    return inv;
  }
}