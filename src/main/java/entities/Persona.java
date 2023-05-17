package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Persona {
	private UUID id;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataNascita;
	private Sesso sesso;
	private Partecipazione listaPartecipazioni;

	public enum Sesso {
		Maschio, Femmina
	}
}
