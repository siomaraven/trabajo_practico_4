package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.*;
import java.util.ArrayList;
import java.util.List;

public class MateriaCollection {
	public static ArrayList<Materia> materias = new ArrayList<>();
	
	static {
		materias.add(new Materia("FI101", "Progración Visual", 1, 4, "presencial", null, null));
        materias.add(new Materia("FI101", "Física I", 1, 4, "virtual", null, null));
	}
	
	 public static List<Materia> listar() {
	        return materias;
	}

	 public static Materia buscar(String codigo) {
	        return materias.stream().filter(m -> m.getCodigo().equals(codigo)).findFirst().orElse(null);
	}

	 public static void agregar(Materia materia) {
	        materias.add(materia);
	}


	 public static void modificar(Materia materia) {
	        Materia existente = buscar(materia.getCodigo());
	        if (existente != null) {
	            existente.setNombre(materia.getNombre());
	            existente.setCurso(materia.getCurso());
	            existente.setCanthoras(materia.getCanthoras());
	            existente.setModalidad(materia.getModalidad());
	            existente.setDocente(materia.getDocente());
	            existente.setCarrera(materia.getCarrera());
	        }
	}

	 public static void eliminar(String codigo) {
	        materias.removeIf(m -> m.getCodigo().equals(codigo));
	    }
	}