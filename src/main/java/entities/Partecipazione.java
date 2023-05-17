package entities;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Partecipazione {
	@Id
	private UUID id;
	private Persona persona;
	private Evento evento;
	private Stato stato;

	public enum Stato {
		CONFERMATA, DA_CONFERMARE
	}

	@ManyToMany(mappedBy = "setPartecipazioni")
	private Set<Evento> eventi;

	public Partecipazione(Persona persona, Evento evento, Stato stato) {

		this.persona = persona;
		this.evento = evento;
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "Partecipazione [id=" + id + ", persona=" + persona + ", evento="
				+ evento + ", stato=" + stato + "]";
	}

}
