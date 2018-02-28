package kr.co.bitcamp.libs.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private Properties dbinfo;
	public DBConnection() {
		this.dbinfo = new Properties();
		try {
			this.dbinfo.load(new FileInputStream(
					                     new File("./dbinfo.properties")));
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
	}
	public Connection getConnection() {
		try {
			Class.forName(this.dbinfo.getProperty("DBDRIVER"));
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					       this.dbinfo.getProperty("DBURL"), 
					       this.dbinfo.getProperty("DBUSER"), 
					       this.dbinfo.getProperty("DBPWD"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}





