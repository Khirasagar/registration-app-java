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

	/**
	 *
	 */
	@Override
	public void addRegistration(String name, String email, String course, String mobile) {
		try {
			stmnt .executeUpdate(" insert into registration (name,email,course,mobile) values('"+name+"','"+email+"','"+course+"','"+mobile+"') ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteRegistration(String email) {
		try {
			stmnt.executeUpdate(" DELETE FROM registration WHERE email= '"+email+"' ");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	@Override
	public void updateRegistration(String mobile, String email) {
		try {
			stmnt.executeUpdate("UPDATE registration SET mobile='"+mobile+"' WHERE email='"+email+"'  ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logOut() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultSet listRegistration() {
	try {	
		ResultSet result = stmnt .executeQuery("SELECT * FROM registration");
		return result;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

}
