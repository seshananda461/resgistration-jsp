package com.trendtech.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trendtech.registration.db.DBConnection;

@WebServlet("/loginReg")
public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 162933046825549329L;
	/**
	 * 
	 * 
	 */
	
	@Override
	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String userInsert ="insert into user_tb(first_name,middle_name ,last_name ,user_name ,user_password ,email ,contact_number ,created_date ,dob ) values(?,?,?,?,?,?,?,?,?)";
		String fname = request.getParameter("fName");
		String mname = request.getParameter("mName");
		String lname = request.getParameter("lName");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String contactnumber = request.getParameter("cNumber");
		String dob =request.getParameter("dob");
		
		Connection  conn =	DBConnection.getConnection();
		try {
			PreparedStatement stmt =conn.prepareStatement(userInsert);
			stmt.setString(1, fname);
			stmt.setString(2, mname);
			stmt.setString(3, lname);
			stmt.setString(4, username);
			stmt.setString(5, password);
			stmt.setString(6, email);
			stmt.setString(7, contactnumber);
			stmt.setTimestamp(8, Timestamp.valueOf(LocalDateTime.now()));
			stmt.setDate(9, new Date(239424l));
			stmt.executeUpdate();
			System.out.println("Executed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if(name.isEmpty() || 
//				password.isEmpty() ||email.isEmpty() ){
//			HttpSession session =request.getSession();
//			session.setAttribute("name",name);
//			response.sendRedirect("SuccessPage");
//        }
    
		
	}
}
