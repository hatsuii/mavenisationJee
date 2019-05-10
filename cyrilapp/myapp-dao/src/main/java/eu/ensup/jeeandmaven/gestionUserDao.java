package eu.ensup.jeeprojet.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import eu.ensup.jeeprojet.domaine.User;

public class gestionUserDao {

	private Statement st = null;
	private UserDao connect = new UserDao();
	
	public void createUser(User puser) throws ClassNotFoundException, SQLException {

			Connection cn = connect.getInstance();
			st = cn.createStatement();
			String sql = "INSERT INTO `user` (`login`,`pwd`) VALUES ('" + puser.getLogin() + "','"
					+ puser.getPwd() +"')";
			st.executeUpdate(sql);

		
	}
}
