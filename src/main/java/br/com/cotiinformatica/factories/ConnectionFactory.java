package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() throws Exception {

		/*
		 * Class.forName("org.postgresql.Driver"); return DriverManager.getConnection(
		 * "jdbc:postgresql://localhost:5433/bd_java_projeto03", "postgres", "coti");
		 */

		String driver = "org.postgresql.Driver";
		String host = "jdbc:postgresql://localhost:5433/bd_agendacontatos";
		String user = "postgres";
		String password = "coti";

		Class.forName(driver);
		return DriverManager.getConnection(host, user, password);

	}
	
}
