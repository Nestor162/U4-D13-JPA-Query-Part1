package entities;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Location {
	@Id
	private UUID id;
	private String nome;
	private String citta;

	@OneToMany(mappedBy = "location")
	private Set<Evento> listaEventi;

	public Location(String nome, String citta) {
		this.nome = nome;
		this.citta = citta;
	}

}
