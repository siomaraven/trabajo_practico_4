package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import ar.edu.unju.fi.model.Carrera;

public class CarreraCollection {
	public static ArrayList<Carrera> carreras = new ArrayList<>();

    public static void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public static Carrera buscarCarrera(String codigo) {
        for (Carrera carrera : carreras) {
            if (carrera.getCodigo().equals(codigo)) {
                return carrera;
            }
        }
        return null;
    }

    public static void eliminarCarrera(String codigo) {
        Carrera carrera = buscarCarrera(codigo);
        if (carrera != null) {
            carreras.remove(carrera);
        }
    }

    public static ArrayList<Carrera> listarCarreras() {
        return carreras;
    }

    public static void modificarCarrera(Carrera carreraModificada) {
        Carrera carrera = buscarCarrera(carreraModificada.getCodigo());
        if (carrera != null) {
            int index = carreras.indexOf(carrera);
            carreras.set(index, carreraModificada);
        }
    }
}
