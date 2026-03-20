package project.dao;

import java.sql.Connection;

import project.model.Borsa;
import project.model.Listino;
import project.model.Societa;

public interface ListinoDAO {

	public void addSocietaDB(Societa s, Borsa b);

	public Listino leggiListinoDB(Borsa b);

}