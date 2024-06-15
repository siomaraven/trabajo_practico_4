package ar.edu.unju.fi.controller;

import ar.edu.unju.fi.collections.AlumnoCollection;
import ar.edu.unju.fi.collections.CarreraCollection;
import ar.edu.unju.fi.collections.MateriaCollection;
import ar.edu.unju.fi.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@GetMapping("/inscripcion")
	public String mostrarFormularioInscripcion(Model model) {
        model.addAttribute("carreras", CarreraCollection.listar());
        model.addAttribute("materias", MateriaCollection.listar());
        model.addAttribute("alumno", new Alumno(null, null, null, null, null, null, null, null));
        return "carrera";
    }
	
	@GetMapping
    public String listarAlumnos(Model model) {
        model.addAttribute("alumnos", AlumnoCollection.listar());
        return "alumno";
    }

    @PostMapping("/agregar")
    public String agregarAlumno(@ModelAttribute Alumno alumno) {
        AlumnoCollection.agregar(alumno);
        return "redirect:/alumnos";
    }

    @PostMapping("/modificar")
    public String modificarAlumno(@ModelAttribute Alumno alumno) {
        AlumnoCollection.modificar(alumno);
        return "redirect:/alumnos";
    }
    
    @GetMapping("/eliminar/{dni}")
    public String eliminarAlumno(@PathVariable String dni) {
        AlumnoCollection.eliminar(dni);
        return "redirect:/alumnos";
    }
}
