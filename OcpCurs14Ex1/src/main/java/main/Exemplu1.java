package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplu1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/ocp8curs14";
		String user = "root";
		String pass = "";
		
		try(Connection con = DriverManager.getConnection(url, user, pass)) {
			System.out.println("S-a deschis o conexiune la MySQL");
			Statement stmt = con.createStatement();
			
			// INSERT, UPDATE, DELETE
			int res = stmt.executeUpdate("INSERT INTO product VALUES (NULL, 'cioco', 10)");
			System.out.println(res);
			// execute () ---> any SQL   true/false
			// executeQuery() ---> SELECT ---> ResultSet
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
