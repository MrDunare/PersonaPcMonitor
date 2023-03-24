package it.softwareinside.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.app.models.Persona;
import it.softwareinside.app.service.PersonaService;

@RequestMapping("/api")

@RestController
public class RestController3 {
	
	@Autowired
	PersonaService personaService;
	
	@PostMapping("/add")
	public boolean addPersona(@RequestBody Persona persona) {
		personaService.addPersona(persona);
		return true;
	}
	
	@DeleteMapping("/deleteId")
	public boolean deleteId(@RequestParam ("id") int id) {
		return personaService.delete(id);
	}
	@DeleteMapping("/deleteAll")
	public boolean deleteId() {
		return personaService.delete();
	}
	@GetMapping("/getPersonaId")
	public Persona getPersonaId(@RequestParam("id") int id) {
		return personaService.getPersona(id);
	}
	@GetMapping("/getPersone")
	public Iterable<Persona> getPersone() {
		return personaService.getPersone();
	}
	@GetMapping("/update")
	public boolean update(@RequestBody Persona persona) {
		
		return personaService.addPersona(persona);
	}
}
