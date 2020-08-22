package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.utl.DBUtil;

public class CreateTableDemo {

	public static final String SQL="create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(45), primary key(id))";


	public static void main(String[] args) {
		try(
				Connection con=DBUtil.getConnection();
				Statement st = con.createStatement();
				){
			st.executeUpdate(SQL);
			System.out.println("table created.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
