package com.ssi.seek.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * To establish the connection for Oracle DB
 * @author Tisawudii
 * */
public class Connection2OracleDB{
	
	private Connection con;
	
	private String user = "tisawudii";
	private String password = "tisawudii";
	private String className = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public void ConnectOracle(){
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public Connection getCon(){
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e){
			con = null;
			e.printStackTrace();
		}
		return con;
	}
	
	public void closed(){
		try{
			if(con != null)
				con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Connection2OracleDB c = new Connection2OracleDB();
		c.ConnectOracle();
		c.getCon();
		c.closed();
	}
	
}