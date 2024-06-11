package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.*;
import java.util.ArrayList;

public class MateriaCollection {
	public static ArrayList<Materia> materias = new ArrayList<>();
	
	public static void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public static Materia buscarMateria(String codigo) {
        for (Materia materia : materias) {
            if (materia.getCodigo().equals(codigo)) {
                return materia;
            }
        }
        return null;
    }

    public static void eliminarMateria(String codigo) {
        Materia materia = buscarMateria(codigo);
        if (materia != null) {
            materias.remove(materia);
        }
    }

    public static ArrayList<Materia> listarMaterias() {
        return materias;
    }

    public static void modificarMateria(Materia materiaModificada) {
        Materia materia = buscarMateria(materiaModificada.getCodigo());
        if (materia != null) {
            int index = materias.indexOf(materia);
            materias.set(index, materiaModificada);
        }
    }
}
