package com.eep.model;

public class Asignatura {
	private String nombre;
	private Profesor profesorTitular;

	public Asignatura() {
	}

	public Asignatura(String nombre, Profesor profesorTitular) {
		this.nombre = nombre;
		this.profesorTitular = profesorTitular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesorTitular() {
		return profesorTitular;
	}

	public void setProfesorTitular(Profesor profesorTitular) {
		this.profesorTitular = profesorTitular;
	}
}
