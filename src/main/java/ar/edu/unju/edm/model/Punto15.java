package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Punto15{
  String NAME; 
  LocalDate FECHANACIMIENTO;

  public String getNombre() {
    return NAME;
  }

  public void setNombre(String Nombre) {
    this.NAME = Nombre;
  }

  public LocalDate getFechanac() {
    return FECHANACIMIENTO;
  }
  public void setFechanac(LocalDate fechanacimiento) {
    this.FECHANACIMIENTO = fechanacimiento;
  }

  public String anio(){
    String Edad2;
    Period Edad = Period.between(this.FECHANACIMIENTO, LocalDate.now());
    Edad2=String.format("%d años, %d meses y %d días",
    Edad.getYears(),
    Edad.getMonths(),
    Edad.getDays());
    return Edad2;
  }

  public String Horoscopo(){
    String Signo="",Dia,Mes;
    int Dia1;
    LocalDate Edad = this.FECHANACIMIENTO;
    Dia=String.valueOf(Edad.getDayOfMonth());
    Dia1=Integer.parseInt(Dia);
    Mes=String.valueOf(Edad.getMonth());
    switch(Mes){
      case "JANUARY":
        if(Dia1<=20){
          Signo="Capricornio";
        }else{
          Signo="Acuario";
        }
      break;
      case "FEBRUARY":
        if(Dia1<=19){
        Signo="Acuario";
        }else{
        Signo="Picis";
        }
      break;
      case "MARCH":
        if(Dia1<=20){
          Signo="Picis";
        }else{
          Signo="Aries";
        }
      break;
      case "APRIL":
        if(Dia1<=20){
          Signo="Aries";
        }else{
          Signo="Tauro";
        }
      break;
      case "MAY":
        if(Dia1<=20){
          Signo="Tauro";
        }else{
          Signo="Geminis";
        }
      break;
      case "JUNE":
        if(Dia1<=21){
          Signo="Geminis";
        }else{
          Signo="Cancer";
        }
      break;
      case "JULY":
      if(Dia1<=21){
        Signo="Cancer";
      }else{
        Signo="Leo";
      }
      break;
      case "AUGUST":
        if(Dia1<=23){
          Signo="Leo";
        }else{
          Signo="Virgo";
        }
      break;
      case "SEPTEMBER":
        if(Dia1<=23){
          Signo="Virgo";
        }else{
          Signo="Libra";
        }
      break;
      case "OCTOBER":
        if(Dia1<=22){
          Signo="Libra";
        }else{
          Signo="Escorpio";
        }
      break;
      case "NOVEMBER":
        if(Dia1<=22){
          Signo="Escorpio";
        }else{
          Signo="Sagitario";
        }
      break;
      case "DECEMBER":
        if(Dia1<=21){
          Signo="Sagitario";
        }else{
          Signo="Capricornio";
        }
      break;
    }
    return Signo;
  }
  public String Estacion(){
    String Estacion="",Dia,Mes;
    int Dia1;
    LocalDate Edad = this.FECHANACIMIENTO;
    Dia=String.valueOf(Edad.getDayOfMonth());
    Dia1=Integer.parseInt(Dia);
    Mes=String.valueOf(Edad.getMonth());
    switch(Mes){
      case "JANUARY":
        Estacion="Verano";
      break;
      case "FEBRUARY":
        Estacion="Verano";
      break;
      case "MARCH":
        if(Dia1>=21){
          Estacion="Otoño";
        }else{
          Estacion="Verano";
        }
      break;
      case "APRIL":
        Estacion="Otoño";
      break;
      case "MAY":
       Estacion="Otoño";
      break;
      case "JUNE":
        if(Dia1>=21){
          Estacion="Invierno";
        }else{
          Estacion="Otoño";
        }
      break;
      case "JULY":
        Estacion="Invierno";
      break;
      case "AUGUST":
        Estacion="Invierno";
      break;
      case "SEPTEMBER":
        if(Dia1>=21){
          Estacion="Primavera";
        }else{
          Estacion="Invierno";
        }
      break;
      case "OCTOBER":
       Estacion="Primavera";
      break;
      case "NOVEMBER":
       Estacion="Primavera";
      break;
      case "DECEMBER":
        if(Dia1>=21){
          Estacion="Verano";
        }else{
          Estacion="Primavera";
        }
      break;
    }
    return Estacion;
  }
}