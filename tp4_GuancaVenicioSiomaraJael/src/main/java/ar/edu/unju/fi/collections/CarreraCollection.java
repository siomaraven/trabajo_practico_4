package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Carrera;

public class CarreraCollection {
	public static ArrayList<Carrera> carreras = new ArrayList<>();

	static {
        carreras.add(new Carrera("FI01", "Ingeniería Informática", 5, "Activa"));
        carreras.add(new Carrera("FI02", "Licenciatura en Sistemas", 4, "Activa"));
    }

	public static List<Carrera> listar() {
        return carreras;
    }

	public static Carrera buscar(String codigo) {
        return carreras.stream().filter(c -> c.getCodigo().equals(codigo)).findFirst().orElse(null);
    }
	
	public static void agregar(Carrera carrera) {
        carreras.add(carrera);
    }

	public static void modificar(Carrera carrera) {
        Carrera existente = buscar(carrera.getCodigo());
        if (existente != null) {
            existente.setNombre(carrera.getNombre());
            existente.setCantidadAños(carrera.getCantidadAños());
            existente.setEstado(carrera.getEstado());
        }
    }

    public static void eliminar(String codigo) {
        carreras.removeIf(c -> c.getCodigo().equals(codigo));
    }
}
