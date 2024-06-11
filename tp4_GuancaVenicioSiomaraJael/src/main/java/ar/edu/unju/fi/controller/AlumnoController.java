package ar.edu.unju.fi.controller;

import ar.edu.unju.fi.collections.AlumnoCollection;
import ar.edu.unju.fi.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	@GetMapping("/listar")
    public String listarAlumnos(Model model) {
        List<Alumno> alumnos = AlumnoCollection.listarAlumnos();
        model.addAttribute("alumnos", alumnos);
        return "listarAlumnos"; // nombre de la vista
    }

    @GetMapping("/form")
    public String mostrarFormularioAlumno(Model model) {
        model.addAttribute("alumno", new Alumno());
        return "formAlumno"; // nombre de la vista
    }

    @PostMapping("/agregar")
    public String agregarAlumno(@ModelAttribute Alumno alumno) {
        AlumnoCollection.agregarAlumno(alumno);
        return "redirect:/alumno/listar";
    }

    @GetMapping("/eliminar/{dni}")
    public String eliminarAlumno(@PathVariable String dni) {
        AlumnoCollection.eliminarAlumno(dni);
        return "redirect:/alumno/listar";
    }

    @PostMapping("/modificar")
    public String modificarAlumno(@ModelAttribute Alumno alumno) {
        AlumnoCollection.modificarAlumno(alumno);
        return "redirect:/alumno/listar";
    }
}
