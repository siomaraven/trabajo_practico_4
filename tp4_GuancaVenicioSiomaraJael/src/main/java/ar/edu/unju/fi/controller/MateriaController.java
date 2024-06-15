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

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	@GetMapping
	public String listarMaterias(Model model) {
		model.addAttribute("materias", MateriaCollection.listar());
		return "materia";
	}
	
	@PostMapping("/agregar")
    public String agregarMateria(@ModelAttribute Materia materia) {
        MateriaCollection.agregar(materia);
        return "redirect:/materias";
    }
	
    @PostMapping("/modificar")
    public String modificarMateria(@ModelAttribute Materia materia) {
        MateriaCollection.modificar(materia);
        return "redirect:/materias";
    }
    
	@GetMapping("/eliminar/{codigo}")
    public String eliminarMateria(@PathVariable String codigo) {
		MateriaCollection.eliminar(codigo);
		return "redirect:/materias";
	}
}
