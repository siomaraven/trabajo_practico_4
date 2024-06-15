package ar.edu.unju.fi.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class AlumnoCollection {
	public static ArrayList<Alumno> alumnos = new ArrayList<>();

	static {
        alumnos.add(new Alumno("12345678", "Lucas", "Ramirez", "lucasram@example.com", "123456789", LocalDate.of(1995, 5, 10), "Calle Falsa 123", "LU001"));
        alumnos.add(new Alumno("27654321", "Leonel", "Garcia", "leogarcia@example.com", "987654321", LocalDate.of(1998, 3, 25), "Calle Verdadera 456", "LU002"));
    }

    public static List<Alumno> listar(){
    	return alumnos;
    }

    public static Alumno buscar(String dni){
    	return alumnos.stream().filter(a -> a.getDni().equals(dni)).findFirst().orElse(null);
    }

    public static void agregar (Alumno alumno) {
    	alumnos.add(alumno);
    }

    public static void modificar(Alumno alumno) {
        Alumno existente = buscar(alumno.getDni());
        if (existente != null) {
            existente.setNombre(alumno.getNombre());
            existente.setApellido(alumno.getApellido());
            existente.setEmail(alumno.getEmail());
            existente.setTelefono(alumno.getTelefono());
            existente.setFechaNacimiento(alumno.getFechaNacimiento());
            existente.setDomicilio(alumno.getDomicilio());
            existente.setLu(alumno.getLu());
        }
    }

    public static void eliminar(String dni) {
        alumnos.removeIf(a -> a.getDni().equals(dni));
    }
}
