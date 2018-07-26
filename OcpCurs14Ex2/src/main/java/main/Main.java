package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 * SQL Injection
 * 
 * SELECT * FROM user WHERE username = '' OR 1 OR '' AND password = '_______'
 *
 */
public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/ocp8curs14";
		String user = "root";
		String pass = "";
		try (
			Connection con = DriverManager.getConnection(url, user, pass);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr)) {
			
			System.out.print("Command: ");
			String cmd = in.readLine();
			
			while (!cmd.equals("exit")) {
				String [] info = cmd.split("\\s+");
				String name = info[0];
				double price = Double.parseDouble(info[1]);
				
				String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, name);
				stmt.setDouble(2, price);
				
				stmt.executeUpdate();
				
				System.out.println("A fost adaugat produsul " + cmd);
				
				System.out.print("Command: ");
				cmd = in.readLine();
			}
			
			System.out.println("Aplicatia se inchide...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
