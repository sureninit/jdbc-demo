package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDbDemo {
	public static final String SQL="create database user_db";
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/";
	public static final String USER_NAME="root";
	public static final String PASSWORD="1234";

	public static void main(String[] args) {
		try(
				Connection con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();
				){
			st.executeUpdate(SQL);
			System.out.println("db created.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
