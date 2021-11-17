package com.eep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Persona;

@Controller
@RequestMapping("/ejemplos")
public class PasoNombreController {
	final String plantillaPasoValor = "ejemplopasovalorcomplejo";

	@GetMapping("/hola")
	public String helloWorld(Model model) {
		Persona p1 = new Persona();
		p1.setNombre("Sergio Aguirre");
		p1.setEdad(19);
		model.addAttribute("persona", p1);
		return plantillaPasoValor;
	}

	@RequestMapping(value = "/holaaa", method = RequestMethod.GET)
	public ModelAndView helloWorldMAV() {
		Persona p2 = new Persona();
		p2.setNombre("Mario Aguirre");
		p2.setEdad(19);
		ModelAndView mav = new ModelAndView(plantillaPasoValor);
		mav.addObject("persona", p2);
		return mav;
	}
}
