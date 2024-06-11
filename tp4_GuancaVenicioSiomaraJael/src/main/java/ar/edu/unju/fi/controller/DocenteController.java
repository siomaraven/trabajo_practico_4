package ar.edu.unju.fi.controller;


import ar.edu.unju.fi.collections.DocenteCollection;
import ar.edu.unju.fi.model.Docente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/docente")

public class DocenteController {
	@GetMapping("/listar")
    public String listarDocentes(Model model) {
        List<Docente> docentes = DocenteCollection.listarDocentes();
        model.addAttribute("docentes", docentes);
        return "listarDocentes"; // nombre de la vista
    }

    @GetMapping("/form")
    public String mostrarFormularioDocente(Model model) {
        model.addAttribute("docente", new Docente());
        return "formDocente"; // nombre de la vista
    }

    @PostMapping("/agregar")
    public String agregarDocente(@ModelAttribute Docente docente) {
        DocenteCollection.agregarDocente(docente);
        return "redirect:/docente/listar";
    }

    @GetMapping("/eliminar/{legajo}")
    public String eliminarDocente(@PathVariable String legajo) {
        DocenteCollection.eliminarDocente(legajo);
        return "redirect:/docente/listar";
    }

    @PostMapping("/modificar")
    public String modificarDocente(@ModelAttribute Docente docente) {
        DocenteCollection.modificarDocente(docente);
        return "redirect:/docente/listar";
    }
}
