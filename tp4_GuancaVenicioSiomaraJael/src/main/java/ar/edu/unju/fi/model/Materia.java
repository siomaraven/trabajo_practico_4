package ar.edu.unju.fi.model;

public class Materia{
	private String codigo;
	private String nombre;
	private int curso;
	private int cantidadHoras;
	private String modalidad;
	private Docente docente;
	private Carrera carrera;


	public Materia(String codigo, String nombre, int curso, int cantidadHoras, String modalidad, Docente docente,
			Carrera carrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCanthoras() {
		return cantidadHoras;
	}

	public void setCanthoras(int canthoras) {
		this.cantidadHoras = canthoras;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
}
