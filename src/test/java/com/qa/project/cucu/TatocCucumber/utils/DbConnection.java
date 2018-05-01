package com.qa.project.cucu.TatocCucumber.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	public static Connection con;
	public static Statement stmt;
	public static void db_Connection(String dbDriver, String url, String userName, String password) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url, userName ,password);
	stmt = con.createStatement();
	}
}
