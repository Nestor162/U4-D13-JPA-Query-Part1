package app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.EventoDAO;
import entities.Evento;
import entities.Evento.TipoEvento;
import utils.JpaUtil;

public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();

		EventoDAO ed = new EventoDAO(em);

		Evento evento1 = new Evento("Lezione EPICODE", LocalDate.now(),
				"Lezione di JAVA JPA", TipoEvento.PRIVATO);

		// save
//		ed.save(evento1);

		System.out.println();

		// getById
		ed.getById("d59f8c27-8ff5-4324-92d6-20a44c448305");

		System.out.println();

		// delete
//		ed.delete("2ee51ab8-1b3e-4fde-9008-3fda686590f7");

		System.out.println();

		// refresh
		ed.refresh("d59f8c27-8ff5-4324-92d6-20a44c448305");

		em.close();
		emf.close();
	}

}
