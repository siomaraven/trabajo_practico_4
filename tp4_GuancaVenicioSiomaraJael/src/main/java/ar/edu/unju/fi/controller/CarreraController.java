package ar.edu.unju.fi.controller;

import ar.edu.unju.fi.collections.CarreraCollection;
import ar.edu.unju.fi.model.Carrera;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/carrera")
public class CarreraController {
	 @GetMapping("/listar")
	    public String listarCarreras(Model model) {
	        List<Carrera> carreras = CarreraCollection.listarCarreras();
	        model.addAttribute("carreras", carreras);
	        return "listarCarreras"; // nombre de la vista
	    }

	    @GetMapping("/form")
	    public String mostrarFormularioCarrera(Model model) {
	        model.addAttribute("carrera", new Carrera());
	        return "formCarrera"; // nombre de la vista
	    }

	    @PostMapping("/agregar")
	    public String agregarCarrera(@ModelAttribute Carrera carrera) {
	        CarreraCollection.agregarCarrera(carrera);
	        return "redirect:/carrera/listar";
	    }

	    @GetMapping("/eliminar/{codigo}")
	    public String eliminarCarrera(@PathVariable String codigo) {
	        CarreraCollection.eliminarCarrera(codigo);
	        return "redirect:/carrera/listar";
	    }

	    @PostMapping("/modificar")
	    public String modificarCarrera(@ModelAttribute Carrera carrera) {
	        CarreraCollection.modificarCarrera(carrera);
	        return "redirect:/carrera/listar";
	    }
}
