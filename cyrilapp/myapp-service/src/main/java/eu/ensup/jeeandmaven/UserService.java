package eu.ensup.jeeprojet.service;

import java.sql.SQLException;

import eu.ensup.jeeprojet.dao.gestionUserDao;
import eu.ensup.jeeprojet.domaine.User;

public class UserService {
	public boolean enregistrerUtilisateur(User pUser) throws ClassNotFoundException, SQLException {
		//utiliser la méthhode de cration dao
		gestionUserDao gestion = new gestionUserDao();
		gestion.createUser(pUser);
		return true;

	}
}
