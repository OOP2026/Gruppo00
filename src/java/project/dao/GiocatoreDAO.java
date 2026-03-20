package project.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import project.model.Acquisto;
import project.model.Borsa;
import project.model.Giocatore;
import project.model.Societa;

public interface GiocatoreDAO {

	/**
	 * Acquista.
	 *
	 * @param i the i
	 * @param now the now
	 * @param prezzo the prezzo
	 * @param societa the societa
	 */
	void acquistaDB(Giocatore g, int quantita, LocalDate now, float prezzo, Societa societa);


}