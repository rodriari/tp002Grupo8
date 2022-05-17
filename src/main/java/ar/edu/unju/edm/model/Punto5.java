package ar.edu.unju.edm.model;

public class Punto5 {
	  String Aux;

	  public void setAux(String aux) {
	    this.Aux = aux;
	  }
	  public String getAux() {
	    return Aux;
	  }

	  public String Reverso(){
	    char[] inv = new char[100];
	    int cont=0;
	    for(int i=this.Aux.length()-1;i>=0;i--){
	      inv[cont]= Aux.charAt(i);
	      cont++;
	    }
	    String aux2=String.copyValueOf(inv);
	    return aux2;
	  }
	}