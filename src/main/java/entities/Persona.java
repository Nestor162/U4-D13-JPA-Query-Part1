package entities;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Persona {
	@Id
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

	public Persona(String nome, String cognome, String email,
			LocalDate dataNascita, Sesso sesso,
			Partecipazione listaPartecipazioni) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
		this.listaPartecipazioni = listaPartecipazioni;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+ ", email=" + email + ", dataNascita=" + dataNascita
				+ ", sesso=" + sesso + ", listaPartecipazioni="
				+ listaPartecipazioni + "]";
	}

}
