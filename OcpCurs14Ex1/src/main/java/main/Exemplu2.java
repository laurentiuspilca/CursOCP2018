package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplu2 {

	
	public static void main(String[] args) throws ClassNotFoundException {
		String sql = "SELECT * FROM product";
		
		String url = "jdbc:mysql://localhost/ocp8curs14";
		String user = "root";
		String pass = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try(Connection con = DriverManager.getConnection(url, user, pass)) {
			System.out.println("S-a deschis o conexiune la MySQL");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.absolute(3);
			while (rs.previous()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				
				System.out.println(id + " " + name + " " + price);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
