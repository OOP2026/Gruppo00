package project.implementazioneDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import project.dao.GiocatoreDAO;
import project.dao.ListinoDAO;
import Database.ConnessioneDatabase;
import project.model.Acquisto;
import project.model.Borsa;
import project.model.Giocatore;
import project.model.Societa;

public class GiocatoreImplementazionePostgresDAO implements GiocatoreDAO {

	private Connection connection;

	public GiocatoreImplementazionePostgresDAO() {
		try {
			connection = ConnessioneDatabase.getInstance().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void acquistaDB(Giocatore g, int quantita, LocalDate now, float prezzo, Societa societa) {
		try {
			PreparedStatement nuovoAcquistoPS = connection.prepareStatement(
					"INSERT INTO \"Borsa\".\"Acquisto\" " + 
					"(\"Societa\", \"Giocatore\", \"Quantita\", \"Prezzo\")" +
					"VALUES ('"+societa.getNome()+"','"+g.getNome()+"', "+quantita+", "+prezzo+");");
			nuovoAcquistoPS.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
