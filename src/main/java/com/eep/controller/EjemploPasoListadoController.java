package com.eep.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eep.model.Persona;

@Controller
@RequestMapping("/ejemplos")
public class EjemploPasoListadoController {
	final String plantillaPasoValor = "ejemplopasolistado";

	@GetMapping("/ejemplo3")
	public String helloWorld(Model model) {
		model.addAttribute("personas", getPersonas());
		return "ejemplopasolistado";
	}

	@RequestMapping(value = "/ejemplo3mav", method = RequestMethod.GET)
	public ModelAndView helloWorldMAV() {
		ModelAndView mav = new ModelAndView(plantillaPasoValor);
		mav.addObject("personas", getPersonas());
		return mav;
	}

	private List<Persona> getPersonas() {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("Pepe", 38));
		listaPersonas.add(new Persona("Juan", 28));
		listaPersonas.add(new Persona("Rodrigo", 18));
		listaPersonas.add(new Persona("Andrés", 24));
		listaPersonas.add(new Persona("Pablo", 35));
		listaPersonas.add(new Persona("Álvaro", 17));
		return listaPersonas;
	}
}
