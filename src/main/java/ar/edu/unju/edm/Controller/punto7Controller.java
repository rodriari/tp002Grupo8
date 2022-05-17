package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto7;

@Controller
public class punto7Controller {
  @GetMapping("/punto_7")
  public String getpunto6(Model model){
    Punto7 Champ = new Punto7();
    model.addAttribute("par",Champ.par());
    Champ.setI(4);
    model.addAttribute("borrar", Champ.borrar());
    model.addAttribute("cantidad",Champ.cantidad());
    return "Punto-7";
  }
}