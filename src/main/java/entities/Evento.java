package entities;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Eventi")
public class Evento {
	@Id
	@GeneratedValue
	private UUID id;
	private String titolo;
	private LocalDate dataEvento;
	private String descrizione;
	private TipoEvento tipoEvento;

	public enum TipoEvento {
		PUBBLICO, PRIVATO
	}

	// Più eventi possono avere più partecipazioni
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Partecipazione> setPartecipazioni;

	// Un evento puo avvenire in una sola location
	@ManyToOne
	private Location location;

	public Evento(String titolo, LocalDate dataEvento, String descrizione,
			TipoEvento tipoEvento) {

		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
	}

}
