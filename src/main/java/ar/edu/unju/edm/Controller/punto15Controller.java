package ar.edu.unju.edm.Controller;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto15;

@Controller
public class punto15Controller{
	
  @GetMapping("/punto15")
  public String punto_15(@RequestParam ("anio") String Anio,@RequestParam ("nombre") String Nombre,Model model){
    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate Aux2=LocalDate.parse(Anio,Formatter);
        Punto15 Aux = new Punto15();
        Aux.setNombre(Nombre);
        Aux.setFechanac(Aux2);
    model.addAttribute("nombre", Nombre);
    model.addAttribute("edad", Aux.anio());
    model.addAttribute("Signo",Aux.Horoscopo());
    model.addAttribute("estacion",Aux.Estacion());
    return "punto-15";
  }

}