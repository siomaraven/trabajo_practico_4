package ar.edu.unju.fi.controller;


import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.model.Docente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/docentes")
public class DocenteController {
	
	@GetMapping
    public String listarDocentes(Model model) {
        model.addAttribute("docentes", DocenteCollection.listar());
        return "docentes";
    }
	
    @PostMapping("/agregar")
    public String agregarDocente(@ModelAttribute Docente docente) {
        DocenteCollection.agregar(docente);
        return "redirect:/docentes";
    }

    @PostMapping("/modificar")
    public String modificarDocente(@ModelAttribute Docente docente) {
        DocenteCollection.modificar(docente);
        return "redirect:/docentes";
    }
    
    @GetMapping("/eliminar/{legajo}")
    public String eliminarDocente(@PathVariable int legajo) {
        DocenteCollection.eliminar(legajo);
        return "redirect:/docentes";
    }
}
