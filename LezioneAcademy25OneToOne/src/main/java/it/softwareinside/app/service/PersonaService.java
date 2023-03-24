package it.softwareinside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.app.models.Persona;
import it.softwareinside.app.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	public boolean addPersona(Persona persona) {
		try {
			personaRepository.save(persona);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean delete(int id) {
		try {
			personaRepository.deleteById(id);;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean delete() {
		try {
			personaRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Iterable<Persona> getPersone() {
		return personaRepository.findAll();
		
	}
	public Persona getPersona(int id) {
		Persona tmp = personaRepository.findById(id).get();
		return tmp;
	}
	
	public boolean update(Persona persona) {
		
		return addPersona(persona);
		
		
	}
}
