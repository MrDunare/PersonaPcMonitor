package it.softwareinside.app.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Persona {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "pc_id")
	private Pc pc;

	public Persona(String nome, String cognome, Pc pc) {
		setNome(cognome);
		setNome(cognome);
		setPc(pc);
	}
	
	
	
	
	
}
