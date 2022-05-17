package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto4;

@Controller
public class punto4Controller {
@GetMapping("/punto_4")
public String punto_4(Model model) {
    Punto4 p4=new Punto4();
    p4.setPosicion(0);
    model.addAttribute("numero1", p4.parimpar());
    p4.setPosicion(1);
    model.addAttribute("numero2", p4.parimpar());
    p4.setPosicion(2);
    model.addAttribute("numero3", p4.parimpar());
    p4.setPosicion(3);
    model.addAttribute("numero4", p4.parimpar());
    p4.setPosicion(4);
    model.addAttribute("numero5", p4.parimpar());
    p4.setPosicion(5);
    model.addAttribute("numero6", p4.parimpar());
    p4.setPosicion(6);
    model.addAttribute("numero7", p4.parimpar());
    p4.setPosicion(7);
    model.addAttribute("numero8", p4.parimpar());

    return "punto-4";
}

}

