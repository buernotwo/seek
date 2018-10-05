package com.ssi.seek.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * To establish the connection for Oracle DB
 * @author Tisawudii
 * */
public class Connection2OracleDB{
	
	private static Connection con;
	
	private static String user = "tisawudii";
	private static String password = "tisawudii";
	private String className = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	public void ConnectOracle(){
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
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
	
	public static void BLOB2Image() throws SQLException{
		Connection con=Connection2OracleDB.getCon(); 
		Statement st=con.createStatement(); 
		String sql="select * from T_IMAGE"; 
		ResultSet rs=st.executeQuery(sql); 
		FileOutputStream outSTr = null;
		BufferedOutputStream Buff=null;
		while(rs.next())
		{
			try{
				Blob blob = rs.getBlob("Image");
				outSTr = new FileOutputStream(new File("F://OracleImage//110.png"));
				Buff=new BufferedOutputStream(outSTr); 
				Buff.write(blob.getBytes(1, (int)blob.length()));
				Buff.flush();
				Buff.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws SQLException{
		Connection2OracleDB c = new Connection2OracleDB();
		c.ConnectOracle();
		Connection2OracleDB.getCon();
		BLOB2Image();
		c.closed();
	}
	
}