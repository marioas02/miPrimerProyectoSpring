package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Asignatura;
import com.eep.model.Profesor;

@Controller
@RequestMapping("/ejercicios")
public class ProfesorAsignaturaController {
	final String plantillaActividad2 = "actividad2";

	// HOLAAA
	@GetMapping("/ejercicio2")
	public String actividad2(Model model) {
		Asignatura asignatura1 = new Asignatura("Acceso a Datos", new Profesor("Mario", "Aguirre Sanz"));
		model.addAttribute("nombre", "EEP iGroup");
		model.addAttribute("asignatura", asignatura1);
		return plantillaActividad2;
	}

	@RequestMapping(value = "/ejercicio2mav", method = RequestMethod.GET)
	public ModelAndView actividad2MAV() {
		Asignatura asignatura1mav = new Asignatura("PSP", new Profesor("Mario", "Aguirre Sanz"));
		ModelAndView mav = new ModelAndView(plantillaActividad2);
		mav.addObject("nombre", "EEP iGroup");
		mav.addObject("asignatura", asignatura1mav);
		return mav;
	}
}