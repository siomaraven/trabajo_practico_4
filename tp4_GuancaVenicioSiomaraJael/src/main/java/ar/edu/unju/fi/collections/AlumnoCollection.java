package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import ar.edu.unju.fi.model.Alumno;

public class AlumnoCollection {
	public static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public static Alumno buscarAlumno(String dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null;
    }

    public static void eliminarAlumno(String dni) {
        Alumno alumno = buscarAlumno(dni);
        if (alumno != null) {
            alumnos.remove(alumno);
        }
    }

    public static ArrayList<Alumno> listarAlumnos() {
        return alumnos;
    }

    public static void modificarAlumno(Alumno alumnoModificado) {
        Alumno alumno = buscarAlumno(alumnoModificado.getDni());
        if (alumno != null) {
            int index = alumnos.indexOf(alumno);
            alumnos.set(index, alumnoModificado);
        }
    }
}
