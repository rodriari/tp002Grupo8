package ar.edu.unju.edm.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto17;

@Controller
public class punto17Controller {
  @GetMapping("/punto17")
  public String getpunto17(Model model){
    Punto17 PF1 =new Punto17();
    PF1.setFecha(LocalDate.now());
    PF1.setFecha1(LocalDate.of(2003, 8, 14));
    model.addAttribute("fecha1", PF1.getFecha());
    model.addAttribute("fecha2", PF1.getFecha1());
    Punto17 PF2 =new Punto17();
    PF2.setTiempo(LocalTime.of(00, 05, 12));
    PF2.setTiempo1(LocalTime.now());
    LocalTime Aux=PF2.getTiempo(),Aux2=PF2.getTiempo1();
    model.addAttribute("time1", Aux.plusHours(8));
    model.addAttribute("time2", Aux2.minusMinutes(12));
    model.addAttribute("comparar", PF1.compararFechas());
    Punto17 PF3 = new Punto17();
    PF3.setDateTime(LocalDateTime.of(PF1.getFecha(), PF2.getTiempo()));
    PF3.setDateTime1(LocalDateTime.of(PF1.getFecha1(), PF2.getTiempo1()));
    model.addAttribute("datetime", PF3.getDateTime());
    model.addAttribute("datetime2", PF3.getDateTime1());
    Punto17 PF4 = new Punto17();
    PF4.setFecha(LocalDate.of(2004, 04, 02));
    PF4.setFecha1(LocalDate.now());
    String Aux3= PF4.formatearFecha(PF4.getFecha());
    String Aux4= PF4.formatearFecha(PF4.getFecha1());
    Period Edad = PF4.contarTiempoTranscurrido();
    String Edad2=String.format("Han transcurrido %d años, %d meses y %d días desde la fecha " + Aux3 + " hasta la fecha " + Aux4,
    Edad.getYears(),
    Edad.getMonths(),
    Edad.getDays());
    model.addAttribute("edad", Edad2);
    String Aux5="16/05/2022";
    Punto17 PF5 = new Punto17();
    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    PF5.setFecha1(LocalDate.parse(Aux5,Formatter));
    model.addAttribute("anio", PF5.getFecha1().plusDays(365));
    String Aux6="25/11/2020";
    PF5.setFecha1(LocalDate.parse(Aux6,Formatter));
    model.addAttribute("meses", PF5.getFecha1().plusMonths(8));
    return "punto-17";
  }
}