package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class DocenteCollection {
	public static ArrayList<Docente> docentes = new ArrayList<>();

	static {
        docentes.add(new Docente(1, "Carlos", "Lopez", "carlos.lopez@example.com", "123123123"));
        docentes.add(new Docente(2, "María", "Fernandez", "maria.fernandez@example.com", "321321321"));
    }

	public static List<Docente> listar() {
        return docentes;
    }
	
	public static Docente buscar(int legajo) {
        return docentes.stream().filter(d -> d.getLegajo() == legajo).findFirst().orElse(null);
    }

    public static void agregar(Docente docente) {
        docentes.add(docente);
    }

    public static void modificar(Docente docente) {
        Docente existente = buscar(docente.getLegajo());
        if (existente != null) {
            existente.setNombre(docente.getNombre());
            existente.setApellido(docente.getApellido());
            existente.setEmail(docente.getEmail());
            existente.setTelefono(docente.getTelefono());
        }
    }

    public static void eliminar(int legajo) {
        docentes.removeIf(d -> d.getLegajo() == legajo);
    }
}
