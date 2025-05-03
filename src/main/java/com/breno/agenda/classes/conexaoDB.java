package com.breno.agenda.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDB {
	
	 private static final String url = "jdbc:mysql://localhost:3306/Contato";
	 private static final String usuario = "root";
	 private static final String senha = "123";
	 
	 public static Connection getConnection() throws SQLException {
		 return DriverManager.getConnection(url, usuario, senha);
	 }

}
