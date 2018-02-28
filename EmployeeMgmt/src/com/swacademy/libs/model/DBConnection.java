package com.swacademy.libs.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private Properties info;
	public DBConnection() {
		this.info = new Properties();
		try {
			InputStream is = new FileInputStream(new File("./dbinfo.properties"));
			info.load(is);
		}catch(IOException ex) { ex.printStackTrace(); }
	}
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(this.info.getProperty("DBDRIVER"));
			conn = DriverManager.getConnection(this.info.getProperty("DBURL"),
					                                            this.info.getProperty("DBUSER"),
					                                            this.info.getProperty("DBPWD"));
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
