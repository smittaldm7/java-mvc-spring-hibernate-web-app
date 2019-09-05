package com.springmvc.util;

import java.sql.Connection;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBConnection2 {
	public static Connection createConnection() {
		Connection con = null;
		
		MysqlDataSource d = new MysqlDataSource();
	    
		d.setUser("root");
	    d.setPassword("");
	    
	    //d.setUrl("jdbc:mysql://localhost:3306/jee-mvc");
	    d.setDatabaseName("jee-mvc");
		
		try {
			
		    con =  (Connection) d.getConnection();
			
			//System.out.println("Printing connection object "+con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
