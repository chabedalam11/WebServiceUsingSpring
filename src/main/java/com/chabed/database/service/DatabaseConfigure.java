package com.chabed.database.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConfigure {
	
    public Connection getConnection() {
    	Connection connection = null;
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "","");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return connection;
    	/*if (connection != null) {
    		System.out.println("You made it, take control your database now!");
    		return connection;
		} else {
			System.out.println("Failed to make connection!");
			return null;
		}*/
    }
}
