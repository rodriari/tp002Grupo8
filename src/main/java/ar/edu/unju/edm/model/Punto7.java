package ar.edu.unju.edm.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Punto7 {
  ArrayList<String> Champ = new ArrayList<>();
  int i;

  public void setI(int i) {
    this.i = i;
  }

  public int getI() {
    return i;
  }

  public ArrayList<String> par(){
    ArrayList<String> Champs = new ArrayList<String>();
    Champ.add("Irelia");
    Champ.add("Akali");
    Champ.add("Sylas");
    Champ.add("Anivia");
    Champ.add("Lee Seen");
    Champ.add("Teemo");
    int aux=Champ.size();
    for(int i=0;i<aux;i++){
    	Champs.add(Champ.get(i));
    }
    return Champs;
  }

  public ArrayList<String> borrar(){
    if(this.i<=Champ.size()){
    	Champ.remove(this.i);
    }
    return Champ;
  }

  public int cantidad(){
    int cantidad=Champ.size();
    return cantidad;
  }
}