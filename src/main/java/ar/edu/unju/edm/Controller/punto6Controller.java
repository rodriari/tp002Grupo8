package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto6;

@Controller
public class punto6Controller {
  @GetMapping("/punto_6")
  public String getpunto6(Model model){
    Punto6 num = new Punto6();
    model.addAttribute("inv",num.Reverso());
    return "punto-6";
  }
}