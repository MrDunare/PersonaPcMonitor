package it.softwareinside.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareinside.app.models.Persona;
import it.softwareinside.app.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	/**
	 * metodo per aggiungere una persona(e conteporaneamente
	 * un pc ed un monitor)
	 * 
	 * @param persona
	 * @return
	 */
	public boolean addPersona(Persona persona) {
		try {
			personaRepository.save(persona);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * metodo per cancellare per ID
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id) {
		try {
			personaRepository.deleteById(id);;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * metodo per cancellare tutte le persone dal database
	 * @return
	 */
	public boolean delete() {
		try {
			personaRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * metodo per mostrare a video le persone presenti 
	 * nel database
	 * 
	 * @return
	 */
	public Iterable<Persona> getPersone() {
		return personaRepository.findAll();
		
	}
	
	/**
	 * metodo per mostrare a video una persona 
	 * specifica in base all'id
	 * 
	 * @param id
	 * @return
	 */
	public Persona getPersona(int id) {
		Persona tmp = personaRepository.findById(id).get();
		return tmp;
	}
	
	public boolean update(Persona persona) {
		
		return addPersona(persona);
		
		
	}
}
