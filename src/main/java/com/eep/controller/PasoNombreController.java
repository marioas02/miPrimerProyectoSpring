package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Escuela;

@Controller
@RequestMapping("/ejercicios")
public class PasoNombreController {
	final String plantillaActividad2 = "actividad2";

	@GetMapping("/ejercicio1")
	public String helloWorld(Model model) {
		Escuela eep = new Escuela();
		eep.setNombre("EEP iGroup");
		model.addAttribute("escuela", eep);
		return plantillaActividad2;
	}

	@RequestMapping(value = "/ejercicio1mav", method = RequestMethod.GET)
	public ModelAndView helloWorldMAV() {
		ModelAndView mav = new ModelAndView(plantillaActividad2);
		Escuela eep = new Escuela();
		eep.setNombre("EEP iGroup");
		mav.addObject("nombre", eep);
		return mav;
	}
}
