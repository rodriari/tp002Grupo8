package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto5;

@Controller
public class punto5Controller {
  @GetMapping("/punto_5")
  public String getPunto(Model model){
    Punto5 revers = new Punto5();
    revers.setAux("BUENAAAAAAAASSSSSSSSS");
    model.addAttribute("Nombre", revers.getAux());
    model.addAttribute("Invertida",revers.Reverso());
    return "punto-5";
  }
}