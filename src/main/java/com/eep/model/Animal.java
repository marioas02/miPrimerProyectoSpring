package com.eep.model;

public class Animal {
	private String nombre;
	private int edad;
	private String raza;
	private int codigoChip;

	public Animal() {
	}

	public Animal(String nombre, int edad, String raza, int codigoChip) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.codigoChip = codigoChip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getCodigoChip() {
		return codigoChip;
	}

	public void setCodigoChip(int codigoChip) {
		this.codigoChip = codigoChip;
	}

}
