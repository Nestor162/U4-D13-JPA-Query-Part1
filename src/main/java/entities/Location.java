package entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

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

	public Location(String nome, String citta) {
		this.nome = nome;
		this.citta = citta;
	}

}
