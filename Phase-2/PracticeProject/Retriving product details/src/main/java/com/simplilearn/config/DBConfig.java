package com.simplilearn.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

	private Connection connection;
	
	public DBConfig(String driver,String url,String user,String pwd) throws ClassNotFoundException,SQLException
	{	
		Class.forName(driver);
		this.connection= DriverManager.getConnection(url,user,pwd);
	}

	public Connection getConnection() {
		return connection;
	}
	
	public void closeConnection() throws SQLException
	{
		this.connection.close();
	}
}
