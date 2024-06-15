package ar.edu.unju.fi.controller;

import ar.edu.unju.fi.collections.CarreraCollection;
import ar.edu.unju.fi.model.Carrera;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/carreras")
public class CarreraController {

    @GetMapping
    public String listarCarreras(Model model) {
        model.addAttribute("carreras", CarreraCollection.listar());
        return "carrera";
    }

    @PostMapping("/agregar")
    public String agregarCarrera(@ModelAttribute Carrera carrera) {
        CarreraCollection.agregar(carrera);
        return "redirect:/carreras";
    }

    @PostMapping("/modificar")
    public String modificarCarrera(@ModelAttribute Carrera carrera) {
        CarreraCollection.modificar(carrera);
        return "redirect:/carreras";
    }

    @GetMapping("/eliminar/{codigo}")
    public String eliminarCarrera(@PathVariable String codigo) {
        CarreraCollection.eliminar(codigo);
        return "redirect:/carreras";
    }
}
