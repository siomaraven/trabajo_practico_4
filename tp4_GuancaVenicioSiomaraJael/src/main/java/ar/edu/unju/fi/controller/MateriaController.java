package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.collections.*;
import ar.edu.unju.fi.model.*;

import java.util.List;

@Controller
@RequestMapping("/materia")
public class MateriaController {
	
	@GetMapping("/listar")
	public String listarMaterias(Model model) {
		List<Materia> materias = MateriaCollection.listarMaterias();
		model.addAttribute("materias", materias);
		return "listarMaterias";
	}
	
	@GetMapping("/form")
    public String mostrarFormularioMateria(Model model) {
        model.addAttribute("materia", new Materia());
        return "formMateria"; // nombre de la vista
	}
	
	@PostMapping("/agregar")
    public String agregarMateria(@ModelAttribute Materia materia) {
        MateriaCollection.agregarMateria(materia);
        return "redirect:/materia/listar";
    }
	
	@GetMapping("/eliminar/{codigo}")
    public String eliminarMateria(@PathVariable String codigo) {
        MateriaCollection.eliminarMateria(codigo);
        return "redirect:/materia/listar";
    }

    @PostMapping("/modificar")
    public String modificarMateria(@ModelAttribute Materia materia) {
        MateriaCollection.modificarMateria(materia);
        return "redirect:/materia/listar";
    }
	
}
