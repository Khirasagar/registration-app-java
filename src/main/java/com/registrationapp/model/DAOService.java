package com.registrationapp.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyLogin(String email, String password);
	public void addRegistration(String name , String email , String course , String mobile);
	public void deleteRegistration(String email);
	public void updateRegistration(String mobile, String email);
	public void logOut();
	public ResultSet listRegistration();

}
