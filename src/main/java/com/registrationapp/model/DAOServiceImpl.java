package com.registrationapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	Statement stmnt;
	
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_jan_db","root","root");
			 stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt .executeQuery("SELECT * FROM login WHERE email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void addRegistration(String name, String course, String email, String mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRegistration(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRegistration(String mobile, String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void logOut() {
		// TODO Auto-generated method stub

	}

}
