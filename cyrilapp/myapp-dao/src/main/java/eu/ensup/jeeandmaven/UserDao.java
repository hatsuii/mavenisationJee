package eu.ensup.jeeprojet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {
	private String url="jdbc:mysql://localhost:3306/utilisateurjee?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String login="root";
	private String passwd="";
	private Connection cn = null;
	
	public UserDao(){
		
	}
	public Connection getInstance() throws ClassNotFoundException, SQLException {

			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
		return cn;

	}

}
