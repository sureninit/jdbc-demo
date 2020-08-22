package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.utl.DBUtil;

public class SelectDemo {

	public static final String SQL="select * from user_tbl";


	public static void main(String[] args) {
		try(
				Connection con=DBUtil.getConnection();
				Statement st = con.createStatement();
				){
			ResultSet rs = st.executeQuery(SQL);
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
				System.out.println("==============================");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
