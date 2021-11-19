package com.eep.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Alumno;
import com.eep.model.Animal;
import com.eep.model.Asignatura;
import com.eep.model.Profesor;

@Controller
@RequestMapping("/ejercicios")
public class obtenerAlumnosController {
	final String plantillaActividad2 = "actividad2";

	@GetMapping("/ejercicio3")
	public String actividad3(Model model) {
		Asignatura asignatura1 = new Asignatura("Acceso a Datos", new Profesor("Mario", "Aguirre Sanz"));
		model.addAttribute("nombre", "EEP iGroup");
		model.addAttribute("asignatura", asignatura1);
		model.addAttribute("alumnos", getAlumno());
		return plantillaActividad2;
	}

	@RequestMapping(value = "/ejercicio3mav", method = RequestMethod.GET)
	public ModelAndView actividad3MAV() {
		Asignatura asignatura1mav = new Asignatura("PSP", new Profesor("Mario", "Aguirre Sanz"));
		ModelAndView mav = new ModelAndView(plantillaActividad2);
		mav.addObject("nombre", "EEP iGroup");
		mav.addObject("asignatura", asignatura1mav);
		mav.addObject("alumnos", getAlumno());
		return mav;
	}

	private List<Alumno> getAlumno() {
		List<Alumno> listaPersonas = new ArrayList<Alumno>();
		listaPersonas.add(new Alumno("Pepe", "García Muro"));
		listaPersonas.add(new Alumno("Juan", "Miró Dar"));
		listaPersonas.add(new Alumno("Rodrigo", "López Gonzalez"));
		listaPersonas.add(new Alumno("Andrés", "Giménez Gutiérrez"));
		listaPersonas.add(new Alumno("Pablo", "Lorenzo Saus"));
		listaPersonas.add(new Alumno("Álvaro", "Ronas López"));
		return listaPersonas;
	}

	@GetMapping("/veranimalclasico")
	public ModelAndView animalClasico(@RequestParam(name = "nombre", required = false) String nombre,
			@RequestParam(name = "edad", required = false) int edad,
			@RequestParam(name = "raza", required = false) String raza,
			@RequestParam(name = "codigoChip", required = false) int codigoChip) {
		ModelAndView mav = new ModelAndView(plantillaActividad2);
		Animal p1 = new Animal(nombre, edad, raza, codigoChip);
		Asignatura asignatura1mav = new Asignatura("PSP", new Profesor("Mario", "Aguirre Sanz"));
		mav.addObject("nombre", "EEP iGroup");
		mav.addObject("asignatura", asignatura1mav);
		mav.addObject("alumnos", getAlumno());
		mav.addObject("animal", p1);
		return mav;
	}

	@GetMapping("/veranimal/{nombre_animal}/{edad}/{raza}/{codigoChip}")
	public ModelAndView animalClasico1(@PathVariable("nombre_animal") String nombre, @PathVariable("edad") int edad,
			@PathVariable("raza") String raza, @PathVariable("codigoChip") int codigoChip) {
		ModelAndView mav = new ModelAndView(plantillaActividad2);
		Asignatura asignatura1mav = new Asignatura("PSP", new Profesor("Mario", "Aguirre Sanz"));
		mav.addObject("nombre", "EEP iGroup");
		mav.addObject("asignatura", asignatura1mav);
		mav.addObject("alumnos", getAlumno());
		mav.addObject("animal1", new Animal(nombre, edad, raza, codigoChip));
		return mav;
	}

}
