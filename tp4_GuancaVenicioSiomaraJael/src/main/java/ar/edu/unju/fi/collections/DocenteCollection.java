package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import ar.edu.unju.fi.model.Docente;

public class DocenteCollection {
	public static ArrayList<Docente> docentes = new ArrayList<>();

    public static void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    public static Docente buscarDocente(String legajo) {
        for (Docente docente : docentes) {
            if (docente.getLegajo().equals(legajo)) {
                return docente;
            }
        }
        return null;
    }

    public static void eliminarDocente(String legajo) {
        Docente docente = buscarDocente(legajo);
        if (docente != null) {
            docentes.remove(docente);
        }
    }

    public static ArrayList<Docente> listarDocentes() {
        return docentes;
    }

    public static void modificarDocente(Docente docenteModificado) {
        Docente docente = buscarDocente(docenteModificado.getLegajo());
        if (docente != null) {
            int index = docentes.indexOf(docente);
            docentes.set(index, docenteModificado);
        }
    }
}
