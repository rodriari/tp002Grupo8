package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.Controller.punto3Controller;
import ar.edu.unju.edm.model.Punto3;

@Controller 
public class punto3Controller {
@GetMapping("/punto_3")
public String punto_3(Model model) {
    Punto3 p3 =new Punto3();
    p3.setNombre("El Chavo");
    p3.setApellido("Miley");
    p3.setLibreta(12);
     model.addAttribute("NOMBRE", p3.getNombre());
     model.addAttribute("APELLIDO", p3.getApellido());
     model.addAttribute("LIBRETA", p3.getLibreta());
     model.addAttribute("PROMEDIO", p3.calcularPromedio());
     model.addAttribute("MAXIMA", p3.obtenerNotaMaxima());
    return "punto-3";
}
}