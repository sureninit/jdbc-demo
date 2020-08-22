package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.utl.DBUtil;

public class InsertDemo {
	public static final String SQL="insert into user_tbl(user_name,password) values('user4','pass')";


	public static void main(String[] args) {
		try(
				Connection con=DBUtil.getConnection();
				Statement st = con.createStatement();
				){
			st.executeUpdate(SQL);
			System.out.println("data inserted.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
