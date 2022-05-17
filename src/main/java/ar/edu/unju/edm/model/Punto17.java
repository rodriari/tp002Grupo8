package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Punto17 {
  private LocalDate FECHA;
  private LocalDate FECHA1;
  private LocalTime TIEMPO;
  private LocalTime TIEMPO1;
  private LocalDateTime DATETIME;
  private LocalDateTime DATETIME1; 
 
  public Punto17() {
  }
  public Punto17(LocalDate Fecha, LocalDate Fecha1) {
    this.FECHA = Fecha;
    this.FECHA1 = Fecha1;
  }
  public Punto17(LocalTime Tiempo, LocalTime Tiempo1) {
    this.TIEMPO = Tiempo;
    this.TIEMPO1 = Tiempo1;
  }
  public Punto17(LocalDateTime DateTime, LocalDateTime DateTime1) {
    this.DATETIME = DateTime;
    this.DATETIME1 = DateTime1;
  }
  public void setFecha(LocalDate Fecha) {
	    this.FECHA = Fecha;
	  }
	  public LocalDate getFecha() {
	    return FECHA;
	  }
	  public void setFecha1(LocalDate Fecha1) {
	    this.FECHA1 = Fecha1;
	  }
	  public LocalDate getFecha1() {
	    return FECHA1;
	  }
	  public void setTiempo(LocalTime Tiempo) {
	    this.TIEMPO = Tiempo;
	  }
	  public LocalTime getTiempo() {
	    return TIEMPO;
	  }
	  public void setTiempo1(LocalTime Tiempo1) {
	    this.TIEMPO1 = Tiempo1;
	  }
	  public LocalTime getTiempo1() {
	    return TIEMPO1;
	  }
	  public void setDateTime(LocalDateTime DateTime) {
	    this.DATETIME = DateTime;
	  }
	  public LocalDateTime getDateTime() {
	    return DATETIME;
	  }
	  public void setDateTime1(LocalDateTime dateTime1) {
	    this.DATETIME1 = dateTime1;
	  }
	  public LocalDateTime getDateTime1() {
	    return DATETIME1;
	  }

	  public Period contarTiempoTranscurrido(){
	    Period Periodo = Period.between(this.FECHA,this.FECHA1);
	    return Periodo;
	  }

	  public String formatearFecha(LocalDate Fecha){
	    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String Formato = Fecha.format(Formatter);
	    return Formato;
	  }
	  public String compararFechas(){
		    String Fecha= formatearFecha(this.FECHA),Fecha1= formatearFecha(this.FECHA1),Mensaje;
		    if(Fecha.compareTo(Fecha1) > 0){
		      Mensaje="La fecha1 es anterior a fecha2";
		    }else{
		      if(Fecha.compareTo(Fecha1) < 0){
		        Mensaje="La fecha fecha1 es posterior a la fecha fecha2";
		      }else{
		        Mensaje="Las fechas son iguales";
		      }
		    }
		    return Mensaje;
		  }
		}